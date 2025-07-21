package org.example.Array.Easy;

public class MaximumConsecutiveOne {

    public static int maximumConsecutiveOne(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Return 0 for empty or null arrays
        }

        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++; // Increment count for consecutive 1s
            } else {
                maxCount = Math.max(maxCount, currentCount); // Update max count if needed
                currentCount = 0; // Reset count for 0
            }
        }

        return Math.max(maxCount, currentCount);

    }
}