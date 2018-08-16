package com.epam.training.expression;

import java.math.BigDecimal;

public class Expression extends Node implements ExpressionInterface {

    private BigDecimal value;
    private String expression;
    private ExpressionTree expTree;

    Expression(String s) {
        super(s);
    }

    @Override
    public String getValueAsString() {
        return null;
    }

    @Override
    public float calculateExpression() {
        return 0;
    }
}
