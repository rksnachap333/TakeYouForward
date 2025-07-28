package org.example.BinaryTree.MediumProblem;

import org.example.BinaryTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightAndLeftViewOfTree {
    public static void runner() {
        Node root = new Node(1);
        //Left subtree
        root.setLeft(new Node(2));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(10));
        root.getLeft().getLeft().setRight(new Node(5));
        root.getLeft().getLeft().getRight().setRight(new Node(6));

        //Right subtree
        root.setRight(new Node(3));
        root.getRight().setLeft(new Node(9));
        root.getRight().setRight(new Node(11));
        List<List<Integer>> levelOrder = levelOrderTraversal(root);
        System.out.print("Left View ===>");
        for (List<Integer> row : levelOrder) {
            System.out.print(row.get(0) + " ");
        }
        System.out.println();

        System.out.print("Right View ===>");
        for (List<Integer> row : levelOrder) {
            System.out.print(row.get(row.size()-1) + " ");
        }
        System.out.println();

    }

    public static List<List<Integer>> levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            for(int i = 0; i< size; i++) {
                Node temp = queue.poll();
                row.add(temp.getData());
                if(temp.getLeft() != null) {
                    queue.offer(temp.getLeft());
                }
                if(temp.getRight() != null) {
                    queue.offer(temp.getRight());
                }
            }
            ans.add(row);
        }

        return ans;
    }
}
