package org.example.BinarySearchTree.PracticeProblem;

import org.example.BinaryTree.Node;

public class BSTFromPreorder {

    public static void runner() {
        int[] preOrder = new int[] {8, 5, 1, 7, 10, 12};
        System.out.println("Preorder of tree from array ===");
        for(int node : preOrder) {
            System.out.print( node + " ");
        }
        Node root = formBST(preOrder, Integer.MAX_VALUE, new int[]{0});
        System.out.println();
        System.out.println("Preorder of tree from tree formed ===");
        preOrder(root);
    }

    private static Node formBST(int[] preOrder, int bound, int[] i){
        if(i[0] == preOrder.length || preOrder[i[0]] > bound)return null;
        Node root = new Node(preOrder[i[0]++]);
        root.setLeft(formBST(preOrder, root.getData(), i));
        root.setRight(formBST(preOrder,bound, i));
        return root;
    }

    private static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.getData()+" ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

}
