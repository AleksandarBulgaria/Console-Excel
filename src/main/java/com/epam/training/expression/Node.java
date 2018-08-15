package com.epam.training.expression;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author N.Nenkov
 * @version 0.01rc
 * @since 15-Aug-2018
 */
final class Node {

/*
    private boolean isRoot;
    private boolean isLeaf;
*/

    private static final String DECIMAL_PATTERN = "^[-+]?[0-9]*\\.?[0-9]+$";
    private static final String OPERATION_PATTERN = "^([+\\-*/^])$";

    private Node left = null;
    private Node right = null;

    private BigDecimal value = null;
    private Operation op = null;

    Node(String s) {
        if (s.matches(OPERATION_PATTERN)) {
            switch (s) {
                case "+":
                    op = Operation.Addition;
                    break;
                case "-":
                    op = Operation.Subtraction;
                    break;
                case "/":
                    op = Operation.Division;
                    break;
                case "*":
                    op = Operation.Multiplication;
                    break;
                case "^":
                    op = Operation.Exponentiation;
                    break;
            }
        } else if (s.matches(DECIMAL_PATTERN)) {
            value = BigDecimal
                    .valueOf(Double.valueOf(s))
                    .setScale(2, RoundingMode.HALF_UP);
        }
    }

    void calculateValue() {
        value = operation(left.getValue(), right.getValue(), op);
    }

    private BigDecimal operation(BigDecimal a, BigDecimal b, Operation o) {
        switch (o) {
            case Multiplication:
                return a.multiply(b).setScale(2, RoundingMode.HALF_UP);
            case Addition:
                return a.add(b).setScale(2, RoundingMode.HALF_UP);
            case Subtraction:
                return a.subtract(b).setScale(2, RoundingMode.HALF_UP);
            case Division:
                return a.divide(b, RoundingMode.HALF_UP);
            default:
                return BigDecimal
                        .valueOf(Math.pow(a.doubleValue(), b.doubleValue()))
                        .setScale(2, RoundingMode.HALF_UP);
        }
    }

    /**
     * Getters and Setters:
     */

    Node getLeft() {
        return left;
    }

    void setLeft(Node n) {
        left = n;
    }

    Node getRight() {
        return right;
    }

    void setRight(Node n) {
        right = n;
    }

    BigDecimal getValue() {
        return value;
    }

}