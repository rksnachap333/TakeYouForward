package org.example.Sorting;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1); // Before pi
            quickSort(arr, pi + 1, high); // After pi
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the FIRST element as pivot
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < high - 1) {
                i++;
            }

            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j); // Swap pivot with arr[j]
        return j; // Return the partition index

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
