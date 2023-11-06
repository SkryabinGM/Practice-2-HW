package org.example.binary_tree;

public class Node {
    private int value;
    private Node rightNode;
    private Node leftNode;

    private Node parent;

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
        rightNode.setParent(this);
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
        leftNode.setParent(this);
    }
}