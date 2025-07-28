package org.example.BinaryTree.MediumProblem;

import org.example.BinaryTree.Node;

public class MaximumSumPath {

    public static void runner() {
        System.out.println("---------Maximum Path Sum-------------");
        Node root = new Node(-10);
        // Left subtree
        root.setLeft(new Node(9));
//        root.getLeft().setLeft(new Node(4));
//        root.getLeft().setRight(new Node(5));
//        root.getLeft().getRight().setLeft(new Node(6));

        //Right Subtree
        root.setRight(new Node(20));
        root.getRight().setLeft(new Node(15));
        root.getRight().setRight(new Node(7));
//        root.getRight().getRight().setLeft(new Node(9));
//        root.getRight().getRight().setRight(new Node(10));
        int[] maxSum = new int[1];
        maxSum[0] = 0;
        maximumSumPath(root, maxSum);
        System.out.println("Max path sum  === "+maxSum[0]);

    }

    private static int maximumSumPath(Node root, int[] maxSum) {
        if(root == null) return 0;
        int left = maximumSumPath(root.getLeft(), maxSum);
        int right = maximumSumPath(root.getRight(), maxSum);
        maxSum[0] = Math.max(maxSum[0], left + right + root.getData());
        return root.getData() + Math.max(left, right);
    }
}
