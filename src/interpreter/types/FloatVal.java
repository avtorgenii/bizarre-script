package interpreter.types;

public record FloatVal(Float val) implements Value {
    @Override public Type getType() { return Type.FLOAT; }
    @Override public Object getVal() { return val; }
    @Override public boolean isTrue() { return val != 0.0f; }

    @Override
    public Value castTo(Type target) {
        return switch (target) {
            case FLOAT  -> this;
            case INT    -> new IntVal(val.intValue());
            case STRING -> new StringVal(String.valueOf(val));
            case BOOL   -> new BoolVal(val != 0.0f);
            default     -> throw new RuntimeException("Cannot cast FLOAT to " + target);
        };
    }

    // Арифметика (всегда возвращает FloatVal)
    @Override public Value add(Value other) {
        if (other instanceof StringVal) return new StringVal(this.val + other.getVal().toString());
        return new FloatVal(this.val + ((Number)other.getVal()).floatValue());
    }
    @Override public Value sub(Value other) { return new FloatVal(this.val - ((Number)other.getVal()).floatValue()); }
    @Override public Value mul(Value other) { return new FloatVal(this.val * ((Number)other.getVal()).floatValue()); }
    @Override public Value div(Value other) {
        float r = ((Number)other.getVal()).floatValue();
        if (r == 0) throw new RuntimeException("Division by zero");
        return new FloatVal(this.val / r);
    }

    // Сравнения
    @Override public Value eq(Value other) { return new BoolVal(this.val.equals(((Number)other.getVal()).floatValue())); }
    @Override public Value ne(Value other) { return new BoolVal(!this.val.equals(((Number)other.getVal()).floatValue())); }
    @Override public Value gt(Value other) { return new BoolVal(this.val > ((Number)other.getVal()).floatValue()); }
    @Override public Value lt(Value other) { return new BoolVal(this.val < ((Number)other.getVal()).floatValue()); }
    @Override public Value ge(Value other) { return new BoolVal(this.val >= ((Number)other.getVal()).floatValue()); }
    @Override public Value le(Value other) { return new BoolVal(this.val <= ((Number)other.getVal()).floatValue()); }

    // Логика
    @Override public Value and(Value other) { return new BoolVal(this.isTrue() && other.isTrue()); }
    @Override public Value or(Value other) { return new BoolVal(this.isTrue() || other.isTrue()); }
    @Override public Value not() { return new BoolVal(!this.isTrue()); }

    @Override public String toString() { return val.toString(); }
}