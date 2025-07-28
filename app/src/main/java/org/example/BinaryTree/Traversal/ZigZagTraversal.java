package org.example.BinaryTree.Traversal;

import org.example.BinaryTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
    public static void runner() {
        System.out.println("---------Implementing ZigZag Traversal-------------");
        Node root = new Node(1);

        // Left subtree
        root.setLeft(new Node(2));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));

        //Right Subtree
        root.setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(7));

        zigZagTraversal(root);
    }

    private static void zigZagTraversal(Node root) {
        if(root == null) return;
        boolean isLeftToRight = true;
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node temp = queue.poll();
               if(isLeftToRight) {
                   row.add(temp.getData());
               } else{
                   row.add(0, temp.getData());
               }
                if(temp.getLeft() != null) queue.offer(temp.getLeft());
                if(temp.getRight() != null) queue.offer(temp.getRight());
            }
            isLeftToRight = !isLeftToRight;
            ans.add(row);
        }

        for(List<Integer>level : ans) {
            for(int i = 0; i< level.size(); i++) {
                System.out.print(level.get(i) + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }
}
