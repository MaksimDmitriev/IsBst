package com.isbst;

public class Main {

    public static void main(String[] args) {

        Node left = new Node(12, null, null);
        Node right = new Node(1000, null, null);
        Node root = new Node(100, left, right);
        BinaryTree binaryTree = new BinaryTree(root);
        System.out.println(binaryTree.isBst());

    }

}
