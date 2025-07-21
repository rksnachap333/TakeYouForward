package org.example.Sorting;

public class InsertionSor {
    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                // Swap the elements
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void insertion_sort_recursive(int[] arr, int start, int n) {
        if (start >= n)
            return;

        int j = start;
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap the elements
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }

        insertion_sort_recursive(arr, start + 1, n);

    }

}
