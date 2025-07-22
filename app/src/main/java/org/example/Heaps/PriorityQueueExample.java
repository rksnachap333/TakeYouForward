package org.example.Heaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * A PriorityQueue in Java is a special type of queue in which elements are ordered
 * based on their priority rather than the order in which they were added.
 */

/*
🔹 Key Points:
** Elements with higher priority are dequeued before lower priority ones.

** It is part of the java.util package and implements the Queue interface.

** Internally uses a min-heap (by default) for ordering.
 */
public class PriorityQueueExample {

    private static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private static PriorityQueue<Integer> maxHeap1 = new PriorityQueue<>(Comparator.reverseOrder());

    public static void addData(int data) {
        priorityQueue.add(data);
    }

    public static void printPriorityQueue() {
//        while (!priorityQueue.isEmpty()) {
//            System.out.println(priorityQueue.poll());
//        }

        for (Integer data : priorityQueue) {
            System.out.println("Priority queue after insertion ====>" + data);
        }

    }

    public static void insertInMaxHeap(int data) {
        maxHeap.add(data);
        maxHeap1.add(data);
    }

    public static void printMaxHeap() {
        for (Integer data : maxHeap) {
            System.out.print("Max Heap 1 after insertion ====>" + data);
        }
        System.out.println();
        for (Integer data : maxHeap1) {
            System.out.print("Max Heap 2 after insertion ====>" + data);
        }

    }
}
