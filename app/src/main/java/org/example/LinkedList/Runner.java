package org.example.LinkedList;

import org.example.LinkedList.Easy.InsertHeadAtTheBegining;
import org.example.LinkedList.Easy.Node;

public class Runner {
    public static void main(String[] args) {

        // Create a linked list with some nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printList(head);

        // Insert a new node at the head
        head = InsertHeadAtTheBegining.insertAtHead(head, 0);

        // Print the modified linked list
        System.out.print("Modified Linked List: ");
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
