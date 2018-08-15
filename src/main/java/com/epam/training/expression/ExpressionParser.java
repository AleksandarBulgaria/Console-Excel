package com.epam.training.expression;

public class ExpressionParser {

    public static ExpressionTree parse(String inputLine) {
        String[] input = inputLine.split(" ");
        ExpressionTree expressionTree = new ExpressionTree(new Node(input[0]));

        return expressionTree;
    }

}
