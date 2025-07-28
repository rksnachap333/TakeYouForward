package org.example.BinaryTree.MediumProblem;

import org.example.BinaryTree.Node;

public class DiameterOfTree {

    public static void runner() {
        System.out.println("---------Finding Diameter Of Tree-------------");
        Node root = new Node(1);
        // Left subtree
        root.setLeft(new Node(2));
//        root.getLeft().setLeft(new Node(4));
//        root.getLeft().setRight(new Node(5));

        //Right Subtree
        root.setRight(new Node(3));
        root.getRight().setLeft(new Node(4));
        root.getRight().getLeft().setLeft(new Node(5));
        root.getRight().getLeft().getLeft().setLeft(new Node(6));
        root.getRight().setRight(new Node(7));
        root.getRight().getRight().setRight(new Node(8));
        root.getRight().getRight().getRight().setRight(new Node(9));
//        root.getRight().getRight().setLeft(new Node(9));
//        root.getRight().getRight().setRight(new Node(10));

        int[] diameter = new int[1];
        diameter[0] = 0;

        diameter(root, diameter);
        System.out.println("Diameter of the tree ==="+diameter[0]);
    }

    public static int diameter(Node root, int[] diameter) {
        if(root == null) return 0;
        int left = diameter(root.getLeft(), diameter);
        int right = diameter(root.getRight(), diameter);
        diameter[0] = Math.max(diameter[0], left + right + 1);
        return 1 + Math.max(left, right);
    }
}
