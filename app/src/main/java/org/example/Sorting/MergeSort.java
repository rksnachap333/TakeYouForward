package org.example.Sorting;

public class MergeSort {
    public int[] mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return arr;
        }

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        return merge(arr, low, mid, high);
    }

    private int[] merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        if (i <= mid) {
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
        } else {
            while (j <= high) {
                temp[k++] = arr[j++];
            }
        }

        for (int m = 0; m < temp.length; m++) {
            arr[low + m] = temp[m];
        }

        return arr;

    }

}
