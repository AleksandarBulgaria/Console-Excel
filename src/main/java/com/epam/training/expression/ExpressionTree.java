package com.epam.training.expression;

import java.util.HashSet;

public class ExpressionTree {
    private final Object myLock = new Object();
    private HashSet<Node> nodes = new HashSet<>();
    private Node root;

    ExpressionTree(Node n) {
        root = n;
    }

    public Node getRoot() {
        return this.root;
    }

    private void setRoot(Node n) {
        root = n;
    }

    public void replaceRootMoveLeft(Node n) {
        synchronized (myLock) {
            n.setLeft(root);
            this.setRoot(n);
        }
    }

    public void replaceRootMoveRight(Node n) {
        synchronized (myLock) {
            n.setRight(root);
            this.setRoot(n);
        }
    }

    public void addToRootLeft(Node n) {

    }

    public void addToRootRight(Node n) {

    }
}
