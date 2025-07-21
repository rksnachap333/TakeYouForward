package org.example.Array.Easy;

import java.util.Arrays;

public class SecondLargestElementInArray {

    // Complexity: O(n log n) due to sorting
    public static int secondLargestElement(int[] arr) {
        if (arr.length < 2) {
            return arr[0]; // If there's only one element, return it as the second largest
        }

        Arrays.sort(arr); // Sort the array in ascending order
        int secondLargestElement = arr[arr.length - 2]; // The largest element is at the end
        return secondLargestElement; // Return the second largest element
    }

    public static int secondLargestElement2(int[] arr) {
        if (arr.length < 2) {
            return arr[0]; // If there's only one element, return it as the second largest
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest; // Update second largest before updating first largest
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i]; // Update second largest only if it's not equal to first largest
            }
        }

        return secondLargest; // Return the second largest element
    }
}
