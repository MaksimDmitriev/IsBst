package com.isbst;

public class BinaryTree {

    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    private boolean isBst(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.getValue() >= max || root.getValue() <= min) {
            return false;
        }
        return isBst(root.getLeft(), min, root.getValue()) && isBst(root.getRight(), root.getValue(), max);
    }

    public boolean isBst() {
        return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
