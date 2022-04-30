package com.gl.problem2;

public class Main {
    static BST tree = new BST();

    public static void main(String[] args) {

        
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.right.left= new Node(55);

        tree.BST_To_SkewedTree(tree.root);

        // Skewed Tree
        System.out.print("\nSkewed Tree: ");
        tree.Traverse_Tree(tree.headNode);
    }

}