package org.example.BinarySearchTree;

import org.example.BinarySearchTree.Concept.MinAndMaxInBST;
import org.example.BinarySearchTree.Concept.SearchNode;
import org.example.BinarySearchTree.PracticeProblem.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------Binary Search Tree Problems------------");
        SearchNode.runner();
        MinAndMaxInBST.runner();
        CeilOfNodeInBST.runner();
        FloorOfNodeInBST.runner();
        InsertGivenNodeInBST.runner();
        KthSmallestAndKthLargest.runner();
        CheckWhetherTreeIsBST.runner();
        DeleteANodeInBST.runner();
        LCAFinder.runner();
        BSTFromPreorder.runner();
        InorderSuccessor.runner();
        BSTIterator.runner();
        Node root = createBST();
        BSTPairSum bstPairSum = new BSTPairSum(root);
        boolean isSumPresent = bstPairSum.checkSum(17);
        System.out.println("Check sum is present ? "+isSumPresent);
        CorrectBSTWithTwoNodeSwapped.runner();
        LongestBST.runner();

    }

    private static Node createBST() {
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
        return root;
    }
}
