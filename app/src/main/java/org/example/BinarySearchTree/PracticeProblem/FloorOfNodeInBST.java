package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinarySearchTree.Node;

public class FloorOfNodeInBST {

    public static void runner() {
        Node root = new Node(10);
        //Left subtree
        root.setLeft(new Node(5));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(6));
        root.getLeft().getRight().setRight(new Node(9));
        root.getLeft().getLeft().setLeft(new Node(2));
        root.getLeft().getLeft().setRight(new Node(4));

        // Right subtree
        root.setRight(new Node(13));
        root.getRight().setLeft(new Node(11));
        root.getRight().setRight(new Node(14));

        System.out.println("Floor of 8 in BST ==="+getFloor(root, 8));
    }

    private static int getFloor(Node root, int key) {
        int floor = -1;
        while(root != null) {
            if(root.getData() == key){
                floor = root.getData();
                return floor;
            }
            if(key > root.getData()) {
                floor = root.getData();
                root = root.getRight();
            } else {
                root = root.getLeft();
            }
        }

        return floor;
    }
}
