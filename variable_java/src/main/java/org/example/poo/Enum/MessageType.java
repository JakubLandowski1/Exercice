package org.example.poo.Enum;

public enum MessageType {
    A,
    B,
    C,
    D;

    public Object getPriority() {
        switch (this) {
            case A:
                return Priority.HIGH;
            case B:
                return Priority.MEDIUM;
            case C:
                return Priority.LOW;
            case D:
                return Priority.LOW;
        }
        return null;

    }
}
