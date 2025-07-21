package org.example.Array.Easy;

import java.util.Arrays;

public class LargestElementInAnArray {

    // Complexity: O(nlogn)
    public static int largestElement1(int[] arr) {
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    // Complexity: O(n)
    public static int largestElement2(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
