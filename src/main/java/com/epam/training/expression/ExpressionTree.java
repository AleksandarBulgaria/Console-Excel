package com.epam.training.expression;

import java.util.ArrayList;

public class ExpressionTree {
    private ArrayList<Node> nodes = new ArrayList<>();
    private final class Node{
        Node left = null;
        Node right = null;
        Node parent = null;
    }
}
