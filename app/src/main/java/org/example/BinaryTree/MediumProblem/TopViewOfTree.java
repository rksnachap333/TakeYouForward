package org.example.BinaryTree.MediumProblem;

import org.example.BinaryTree.Node;

import java.util.*;

public class TopViewOfTree {

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
        List<List<Integer>> res = verticalOrder(root);
        System.out.print("Top view of tree ===> ");
        for(List<Integer> col : res) {
            System.out.print(col.get(0) + "   ");
        }
        System.out.println();

    }
    
    public static List<List<Integer>> verticalOrder(Node root) {
        Map<Integer, Map<Integer, TreeSet<Integer>>> nodes = new TreeMap<>();
        Queue<Pair<Node, Pair<Integer, Integer>>> todo = new LinkedList<>();

        todo.add(new Pair<>(root, new Pair<>(0, 0)));

        while(!todo.isEmpty()) {
           Pair<Node, Pair<Integer, Integer>> p = todo.poll();
           Node temp = p.getKey();
           // x -> Vertical
           int x = p.getValue().getKey();
            // y -> level
           int  y = p.getValue().getValue();

           nodes.computeIfAbsent(x, k-> new TreeMap<>())
                   .computeIfAbsent(y, k -> new TreeSet<>())
                   .add(temp.getData());

           if(temp.getLeft() != null) {
                todo.offer(new Pair<>(temp.getLeft(), new Pair<>(x-1, y+1)));
           }

           if(temp.getRight() != null) {
               todo.offer(new Pair<>(temp.getRight(), new Pair<>(x+1, y+1)));
           }

        }

        List<List<Integer>> ans = new ArrayList<>();

        for(Map.Entry<Integer, Map<Integer, TreeSet<Integer>>> entry : nodes.entrySet()) {
            List<Integer> col = new ArrayList<>();
            for(TreeSet<Integer> set : entry.getValue().values()) {
                col.addAll(set);
            }
            ans.add(col);
        }

        return ans;

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
