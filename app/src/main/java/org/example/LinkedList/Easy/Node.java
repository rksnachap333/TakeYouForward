package org.example.LinkedList.Easy;

public class Node {
    public int val;
    public Node next;

    // Constructor to initialize a node with a value and no next node
    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
