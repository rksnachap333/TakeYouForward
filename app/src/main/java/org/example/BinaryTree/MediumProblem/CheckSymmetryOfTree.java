package org.example.BinaryTree.MediumProblem;

import org.example.BinaryTree.Node;

public class CheckSymmetryOfTree {

    public static void runner() {

    }

    private static boolean checkSymmetry(Node root1, Node root2) {
        if(root1 == null || root2 == null) {
            return root1 == root2;
        }

        return (root1.getData() == root2.getData())
                && checkSymmetry(root1.getLeft(), root2.getRight())
                && checkSymmetry(root1.getRight(), root2.getLeft());
    }
}
