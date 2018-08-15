package com.epam.training.expression;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeTest {


    private static final Node root = new Node("^");
    private static final Node left = new Node("4");
    private static final Node right = new Node("2");

    @BeforeAll
    static void setupNode() {
        root.setLeft(left);
        root.setRight(right);
    }

    @Test
    void calculateValuePlus() {
        Node rootNode = new Node("+");
        Node leftNode = new Node("4.25");
        Node rightNode = new Node("0.75");
        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);
        rootNode.calculateValue();
        assertEquals(
                BigDecimal.valueOf(5.0).setScale(2, RoundingMode.HALF_UP),
                rootNode.getValue()
        );
    }

    @Test
    void calculateValueMinus() {
        Node rootNode = new Node("-");
        Node leftNode = new Node("4.25");
        Node rightNode = new Node("0.75");
        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);
        rootNode.calculateValue();
        assertEquals(
                BigDecimal.valueOf(3.5).setScale(2, RoundingMode.HALF_UP),
                rootNode.getValue()
        );
    }

    @Test
    void calculateValueTimes() {
        Node rootNode = new Node("*");
        Node leftNode = new Node("4.25");
        Node rightNode = new Node("4");
        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);
        rootNode.calculateValue();
        assertEquals(
                BigDecimal.valueOf(17.0).setScale(2, RoundingMode.HALF_UP),
                rootNode.getValue()
        );
    }

    @Test
    void calculateValueTimesWeirdNumber() {
        Node rootNode = new Node("*");
        Node leftNode = new Node("4.25");
        Node rightNode = new Node(".4");
        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);
        rootNode.calculateValue();
        assertEquals(
                BigDecimal.valueOf(1.7).setScale(2, RoundingMode.HALF_UP),
                rootNode.getValue()
        );
    }

    @Test
    void calculateValueDividedBy() {
        Node rootNode = new Node("/");
        Node leftNode = new Node("4.5");
        Node rightNode = new Node("0.75");
        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);
        rootNode.calculateValue();
        assertEquals(
                BigDecimal.valueOf(6.0).setScale(2, RoundingMode.HALF_UP),
                rootNode.getValue()
        );
    }

    @Test
    void getLeft() {
        assertEquals(
                BigDecimal.valueOf(4.0).setScale(2, RoundingMode.HALF_UP),
                root.getLeft().getValue()
        );
    }

    @Test
    void getRight() {
        assertEquals(
                BigDecimal.valueOf(2.0).setScale(2, RoundingMode.HALF_UP),
                root.getRight().getValue()
        );
    }

    @Test
    void calculateValuePowerOf() {
        root.calculateValue();
        assertEquals(
                BigDecimal.valueOf(16.0).setScale(2, RoundingMode.HALF_UP),
                root.getValue()
        );
    }
}