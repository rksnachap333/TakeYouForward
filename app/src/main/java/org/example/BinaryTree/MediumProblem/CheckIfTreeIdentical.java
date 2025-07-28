package org.example.BinaryTree.MediumProblem;

import org.example.BinaryTree.Node;

public class CheckIfTreeIdentical {

    public static void runner() {
        System.out.println("-----------Checking the Tree If Identical----------");
        Node root1 = new Node(1);
        root1.setLeft(new Node(2));
        root1.setRight(new Node(3));
        root1.getRight().setLeft(new Node(4));
        root1.getRight().setRight(new Node(5));

        Node root2 = new Node(1);
        root2.setLeft(new Node(2));
        root2.setRight(new Node(3));
        root2.getRight().setLeft(new Node(4));
        root2.getRight().setRight(new Node(5));
        System.out.println("Checking the give tree is identical or not =="+checkIfTreeIdentical(root1, root2));
    }

    private static boolean checkIfTreeIdentical(Node root1, Node root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null) return false;
        if(root2 == null) return false;
        if(root1.getData() != root2.getData()) return false;
        boolean left = checkIfTreeIdentical(root1.getLeft(), root2.getLeft());
        boolean right = checkIfTreeIdentical(root1.getRight(), root2.getRight());
        return left && right;
    }
}
