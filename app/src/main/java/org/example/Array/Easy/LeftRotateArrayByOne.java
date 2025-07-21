package org.example.Array.Easy;

public class LeftRotateArrayByOne {
    public static int[] leftRotate(int[] arr) {

        if (arr == null || arr.length == 0 || arr.length == 1) {
            return arr; // No rotation needed for empty or single-element arrays
        }
        int storeStart = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = storeStart;

        return arr;
    }
}
