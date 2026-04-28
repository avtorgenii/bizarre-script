package interpreter.types;


public interface Value {
    Type getType();
    Object getVal();
    boolean isTrue();

    Value castTo(Type target);

    // Арифметика
    Value add(Value other);
    Value sub(Value other);
    Value mul(Value other);
    Value div(Value other);

    // Сравнения
    Value eq(Value other);  // ==
    Value ne(Value other);  // !=
    Value gt(Value other);  // >
    Value lt(Value other);  // <
    Value ge(Value other);  // >=
    Value le(Value other);  // <=

    // Логика
    Value and(Value other); // and
    Value or(Value other);  // or
    Value not();            // not (унарный)
}