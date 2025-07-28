package org.example.BinarySearchTree.Concept;

import org.example.BinarySearchTree.Node;

public class SearchNode {

    public static void runner() {
        Node root = new Node(8);
        //Left subtree
        root.setLeft(new Node(5));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(7));
        root.getLeft().getRight().setLeft(new Node(6));

        // Right subtree
        root.setRight(new Node(12));
        root.getRight().setLeft(new Node(10));
        root.getRight().setRight(new Node(14));
        root.getRight().getRight().setLeft(new Node(13));

        Node searchNode =seearchNode(root, 10);
        if(searchNode != null)
            System.out.println("Search node ==="+searchNode.getData());
        else
            System.out.println("Searching node not found.");
    }

    private static Node seearchNode(Node root, int val) {
        while(root != null && root.getData() != val) {
            root = val < root.getData() ? root.getLeft() : root.getRight();
        }
        return root;

    }
}
