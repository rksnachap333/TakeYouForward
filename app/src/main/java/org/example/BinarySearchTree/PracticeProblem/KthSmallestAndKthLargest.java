package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinarySearchTree.Node;

public class KthSmallestAndKthLargest {

    public static void runner() {
        Node root = new Node(10);
        //Left subtree
        root.setLeft(new Node(5));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(6));
        root.getLeft().getRight().setRight(new Node(9));
        root.getLeft().getLeft().setLeft(new Node(2));
        root.getLeft().getLeft().setRight(new Node(4));

        // Right subtree
        root.setRight(new Node(13));
        root.getRight().setLeft(new Node(11));
        root.getRight().setRight(new Node(14));
        int[] counter = new int[] {0};
        int[] kthSmallest = new int[]{0};
        findKthSmallest(root, counter, kthSmallest, 3);
        System.out.println("3rd smallest no ==="+kthSmallest[0]);
        counter[0] = 0;
        int[] kthLargest = new int[]{0};
        findKthLargest(root, counter, kthLargest,3);
        System.out.println("3rd largest no ===="+kthLargest[0]);
    }

    private static void findKthSmallest(Node root, int[] counter, int[] kthSmallest, int k){
        if(root == null || counter[0] >= k) return;
        findKthSmallest(root.getLeft(),counter, kthSmallest, k);
        counter[0]++;
        if(counter[0] == k) {
            kthSmallest[0] = root.getData();
        }
        findKthSmallest(root.getRight(),counter, kthSmallest, k);
    }

    private static void findKthLargest(Node root, int[] counter, int[] kthBiggest, int k) {
        if(root == null || counter[0] >= k) return;
        findKthLargest(root.getRight(), counter, kthBiggest, k);
        counter[0]++;
        if(counter[0] == k){
            kthBiggest[0] = root.getData();
        }
        findKthLargest(root.getLeft(), counter, kthBiggest, k);
    }
}
