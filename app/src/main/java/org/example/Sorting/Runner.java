package org.example.Sorting;

public class Runner {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };

        // Selection Sort
        int[] selectionSorted = SelectionSort.selectionSort(arr.clone());
        System.out.println("Selection Sort: " + java.util.Arrays.toString(selectionSorted));

        // Insertion Sort
        int[] insertionSorted = InsertionSor.insertionSort(arr.clone());
        System.out.println("Insertion Sort: " + java.util.Arrays.toString(insertionSorted));

        // Bubble Sort
        int[] bubbleSorted = BubbleSort.bubbleSort(arr.clone());
        System.out.println("Bubble Sort: " + java.util.Arrays.toString(bubbleSorted));

        // Merge Sort
        MergeSort mergeSort = new MergeSort();
        int[] mergeSorted = mergeSort.mergeSort(arr.clone(), 0, arr.length - 1);
        System.out.println("Merge Sort: " + java.util.Arrays.toString(mergeSorted));
    }

}
