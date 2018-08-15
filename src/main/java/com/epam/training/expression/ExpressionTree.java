package com.epam.training.expression;

import java.util.HashSet;

public class ExpressionTree {
    private HashSet<Node> nodes = new HashSet<>();
    private Node root;

    ExpressionTree(Node node) {
        root = node;
    }

    public Node getRoot() {
        return this.root;
    }
}
