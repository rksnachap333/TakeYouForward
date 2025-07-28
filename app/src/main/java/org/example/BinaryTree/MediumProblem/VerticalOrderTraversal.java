package org.example.BinaryTree.MediumProblem;

import org.example.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class VerticalOrderTraversal {

    public static void runner() {
        Node root = new Node(1);
        // left subtree
        root.setLeft(new Node(2));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(10));
        root.getLeft().getLeft().setRight(new Node(5));
        root.getLeft().getLeft().getRight().setRight(new Node(6));

        // right subtree
        root.setRight(new Node(3));
        root.getRight().setLeft(new Node(9));
        root.getRight().setRight(new Node(11));
        System.out.println("Going to find vertical Order");
        List<List<Integer>> res = findVertical(root);

        // Print the result
        System.out.println("Vertical Traversal: ");
        printResult(res);
    }

    public static List<List<Integer>> findVertical(Node root) {
        // Map to store nodes based on
        // vertical and level information
        Map<Integer, Map<Integer, TreeSet<Integer>>> nodes = new TreeMap<>();

        // Queue for BFS traversal, each
        // element is a pair containing node
        // and its vertical and level information
        Queue<Pair<Node, Pair<Integer, Integer>>> todo = new LinkedList<>();

        // Push the root node with initial vertical
        // and level values (0, 0)
        todo.add(new Pair<>(root, new Pair<>(0, 0)));

        // BFS traversal
        while (!todo.isEmpty()) {
            // Retrieve the node and its vertical
            // and level information from
            // the front of the queue
            Pair<Node, Pair<Integer, Integer>> p = todo.poll();
            Node temp = p.getKey();

            // Extract the vertical and level information
            // x -> vertical
            int x = p.getValue().getKey();
            // y -> level
            int y = p.getValue().getValue();

            // Insert the node value into the
            // corresponding vertical and level
            // in the map
            nodes.computeIfAbsent(x, k -> new TreeMap<>())
                    .computeIfAbsent(y, k -> new TreeSet<>())
                    .add(temp.getData());

            // Process left child
            if (temp.getLeft() != null) {
                todo.add(new Pair<>(temp.getLeft(), new Pair<>(x - 1, y + 1)));
            }

            // Process right child
            if (temp.getRight() != null) {
                todo.add(new Pair<>(temp.getRight(), new Pair<>(x + 1, y + 1)));
            }
        }

        // Prepare the final result list
        // by combining values from the map
        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, Map<Integer, TreeSet<Integer>>> entry : nodes.entrySet()) {
            List<Integer> col = new ArrayList<>();
            for (TreeSet<Integer> set : entry.getValue().values()) {
                // Insert node values
                // into the column list
                col.addAll(set);
            }
            // Add the column list
            // to the final result
            ans.add(col);
        }
        return ans;
    }

    // Helper function to
    // print the result
    private static void printResult(List<List<Integer>> result) {
        for (List<Integer> level : result) {
            for (int node : level) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static class Pair<K, V> {
        public final K key;
        public final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }


}
