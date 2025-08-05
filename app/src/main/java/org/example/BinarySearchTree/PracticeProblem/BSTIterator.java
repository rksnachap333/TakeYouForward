package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinaryTree.Node;

import java.util.Stack;

public class BSTIterator {

    private static  Stack<Node> nextStack = new Stack<>();
    private static  Stack<Node> beforeStack = new Stack<>();
    public static void runner() {
        Node root = new Node(7);
        root.setLeft(new Node(3));
        root.getLeft().setLeft(new Node(2));
        root.getLeft().getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(6));
        root.getLeft().getRight().setLeft(new Node(5));
        root.getLeft().getRight().getLeft().setLeft(new Node(4));
        root.setRight(new Node(10));
        root.getRight().setLeft(new Node(9));
        root.getRight().getLeft().setLeft(new Node(8));
        root.getRight().setRight(new Node(11));
        System.out.println();
        traverseTreeForNext(root);
        traverseTreeForBefore(root);
        Node nextNode = next();
        System.out.println("Next =="+(nextNode != null ? nextNode.getData(): null));
        nextNode = next();
        System.out.println("Next =="+(nextNode != null ? nextNode.getData(): null));
        nextNode = next();
        System.out.println("Next =="+(nextNode != null ? nextNode.getData(): null));
        System.out.println("HasNext =="+hasNext());
        nextNode = next();
        System.out.println("Next =="+(nextNode != null ? nextNode.getData(): null));
        nextNode = next();
        System.out.println("Next =="+(nextNode != null ? nextNode.getData(): null));
        nextNode = next();
        System.out.println("Next =="+(nextNode != null ? nextNode.getData(): null));
        System.out.println("HasNext =="+hasNext());

        Node beforeNode = before();
        System.out.println("Before =="+(beforeNode != null ? beforeNode.getData(): null));
        beforeNode = before();
        System.out.println("Before =="+(beforeNode != null ? beforeNode.getData(): null));
        beforeNode = before();
        System.out.println("Before =="+(beforeNode != null ? beforeNode.getData(): null));
    }

    private static void traverseTreeForNext(Node root) {
        while(root != null) {
            nextStack.push(root);
            root = root.getLeft();
        }
    }

    private static void traverseTreeForBefore(Node root) {
        while(root != null) {
            beforeStack.push(root);
            root = root.getRight();
        }
    }

    private static boolean hasNext() {
        return !nextStack.isEmpty();
    }

    private static boolean hasBefore() {
        return !beforeStack.isEmpty();
    }

    private static Node next() {
        if(!nextStack.isEmpty()){
           Node poppedEle = nextStack.pop();
            traverseTreeForNext(poppedEle.getRight());
            return poppedEle;
        }
        return null;
    }


    private static Node before() {
        if(!beforeStack.isEmpty()) {
            Node poppedEle = beforeStack.pop();
            traverseTreeForBefore(poppedEle.getLeft());
            return poppedEle;
        }

        return null;
    }


}
