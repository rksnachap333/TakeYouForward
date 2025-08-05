package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinaryTree.Node;

public class DeleteANodeInBST {

    public static void runner() {
        Node root = new Node(9);
        root.setLeft(new Node(8));
        root.getLeft().setLeft(new Node(5));
        root.getLeft().getLeft().setLeft(new Node(3));
        root.getLeft().getLeft().setRight(new Node(7));
        root.getLeft().getLeft().getLeft().setLeft(new Node(2));
        root.getLeft().getLeft().getLeft().setRight(new Node(4));
        root.getLeft().getLeft().getLeft().getLeft().setLeft(new Node(1));
        root.setRight(new Node(12));
        System.out.println("Tree before deleting node 5 ==");
        print(root);
        System.out.println();
        deleteNode(root, 5);
        System.out.println("Tree after deleting node 5 ==");
        print(root);
    }

    public static Node deleteNode(Node root, int key) {
        if(root == null) return null;
        if(root.getData() == key){
            return helper(root);
        }
        Node dummy = root;
        while(root != null) {
            if(root.getData() > key){
                if(root.getLeft() != null && root.getLeft().getData() == key){
                    root.setLeft(helper(root.getLeft()));
                    break;
                } else{
                    root = root.getLeft();
                }
            } else{
                if(root.getRight() != null && root.getRight().getData() == key){
                    root.setRight(helper(root.getRight()));
                } else{
                    root = root.getRight();
                }
            }
        }

        return dummy;
    }

    private static Node helper(Node root) {
        if(root.getLeft() == null){
            return root.getRight();
        } else if(root.getRight() == null){
            return root.getLeft();
        }

        Node rightChild = root.getRight();
        Node lastRight = findLastRight(root.getLeft());
        lastRight.setRight(rightChild);
        return root.getLeft();
    }

    private static Node findLastRight(Node root) {
        if(root.getRight() == null) return root;
        return findLastRight(root.getRight());
    }

    private static void print(Node root) {
        if(root == null) return;
        print(root.getLeft());
        System.out.print(root.getData() + " ");
        print(root.getRight());
    }
}
