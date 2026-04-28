package interpreter.types;

public record StringVal(String val) implements Value {
    @Override public Type getType() { return Type.STRING; }
    @Override public Object getVal() { return val; }
    @Override public boolean isTrue() { return !val.isEmpty(); }

    @Override
    public Value castTo(Type target) {
        try {
            return switch (target) {
                case STRING -> this;
                case INT    -> new IntVal(Integer.parseInt(val));
                case FLOAT  -> new FloatVal(Float.parseFloat(val));
                case BOOL   -> new BoolVal(!val.isEmpty() && !val.equalsIgnoreCase("false"));
                default     -> throw new RuntimeException("ERROR: " + target);
            };
        } catch (NumberFormatException e) {
            throw new RuntimeException("Cannot cast STRING " + val + " to " + target);
        }
    }

    // Сложение = Конкатенация
    @Override public Value add(Value other) {
        return new StringVal(this.val + other.getVal().toString());
    }

    // Сравнение строк
    @Override public Value eq(Value other) { return new BoolVal(this.val.equals(other.getVal().toString())); }
    @Override public Value ne(Value other) { return new BoolVal(!this.val.equals(other.getVal().toString())); }

    // Запрещенка (выкидываем ошибки)
    @Override public Value sub(Value other) { throw new RuntimeException("Strings don't support subtraction"); }
    @Override public Value mul(Value other) { throw new RuntimeException("Strings don't support multiplication"); }
    @Override public Value div(Value other) { throw new RuntimeException("Strings don't support division"); }

    @Override public Value gt(Value other) { throw new RuntimeException("Strings don't support '>' comparison"); }
    @Override public Value lt(Value other) { throw new RuntimeException("Strings don't support '<' comparison"); }
    @Override public Value ge(Value other) { throw new RuntimeException("Strings don't support '>=' comparison"); }
    @Override public Value le(Value other) { throw new RuntimeException("Strings don't support '<=' comparison"); }

    // Логика (пустая строка - false, остальное - true)
    @Override public Value and(Value other) { return new BoolVal(this.isTrue() && other.isTrue()); }
    @Override public Value or(Value other) { return new BoolVal(this.isTrue() || other.isTrue()); }
    @Override public Value not() { return new BoolVal(!this.isTrue()); }

    @Override public String toString() { return val; }
}