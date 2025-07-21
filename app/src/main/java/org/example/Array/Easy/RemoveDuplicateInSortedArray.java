package org.example.Array.Easy;

public class RemoveDuplicateInSortedArray {
    public static int[] removeDuplicates(int[] arr) {

        if (arr == null || arr.length == 0 || arr.length == 1) {
            return arr;
        }

        int i = 0;

        for (; i < arr.length; i++) {
            int j = i + 1;
            while (j < arr.length && arr[j] <= arr[i]) {
                j++;
            }
            if (j == arr.length && i < arr.length - 1) {
                arr[i + 1] = arr[j - 1];
                i++;
                break; // No more elements to process
            } else if (j == arr.length && i == arr.length - 1) {
                i++;
                break; // No more elements to process
            }
            arr[i + 1] = arr[j];

        }

        while (i < arr.length) {
            arr[i] = -1; // Fill the remaining elements with 0
            i++;
        }
        return arr;
    }
}
