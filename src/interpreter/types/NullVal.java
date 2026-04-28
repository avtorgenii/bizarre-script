package interpreter.types;

public record NullVal() implements Value {
    @Override public Type getType() { return Type.NULL; }
    @Override public Object getVal() { return null; }
    @Override public boolean isTrue() { return false; } // null - это всегда ложь

    @Override
    public Value castTo(Type target) {
        return switch (target) {
            case NULL   -> this;
            case STRING -> new StringVal("null");
            case BOOL   -> new BoolVal(false);
            default     -> throw new RuntimeException("Cannot cast NULL to " + target);
        };
    }

    @Override
    public Value add(Value other) {
        // Если прибавляем к строке — будет "null" + "текст"
        if (other instanceof StringVal) return new StringVal("null" + other.getVal());
        throw new RuntimeException("Нельзя прибавлять к null");
    }

    @Override public Value eq(Value other) { 
        return new BoolVal(other instanceof NullVal); 
    }
    @Override public Value ne(Value other) { 
        return new BoolVal(!(other instanceof NullVal)); 
    }

    // Все остальные математические операции — в топку
    @Override public Value sub(Value other) { throw new RuntimeException("NPE: Операция 'минус' с null"); }
    @Override public Value mul(Value other) { throw new RuntimeException("NPE: Операция 'умножить' с null"); }
    @Override public Value div(Value other) { throw new RuntimeException("NPE: Операция 'делить' с null"); }
    @Override public Value gt(Value other) { throw new RuntimeException("NPE: Сравнение с null"); }
    @Override public Value lt(Value other) { throw new RuntimeException("NPE: Сравнение с null"); }
    @Override public Value ge(Value other) { throw new RuntimeException("NPE: Сравнение с null"); }
    @Override public Value le(Value other) { throw new RuntimeException("NPE: Сравнение с null"); }

    // Логика
    @Override public Value and(Value other) { return new BoolVal(false); }
    @Override public Value or(Value other) { return new BoolVal(other.isTrue()); }
    @Override public Value not() { return new BoolVal(true); }

    @Override public String toString() { return "null"; }
}