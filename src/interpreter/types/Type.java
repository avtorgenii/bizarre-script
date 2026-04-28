package interpreter.types;

public enum Type {
    INT, FLOAT, STRING, BOOL, NULL, LIST;

    public static Type fromString(String text) {
        if (text == null) return NULL;

        return switch (text.toLowerCase()) {
            case "int"    -> INT;
            case "float"  -> FLOAT;
            case "string" -> STRING;
            case "bool"   -> BOOL;
            case "null"   -> NULL;
            case "list"   -> LIST;
            default -> throw new RuntimeException("Unknown type: " + text);
        };
    }
}