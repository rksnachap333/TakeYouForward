package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinarySearchTree.Node;

public class BSTPairSum {
    private Node root;

    public BSTPairSum(Node root) {
        this.root = root;
    }

    public boolean checkSum(int checkSum) {
        if(root == null) return false;
        BSTSingleIterator bstSingleIterator1 = new BSTSingleIterator(root, false);
        BSTSingleIterator bstSingleIterator2 = new BSTSingleIterator(root, true);
        int i = bstSingleIterator1.next(); // smaller value
        int j = bstSingleIterator2.next(); // larger value
        while(i < j) {
            if(i +j == checkSum) return true;
            else if (i+j < checkSum) {
                i = bstSingleIterator1.next();
            } else{
                j = bstSingleIterator2.next();
            }
        }

        return false;
    }

}


