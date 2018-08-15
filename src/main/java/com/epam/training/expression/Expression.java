package com.epam.training.expression;

import java.math.BigDecimal;

public class Expression implements ExpressionInterface {

    private BigDecimal value;
    private String expression;
    private ExpressionTree expTree;

    @Override
    public String getValueAsString() {
        return null;
    }

    @Override
    public float calculateExpression() {
        return 0;
    }
}
