package org.example.BinaryTree.Traversal;

import org.example.BinaryTree.Node;

import java.util.Stack;

public class PostOrder {
    public static void runner() {
        System.out.println("---------Implementing PostOrder Traversal-------------");
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

        postOrderTraversal(root);
        System.out.println();
        postOrderTraversalIterative(root);
        postOrderTraversalIterativeUsingTwoStack(root);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        System.out.print(root.getData() + " ");
    }

    public static void postOrderTraversalIterative(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.getLeft();
            } else {
                Node temp = stack.peek().getRight();
                if (temp != null) {
                    curr = temp;
                } else {
                    temp = stack.pop();
                    System.out.print(temp.getData() + " ");
                    while (!stack.isEmpty() && stack.peek().getRight() == temp) {
                        temp = stack.pop();
                        System.out.print(temp.getData() + " ");
                    }
                }
            }
        }
        System.out.println();
    }

    public static void postOrderTraversalIterativeUsingTwoStack(Node root) {
        if (root == null) return;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> traversalOrder = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()) {
            Node temp = stack1.pop();
            traversalOrder.push(temp);
            if(temp.getLeft() != null) stack1.push(temp.getLeft());
            if(temp.getRight() != null) stack1.push(temp.getRight());
        }
        while(!traversalOrder.isEmpty()) {
            System.out.print(traversalOrder.pop().getData() + " ");
        }

        System.out.println();
    }
}
