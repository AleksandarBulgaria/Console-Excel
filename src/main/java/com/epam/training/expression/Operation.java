package com.epam.training.expression;

public enum Operation {

    Division("/"),
    Multiplication("*"),
    Addition("+"),
    Subtraction("-"),
    Exponentiation("^");

    final String operand;

    Operation(String s) {
        operand = s;
    }

}
