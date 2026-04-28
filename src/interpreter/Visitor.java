package interpreter;

import grammar.ExprLexer;
import grammar.ExprParser;
import grammar.ExprParserBaseVisitor;
import interpreter.types.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Visitor extends ExprParserBaseVisitor<Value> {
    private final Scopes<Value> memory = new Scopes<>();
    private final FunctionManager functionManager = new FunctionManager(memory);

    private <T> void print(T value) {
        System.out.println(value);
    }

    // visit() - заставляет программу спуститься глубже в дерево разбора и выполнить там соответствующую логику. Вызывает нужную функцию из определенных судя по типу ctx
    @Override
    public Value visitProgram(ExprParser.ProgramContext ctx) {
        // Сначала собираем все определения функций
        for (ExprParser.DefContext dContext : ctx.def()) {
            visit(dContext);
        }

        // Затем по порядку выполняем все stat
        for (ExprParser.StatContext sContext : ctx.stat()) {
            Value result = visit(sContext);
        }

        return new StringVal("Omae wa mou shindeiru");
    }


    // ##### STAT #####
    // 1. Декларация переменной
    @Override
    public Value visitDeclare(ExprParser.DeclareContext ctx) {
        Type expectedType = Type.fromString(ctx.type().getText());
        String name = ctx.ID().getText();

        Value rawValue = visit(ctx.expr());

        Value val = rawValue.castTo(expectedType);

        memory.declareSymbol(name, val);

        return val;
    }

    // 2. Просто выражение: x + 5;
    @Override
    public Value visitStatement(ExprParser.StatementContext ctx) {
        // Просто вычисляем и возвращаем результат
        return visit(ctx.expr());
    }

    @Override
    public Value visitBlockSingle(ExprParser.BlockSingleContext ctx) {
        // Если в блоке одна строка без скобок - просто выполняем её
        visit(ctx.stat());
        return null;
    }

    @Override
    public Value visitBlockReal(ExprParser.BlockRealContext ctx) {
        memory.enterScope();
        try {
            for (ExprParser.StatContext s : ctx.stat()) {
                visit(s);
            }
        } finally {
            memory.leaveScope();
        }
        return null;
    }

    @Override
    public Value visitIfStat(ExprParser.IfStatContext ctx) {
        // Вычисляем условие в скобках
        Value condition = visit(ctx.cond);

        // Проверяем, истинно ли оно (нужно привести к Boolean)
        if (isTrue(condition)) {
            // Выполняем ветку 'then'
            return visit(ctx.then);
        } else if (ctx.elseBlock != null) { // Проверяем, есть ли else
            // Выполняем ветку 'else'
            return visit(ctx.elseBlock);
        }

        return null;
    }

    // Вспомогательный метод для проверки "истинности"
    private boolean isTrue(Value value) {
        return value.isTrue();
    }

    // Print
    @Override
    public Value visitPrintStat(ExprParser.PrintStatContext ctx) {
        // Вычисляем то, что стоит после слова print
        Value value = visit(ctx.expr());

        print("> " + value);

        return value;
    }

    // FOR LOOP
    @Override
    public Value visitForStat(ExprParser.ForStatContext ctx) {
        memory.enterScope();
        try {
            visit(ctx.init);
            while (visit(ctx.cond).isTrue()) {
                visit(ctx.body);
                if (ctx.stepStat != null) {
                    visit(ctx.stepStat);
                } else if (ctx.stepExpr != null) {
                    visit(ctx.stepExpr);
                }
            }
        } finally {
            memory.leaveScope();
        }
        return null;
    }

    // ##### EXPR #####
    // Изменение существующей переменной (y = ...) внутри expr
    @Override
    public Value visitAssign(ExprParser.AssignContext ctx) {
        String name = ctx.ID().getText();
        Value newValue = visit(ctx.expr());

        memory.setSymbol(name, newValue);
        return newValue;
    }

    @Override
    public Value visitId(ExprParser.IdContext ctx) {
        String name = ctx.ID().getText();

        return memory.getSymbol(name);
    }

    @Override
    public Value visitListLit(ExprParser.ListLitContext ctx) {
        List<Value> elements = new ArrayList<>();
        for (ExprParser.ExprContext exprCtx : ctx.expr()) {
            elements.add(visit(exprCtx));
        }
        return new ListVal(elements);
    }

    // INCREMENT / DECREMENT
    @Override
    public Value visitIncrement(ExprParser.IncrementContext ctx) {
        String id = ctx.ID().getText();
        Value val = memory.getSymbol(id);

        if (val instanceof IntVal(Integer val1)) {
            int newValue = ctx.op.getType() == ExprLexer.INCR ? val1 + 1 : val1 - 1;
            memory.setSymbol(id, new IntVal(newValue));
        } else {
            throw new RuntimeException("Increment / decrement error");
        }
        return val; // returning old value as in c++
    }

    @Override
    public Value visitListAccess(ExprParser.ListAccessContext ctx) {
        String name = ctx.ID().getText();
        Value val = memory.getSymbol(name);

        if (!(val instanceof ListVal(List<Value> elements))) {
            throw new RuntimeException("Błąd: '" + name + "' nie jest listą!");
        }

        Value indexVal = visit(ctx.expr());
        if (!(indexVal instanceof IntVal(Integer val1))) {
            throw new RuntimeException("Błąd: Indeks listy musi być liczbą całkowitą!");
        }

        try {
            return elements.get(val1);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("Błąd: Indeks " + val1 + " poza zakresem listy '" + name + "'!");
        }
    }

    @Override
    public Value visitIntLit(ExprParser.IntLitContext ctx) {
        return new IntVal(Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public Value visitFloatLit(ExprParser.FloatLitContext ctx) {
        return new FloatVal(Float.parseFloat(ctx.getText()));
    }

    @Override
    public Value visitStringLit(ExprParser.StringLitContext ctx) {
        String str = ctx.getText();
        return new StringVal(str.substring(1, str.length() - 1));
    }

    @Override
    public Value visitReadCall(ExprParser.ReadCallContext ctx) {
        Scanner scanner = new Scanner(System.in);

        Value readText = visit(ctx.expr());

        print(readText);
        Value result = new StringVal(scanner.nextLine());

        scanner.close();
        return result;
    }

    @Override
    public Value visitBinOp(ExprParser.BinOpContext ctx) {
        // Получаем результаты левой и правой веток
        Value left = visit(ctx.l);
        Value right = visit(ctx.r);

        // switch-выражение по типу токена из твоего лексера
        return switch (ctx.op.getType()) {
            // Арифметика
            case ExprLexer.ADD -> left.add(right);
            case ExprLexer.SUB -> left.sub(right);
            case ExprLexer.MUL -> left.mul(right);
            case ExprLexer.DIV -> left.div(right);

            // Сравнения
            case ExprLexer.EQUAL -> left.eq(right);
            case ExprLexer.NOTEQUAL -> left.ne(right);
            case ExprLexer.GT -> left.gt(right);
            case ExprLexer.LT -> left.lt(right);
            case ExprLexer.GE -> left.ge(right);
            case ExprLexer.LE -> left.le(right);

            // Логика
            case ExprLexer.AND -> left.and(right);
            case ExprLexer.OR -> left.or(right);

            default -> throw new RuntimeException("Неизвестный оператор: " + ctx.op.getText());
        };
    }

    // ##### FUNCTIONS STUFF #####
    @Override
    public Value visitReturnStat(ExprParser.ReturnStatContext ctx) {
        Value value = null;
        if (ctx.expr() != null) {
            value = visit(ctx.expr());
        }
        // Бросаем исключение, чтобы мгновенно прервать выполнение стейтментов
        throw new ReturnException(value);
    }

    @Override
    public Value visitDef(ExprParser.DefContext ctx) {
        String name = ctx.name.getText();
        functionManager.register(name, ctx);
        return null;
    }

    @Override
    public Value visitFunCall(ExprParser.FunCallContext ctx) {
        String name = ctx.ID().getText();
        ExprParser.DefContext def = functionManager.get(name);

        if (def == null) {
            throw new RuntimeException("Функция " + name + " не определена!");
        }

        // Вычисляем аргументы в ТЕКУЩЕМ скоупе (до входа в функцию)
        List<Value> actualArgs = new ArrayList<>();
        if (ctx.expr() != null) {
            for (ExprParser.ExprContext expr : ctx.expr()) {
                actualArgs.add(visit(expr));
            }
        }

        // С помощью менеджера создаем новый скоуп и биндим параметры
        functionManager.prepareScope(def, actualArgs);

        // Выполняем тело функции
        try {
            for (ExprParser.StatContext s : def.body) {
                visit(s);
            }
        } catch (ReturnException e) {
            // Если внутри сработал return - возвращаем его значение
            return e.getValue();
        } finally {
            // Обязательно покидаем скоуп, даже если произошла ошибка
            memory.leaveScope();
        }

        return null;
    }
}