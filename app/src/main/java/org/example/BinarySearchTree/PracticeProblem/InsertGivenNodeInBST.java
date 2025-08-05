package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinaryTree.Node;

public class InsertGivenNodeInBST {

    public static void runner() {

        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.setRight(new Node(7));
        System.out.print("Print BST before adding node 5 ==> ");
        printBST(root);
        System.out.println();
        insertNodeInBST(root, 5);
        System.out.print("Print BST after adding node 5 ==> ");
        printBST(root);
        System.out.println();

    }

    private static Node insertNodeInBST(Node root, int key) {
        if(root == null){
            root = new Node(key);
            return root;
        }
        Node cur = root;
        while(true) {
            if(cur.getData() > key){
                if(cur.getLeft() != null) cur = cur.getLeft();
                else{
                    cur.setLeft(new Node(key));
                    break;
                }
            } else{
                if(cur.getRight() != null) cur = cur.getRight();
                else {
                    cur.setRight(new Node(key));
                    break;
                }
            }
        }
        return root;
    }

    private static void printBST(Node root) {
        if(root == null) return;
        printBST(root.getLeft());
        System.out.print(root.getData() + " ");
        printBST(root.getRight());
    }
}
