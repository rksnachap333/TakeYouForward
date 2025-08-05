package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinarySearchTree.Node;

public class LongestBST {

    public static void runner() {
        Node root = new Node(20);
        root.setLeft(new Node(15));
        root.getLeft().setLeft(new Node(14));
        root.getLeft().getLeft().setRight(new Node(17));
        root.getLeft().setRight(new Node(18));
        root.getLeft().getRight().setLeft(new Node(16));
        root.getLeft().getRight().setRight(new Node(17));

        root.setRight(new Node(40));
        root.getRight().setLeft(new Node(30));
        root.getRight().setRight(new Node(60));
        root.getRight().getRight().setLeft(new Node(50));
        int size = helperClass(root);
        System.out.println();
        System.out.println("Max BST Size ===="+size);
    }


    static class NodeValue{
        public int maxNode;
        public int minNode;
        public int bstSize;

        public NodeValue(int maxNode, int minNode, int bstSize) {
            this.maxNode = maxNode;
            this.minNode = minNode;
            this.bstSize = bstSize;
        }
    }

    public static NodeValue calculateMaxBST(Node root) {
        if(root == null) return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        NodeValue left = calculateMaxBST(root.getLeft());
        NodeValue right = calculateMaxBST(root.getRight());

        if(root.getData() > left.maxNode && root.getData() < right.minNode)
            return new NodeValue(Math.min(root.getData(), left.minNode), Math.max(root.getData(), right.maxNode),1 + left.bstSize + right.bstSize);

        else{
            return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.bstSize, right.bstSize));
        }

    }

    public static int helperClass(Node root) {
        NodeValue nodeValue = calculateMaxBST(root);
        return nodeValue.bstSize;
    }


}
