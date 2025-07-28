package org.example.BinaryTree.MediumProblem;

import org.example.BinaryTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryTraversal {

    public static void runner() {
        Node root = new Node(1);
        // Left subtree
        root.setLeft(new Node(2));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().getLeft().setRight(new Node(4));
        root.getLeft().getLeft().getRight().setLeft(new Node(5));
        root.getLeft().getLeft().getRight().setRight(new Node(6));

        // Right subtree
        root.setRight(new Node(7));
        root.getRight().setRight(new Node(8));
        root.getRight().getRight().setLeft(new Node(9));
        root.getRight().getRight().getLeft().setLeft(new Node(10));
        root.getRight().getRight().getLeft().setRight(new Node(11));
        List<Integer> res = new ArrayList<>();
        addLeftBoundary(root, res);
        addLeafNode(root, res);
        addRightBoundary(root.getRight(), res);

        System.out.print("Boundary of the tree : ");
        for(Integer data : res) {
            System.out.print(data + " ");
        }
        System.out.println();

    }
    private static boolean isLeafNode(Node node) {
        if(node == null) return false;
        return node.getLeft() == null && node.getRight() == null;
    }

    private static void addLeftBoundary(Node root, List<Integer> res){
        if(root == null) return;
        while(root != null){
            if(!isLeafNode(root)) res.add(root.getData());
            if(root.getLeft() != null) {
                root = root.getLeft();
            }else{
                root = root.getRight();
            }
        }
    }

    private static void addLeafNode(Node root, List<Integer> res){
        if(root == null) return;
        addLeafNode(root.getLeft(), res);
        if(isLeafNode(root)) res.add(root.getData());
        addLeafNode(root.getRight(), res);
    }

    private static void addRightBoundary(Node root, List<Integer> res) {
        Stack<Integer> stack = new Stack<>();
        while(root != null) {
            if(!isLeafNode(root)) stack.push(root.getData());
            if(root.getRight() != null)
                root = root.getRight();
            else
                root = root.getLeft();
        }

        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
    }
}
