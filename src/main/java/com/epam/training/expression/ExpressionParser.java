package com.epam.training.expression;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;

public class ExpressionParser {

    public static ExpressionTree parse(String inputLine) {
        String[] input = inputLine.split(" ");
        ExpressionTree expressionTree = new ExpressionTree(new Node(input[0]));
        LinkedList<BigDecimal> leaves = new LinkedList<>();
        LinkedList<Operation> innerNs = new LinkedList<>();

        System.out.println("\nLeaves:\n| ");
        for (int i = 0; i < input.length; i += 2) {
            leaves.add(BigDecimal.valueOf(Double.valueOf(input[i])).setScale(2, RoundingMode.HALF_UP));
            System.out.print(leaves.getLast() + " | ");
        }
        System.out.println("\nOperations:\n| ");
        for (int i = 1; i < input.length; i += 2) {
            innerNs.add(Operation.fromString(input[i]));
            System.out.print(innerNs.getLast() + " | ");
        }
        return expressionTree;
    }

}
