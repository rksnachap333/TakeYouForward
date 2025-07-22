package org.example.Heaps;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is main of heap problem!!");
        PriorityQueueExample.addData(30);
        PriorityQueueExample.addData(20);
        PriorityQueueExample.addData(10);
        PriorityQueueExample.addData(40);
        PriorityQueueExample.printPriorityQueue();

        System.out.println("------------Max Heap ----------------------");
        PriorityQueueExample.insertInMaxHeap(30);
        PriorityQueueExample.insertInMaxHeap(20);
        PriorityQueueExample.insertInMaxHeap(10);
        PriorityQueueExample.insertInMaxHeap(40);
        PriorityQueueExample.printMaxHeap();
    }
}
