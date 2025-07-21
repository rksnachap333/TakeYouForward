package org.example.BitManipulation;

public class FindTheNumberThatFoundOddNumberTimes {
    public static int findOddNUmberOfOccurrences(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }

        return ans;
    }
}
