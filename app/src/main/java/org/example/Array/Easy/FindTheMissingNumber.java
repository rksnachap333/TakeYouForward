package org.example.Array.Easy;

public class FindTheMissingNumber {

    // We can check number one by one in array for presence as well
    // We can have hashed array to check presence of number
    // We can use sumation method to find missing number
    // We can use XOR method to find missing number

    // Sumation method
    public static int findMissingNumber(int[] arr, int n) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return -1; // Return -1 if the array is null or empty
        }

        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num; // Calculate the sum of elements in the array
        }

        return expectedSum - actualSum; // The missing number is the difference between expected and actual sum
    }

    public static int findMissingNumber1(int[] arr, int n) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return -1; // Return -1 if the array is null or empty
        }

        int xor = 0;
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        for (int num : arr) {
            xor ^= num;
        }

        return xor;

    }
}
