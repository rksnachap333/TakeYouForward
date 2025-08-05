package org.example.BinarySearchTree.PracticeProblem;


import org.example.BinarySearchTree.Node;

import java.util.Stack;

// Single Iterator for next and before
public class BSTSingleIterator {

    private Stack<Node> stack = new Stack<>();
    private boolean isReverse = false;
    public BSTSingleIterator(Node root, boolean isReverse) {
        this.isReverse = isReverse;
        pushAll(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        Node temp = stack.pop();
        if(isReverse){
            pushAll(temp.getLeft());
        } else{
            pushAll(temp.getRight());
        }

        return temp.getData();
    }

    private void pushAll(Node root) {
        while(root != null) {
            stack.push(root);
            if(isReverse){
                root = root.getRight();
            } else{
                root = root.getLeft();
            }
        }
    }
}
