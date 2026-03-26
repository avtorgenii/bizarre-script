package interpreter.types;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public record ListVal(List<Value> elements) implements Value {
    @Override
    public String toString() {
        return "[" + elements.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + "]";
    }

    public Value get(int index) {
        return elements.get(index);
    }

    @Override
    public Type getType() {
        return Type.STRING;
    }

    @Override
    public Object getVal() {
        return elements;
    }

    @Override
    public boolean isTrue() {
        return !elements.isEmpty();
    }

    @Override
    public Value add(Value other) {
        if (other instanceof ListVal otherList) {
            List<Value> combined = new ArrayList<>(this.elements);
            combined.addAll(otherList.elements());
            return new ListVal(combined);
        }
        throw new RuntimeException("Nie można dodać " + other + " do listy!");
    }

    @Override
    public Value sub(Value other) {
        throw new RuntimeException("Operacja odejmowania nie jest wspierana dla list!");
    }

    @Override
    public Value mul(Value other) {
        throw new RuntimeException("Nie można mnożyć list!");
    }

    @Override
    public Value div(Value other) {
        throw new RuntimeException("Nie można dzielić list!");
    }

    @Override
    public Value eq(Value other) {
        if (other instanceof ListVal(List<Value> elements1)) {
            return new BoolVal(this.elements.equals(elements1));
        }
        return new BoolVal(false);
    }

    @Override
    public Value ne(Value other) {
        Value equal = eq(other);
        return new BoolVal(!((boolean) equal.getVal()));
    }

    @Override
    public Value gt(Value other) {
        throw new RuntimeException("Bizarre Error: Nie można używać operatora '>' na listach!");
    }

    @Override
    public Value lt(Value other) {
        throw new RuntimeException("Bizarre Error: Nie można używać operatora '<' na listach!");
    }

    @Override
    public Value ge(Value other) {
        throw new RuntimeException("Bizarre Error: Nie można używać operatora '>=' na listach!");
    }

    @Override
    public Value le(Value other) {
        throw new RuntimeException("Bizarre Error: Nie można używać operatora '<=' na listach!");
    }
    @Override
    public Value not() {
        return new BoolVal(!isTrue());
    }

    @Override
    public Value and(Value other) {
        return new BoolVal(this.isTrue() && other.isTrue());
    }

    @Override
    public Value or(Value other) {
        return new BoolVal(this.isTrue() || other.isTrue());
    }
}