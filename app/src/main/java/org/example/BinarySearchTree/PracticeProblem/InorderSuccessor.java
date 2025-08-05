package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinaryTree.Node;

public class InorderSuccessor {

    public static void runner() {
        Node root = new Node(5);
        root.setLeft(new Node(3));
        root.getLeft().setLeft(new Node(2));
        root.getLeft().setRight(new Node(4));
        root.getLeft().getLeft().setLeft(new Node(1));
        root.setRight(new Node(7));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));
        root.getRight().getRight().setLeft(new Node(8));
        root.getRight().getRight().setRight(new Node(10));
        Node succesorNode = inorderSuccessor(root, new Node(8));
        Node predecessorNode = inorderPredecessor(root, new Node(8));
        System.out.println();
        System.out.println("Successor Node of 8 is : "+succesorNode.getData());
        System.out.println("Predecessor Node of 8 is : "+predecessorNode.getData());
    }

    private static Node inorderSuccessor(Node root, Node successorOf) {
        Node successor = null;

        while(root != null) {
            if(root.getData() > successorOf.getData()){
                successor = root;
                root = root.getLeft();
            } else{
                root = root.getRight();
            }
        }
        return successor;
    }

    private static Node inorderPredecessor(Node root, Node predecessorOf) {
        Node predecessor = null;
        while(root != null) {
            if(root.getData() < predecessorOf.getData()) {
                predecessor = root;
                root = root.getRight();
            } else {
                root = root.getLeft();
            }
        }

        return predecessor;
    }

    // Use an array list and store the inorder traversal and search for the number, and the next number will be our ans
}
