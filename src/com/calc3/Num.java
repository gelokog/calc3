package com.calc3;

class Num {
    private int value;
    private NumberType type;

    Num(int value, NumberType type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }

    NumberType getType() {
        return type;
    }
}

