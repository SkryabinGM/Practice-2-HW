package org.example.binary_tree;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.intAdd2(100);
        tree1.intAdd2(70);
        tree1.intAdd2(80);
        tree1.intAdd2(75);
        tree1.intAdd2(78);
        boolean B = tree1.intRemove2(80);
    }
}