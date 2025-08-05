package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinarySearchTree.Node;

public class CorrectBSTWithTwoNodeSwapped {

    private static Node first, middle, last, prev;
    public static void runner() {

        Node root = new Node(3);
        root.setLeft(new Node(1));
        root.setRight(new Node(4));
        root.getRight().setLeft(new Node(2));
        System.out.print("Inorder of non BST ==");
        inorder(root);
        System.out.println();
        recoverTree(root);
        System.out.print("Inorder after changing Non BST to BST ==");
        inorder(root);
        System.out.println();

    }

    private static void recoverTree(Node root) {
        if(root == null) return;
        first = middle = last = null;
        modifiedInorder(root);
        if(last != null) {
            int temp = first.getData();
            first.setData(last.getData());
            last.setData(temp);
        } else {
            int temp = middle.getData();
            middle.setData(first.getData());
            first.setData(temp);
        }

    }

    private static void modifiedInorder(Node root) {
        if(root == null)return;
        modifiedInorder(root.getLeft());
        if(prev != null && prev.getData() > root.getData()) {
            if(first == null) {
                first = prev;
                middle = root;
            } else{
                last = root;
            }
        }
        prev = root;
        modifiedInorder(root.getRight());
    }

    private static void inorder(Node root) {
        if(root == null) return;
        inorder(root.getLeft());
        System.out.print(root.getData() + " ");
        inorder(root.getRight());
    }
}
