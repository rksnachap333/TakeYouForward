package org.example.BinarySearchTree.Concept;

import org.example.BinarySearchTree.Node;

public class MinAndMaxInBST {

    public static void runner() {
        Node root = new Node(8);
        //Left subtree
        root.setLeft(new Node(5));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(7));
        root.getLeft().getRight().setLeft(new Node(6));

        // Right subtree
        root.setRight(new Node(12));
        root.getRight().setLeft(new Node(10));
        root.getRight().setRight(new Node(14));
        root.getRight().getRight().setLeft(new Node(13));

        int min = findMin(root);
        int max = findMax(root);

        System.out.println("Min value in the BST is ===>" + min);
        System.out.println("Max value in the BST is ===>" + max);
    }

    private static int findMin(Node root){
        if(root == null) return -1;
        while(root.getLeft() != null){
            root = root.getLeft();
        }
        return root.getData();
    }
    private static int findMax(Node root){
        if(root == null) return -1;
        while(root.getRight() != null){
            root = root.getRight();
        }
        return root.getData();
    }

}
