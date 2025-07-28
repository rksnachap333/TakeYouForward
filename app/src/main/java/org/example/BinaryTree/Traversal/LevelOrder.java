package org.example.BinaryTree.Traversal;

import org.example.BinaryTree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public static void runner() {
        System.out.println("---------Implementing LeverOrder Traversal-------------");
        Node root = new Node(1);

        // Left subtree
        root.setLeft(new Node(2));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));

        //Right Subtree
        root.setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(7));

        levelOrderTraversal(root);

    }

    public static void levelOrderTraversal(Node root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int size = queue.size();
            for(int i = 0 ; i < size; i++) {
                Node temp = queue.poll();
                level.add(temp.getData());
                if(temp.getLeft() != null) queue.offer(temp.getLeft());
                if(temp.getRight() != null) queue.offer(temp.getRight());
            }
            ans.add(level);
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
