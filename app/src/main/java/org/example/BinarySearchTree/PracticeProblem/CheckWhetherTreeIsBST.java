package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinaryTree.Node;

public class CheckWhetherTreeIsBST {

    public static void runner() {
        Node root = new Node(13);
        root.setLeft(new Node(10));
        root.getLeft().setLeft(new Node(7));
        root.getLeft().setRight(new Node(12));
        root.getLeft().getLeft().setRight(new Node(9));
        root.getLeft().getLeft().getRight().setLeft(new Node(8));
        root.setRight(new Node(15));
        root.getRight().setLeft(new Node(14));
        root.getRight().setRight(new Node(17));
        root.getRight().getRight().setLeft(new Node(16));

        boolean isBst = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("The tree is BST ? ===>" +isBst);

    }

    private static boolean isBST(Node root, int lb, int hb) {
        if(root == null) return true;
        if(root.getData() >= lb && root.getData() <= hb){
            return isBST(root.getLeft(), lb, root.getData()) && isBST(root.getRight(), root.getData(), hb);
        }
        return false;
    }
}
