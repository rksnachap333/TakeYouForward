package org.example.BinaryTree;

import org.example.BinaryTree.MediumProblem.*;
import org.example.BinaryTree.Traversal.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------- TREE PROBLEM SOLVING-----------");
        Inorder.runner();
        PreOrder.runner();
        PostOrder.runner();
        LevelOrder.runner();
        ZigZagTraversal.runner();
        HeightOfTheTree.runner();
        CheckBinaryTreeIsHeightBalanced.runner();
        DiameterOfTree.runner();
        MaximumSumPath.runner();
        CheckIfTreeIdentical.runner();
        BoundaryTraversal.runner();
        VerticalOrderTraversal.runner();
        TopViewOfTree.runner();
        RightAndLeftViewOfTree.runner();
    }
}
