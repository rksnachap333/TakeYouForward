package org.example.Array.Easy;;

public class LongestSubArrayWithGivenSum {

    public static int longestSubArrayWithGivenSum(int[] arr, int targetSum) {
        if (arr == null || arr.length == 0) {
            return 0; // Return 0 for empty or null arrays
        }

        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j]; // Calculate the sum of the subarray
                if (currentSum == targetSum) {
                    maxLength = Math.max(maxLength, j - i + 1); // Update max length if sum matches target
                }
            }
        }

        return maxLength; // Return the length of the longest subarray with the given sum
    }

}
