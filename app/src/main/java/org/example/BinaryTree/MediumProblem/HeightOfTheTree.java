package org.example.BinaryTree.MediumProblem;

import org.example.BinaryTree.Node;

public class HeightOfTheTree {
    public static void runner() {
        System.out.println("---------Implementing Inorder Traversal-------------");
        Node root = new Node(1);
        // Left subtree
        root.setLeft(new Node(2));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));
        root.getLeft().getRight().setLeft(new Node(6));

        //Right Subtree
        root.setRight(new Node(3));
        root.getRight().setLeft(new Node(7));
        root.getRight().setRight(new Node(8));
        root.getRight().getRight().setLeft(new Node(9));
        root.getRight().getRight().setRight(new Node(10));

        System.out.println("Height of the tree  === "+heightOfTree(root));

    }

    public static int heightOfTree(Node root) {
        if(root == null) return 0;
        int left = heightOfTree(root.getLeft());
        int right = heightOfTree(root.getRight());
        return 1 + Math.max(left, right);
    }


}
