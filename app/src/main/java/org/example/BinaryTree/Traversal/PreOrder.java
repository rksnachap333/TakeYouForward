package org.example.BinaryTree.Traversal;

import org.example.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Stack;

public class PreOrder {
    public static void runner() {
        System.out.println("---------Implementing PreOrder Traversal-------------");
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

        preOrderTraversal(root);
        System.out.println();
        preOrderTraversalIterative(root);

    }

    private static void preOrderTraversal(Node root) {
        if(root == null) return;
        System.out.print(root.getData() + " ");
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }

    private static void preOrderTraversalIterative(Node root) {
        if(root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.getData() + " ");
            if(temp.getRight() != null) stack.push(temp.getRight());
            if(temp.getLeft() != null) stack.push(temp.getLeft());

        }
        System.out.println();
    }

}
