package org.example.LinkedList.Easy;

public class InsertHeadAtTheBegining {
    public static Node insertAtHead(Node head, int val) {
        Node newheadNode = new Node(val);
        if (head == null) {
            head = newheadNode;
        }

        newheadNode.next = head;
        head = newheadNode;

        return head;
    }
}
