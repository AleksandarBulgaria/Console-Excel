package com.epam.training.expression;

import java.security.InvalidParameterException;

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

    public static Operation fromString(String s) throws InvalidParameterException {
        switch (s) {
            case "+":
                return Operation.Addition;
            case "-":
                return Operation.Subtraction;
            case "/":
                return Operation.Division;
            case "*":
                return Operation.Multiplication;
            case "^":
                return Operation.Exponentiation;
            default:
                throw new InvalidParameterException();
        }
    }
}
