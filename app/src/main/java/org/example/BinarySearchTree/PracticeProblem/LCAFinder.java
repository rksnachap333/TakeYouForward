package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinaryTree.Node;

public class LCAFinder {

    public static void runner() {

        Node root = new Node(10);
        root.setLeft(new Node(4));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(8));
        root.getLeft().getLeft().setLeft(new Node(1));
        root.getLeft().getLeft().getLeft().setRight(new Node(1));
        root.getLeft().getRight().setLeft(new Node(6));
        root.getLeft().getRight().setRight(new Node(9));
        root.getLeft().getRight().getLeft().setLeft(new Node(5));
        root.getLeft().getRight().getLeft().setRight(new Node(7));

        root.setRight(new Node(13));
        root.getRight().setLeft(new Node(11));
        root.getRight().setRight(new Node(15));
        System.out.println();
        System.out.println("---------------LCA of FINDING-----------------");
        Node lcaNode = findLCA(root, root.getLeft().getRight().getLeft().getLeft(),root.getLeft().getRight().getRight());

        System.out.println("LCA of 5 and 9 is ===="+lcaNode.getData());

    }

    private static Node findLCA(Node root, Node p, Node q) {

        if(root == null) return null;
        int curr = root.getData();
        if(curr < p.getData() && curr < q.getData()) {
            return findLCA(root.getRight(), p, q);
        }
        if(curr > p.getData() && curr > q.getData()) {
            return findLCA(root.getLeft(), p, q);
        }

        return root;
    }
}
