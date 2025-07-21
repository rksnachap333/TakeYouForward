package org.example.LinkedList.Easy;

public class DeleteTailNode {
    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node current = head;

        while (current.next != null && current.next.next != null) {
            current = current.next;
        }

        current.next = null;

        return head;

    }
}
