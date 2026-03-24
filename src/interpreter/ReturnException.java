package interpreter;

import interpreter.types.Value;

public class ReturnException extends RuntimeException {
    private final Value value;

    public ReturnException(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }
}