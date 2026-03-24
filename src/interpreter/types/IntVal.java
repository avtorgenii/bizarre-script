package interpreter.types;

public record IntVal(Integer val) implements Value {
    @Override public Type getType() { return Type.INT; }
    @Override public Object getVal() { return val; }
    @Override public boolean isTrue() { return val != 0; }

    @Override
    public Value add(Value other) {
        return switch (other) {
            case IntVal i   -> new IntVal(this.val + i.val());
            case FloatVal f -> new FloatVal(this.val + f.val());
            case StringVal s -> new StringVal(this.val + s.val());
            default -> throw new RuntimeException("Несовместимые типы для ADD");
        };
    }

    @Override
    public Value sub(Value other) {
        return (other instanceof FloatVal f)
                ? new FloatVal(this.val - f.val())
                : new IntVal(this.val - ((IntVal)other).val());
    }

    @Override public Value mul(Value other) {
        return (other instanceof FloatVal f)
                ? new FloatVal(this.val * f.val())
                : new IntVal(this.val * ((IntVal)other).val());
    }

    @Override public Value div(Value other) {
        if (((Number)other.getVal()).floatValue() == 0) throw new RuntimeException("Division by zero");
        return (other instanceof FloatVal f)
                ? new FloatVal(this.val / f.val())
                : new IntVal(this.val / ((IntVal)other).val());
    }

    @Override public Value eq(Value other) { return new BoolVal(this.val.equals(other.getVal())); }
    @Override public Value ne(Value other) { return new BoolVal(!this.val.equals(other.getVal())); }

    @Override public Value gt(Value other) { return new BoolVal(this.val > ((Number)other.getVal()).floatValue()); }
    @Override public Value lt(Value other) { return new BoolVal(this.val < ((Number)other.getVal()).floatValue()); }
    @Override public Value ge(Value other) { return new BoolVal(this.val >= ((Number)other.getVal()).floatValue()); }
    @Override public Value le(Value other) { return new BoolVal(this.val <= ((Number)other.getVal()).floatValue()); }

    // Логика для чисел (как в C: 0 - false, остальное - true)
    @Override public Value and(Value other) { return new BoolVal(this.isTrue() && other.isTrue()); }
    @Override public Value or(Value other) { return new BoolVal(this.isTrue() || other.isTrue()); }
    @Override public Value not() { return new BoolVal(!this.isTrue()); }

    @Override public String toString() { return val.toString(); }
}
