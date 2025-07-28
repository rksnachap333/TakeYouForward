package org.example.BinaryTree.Traversal;

import org.example.BinaryTree.Node;

import java.util.Stack;

public class Inorder {

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

        inOrderTraversal(root);
        System.out.println();
        inOrderTraversalIterative(root);
    }

    public static void inOrderTraversal(Node root) {
        if(root == null) return;
        inOrderTraversal(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrderTraversal(root.getRight());
    }

    public static void inOrderTraversalIterative(Node root) {
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(true) {
            if(curr != null) {
                stack.push(curr);
                curr = curr.getLeft();
            } else {
                if(stack.isEmpty()) break;
                curr = stack.pop();
                System.out.print(curr.getData() + " ");
                curr = curr.getRight();
            }
        }
        System.out.println();
    }
}
