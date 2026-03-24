package interpreter.types;

public record BoolVal(Boolean val) implements Value {
    @Override public Type getType() { return Type.BOOL; }
    @Override public Object getVal() { return val; }
    @Override public boolean isTrue() { return val; }

    @Override public Value eq(Value other) { return new BoolVal(this.val.equals(other.getVal())); }
    @Override public Value ne(Value other) { return new BoolVal(!this.val.equals(other.getVal())); }

    @Override public Value and(Value other) { return new BoolVal(this.val && other.isTrue()); }
    @Override public Value or(Value other) { return new BoolVal(this.val || other.isTrue()); }
    @Override public Value not() { return new BoolVal(!this.val); }

    // Математика для булеанов обычно запрещена
    @Override public Value add(Value other) { throw new RuntimeException("Boolean cannot be used in math"); }
    @Override public Value sub(Value other) { throw new RuntimeException("Boolean cannot be used in math"); }
    @Override public Value mul(Value other) { throw new RuntimeException("Boolean cannot be used in math"); }
    @Override public Value div(Value other) { throw new RuntimeException("Boolean cannot be used in math"); }
    @Override public Value gt(Value other) { throw new RuntimeException("Boolean cannot be compared via >"); }
    @Override public Value lt(Value other) { throw new RuntimeException("Boolean cannot be compared via <"); }
    @Override public Value ge(Value other) { throw new RuntimeException("Boolean cannot be compared via >="); }
    @Override public Value le(Value other) { throw new RuntimeException("Boolean cannot be compared via <="); }

    @Override public String toString() { return val.toString(); }
}