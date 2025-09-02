package org.example.BinarySearch.Lec2;

import java.util.Arrays;

public class FindSmallestDivisorGivenAThreshold {

    public static void runner() {

        int[] arr = new int[]{8, 4, 2, 3};
        int limit = 10;
        int minDiv = findSmallestDivisor(arr, limit);
        System.out.println("(Brute Force )Smallest divisor == " + minDiv);
        int minDivBinary = findSmallestDivisorBinarySearch(arr, limit);
        System.out.println("(Binary Search)Smallest divisor == " + minDivBinary);
    }

    // Brute Force Approach
    private static int findSmallestDivisor(int[] arr, int limit) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int smallestDivisor = 0;
        int closestValue = 0;
        for (int i = min; i <= max; i++) {
            if (i != 0) {
                int divSum = findLimit(arr, i);
                if (divSum <= limit ) {
                   return i;
                }
            }
        }

        return smallestDivisor;
    }

    private static int findLimit(int[] arr, int divisor) {
        int limit = 0;
        for (int i = 0; i < arr.length; i++) {
            limit += Math.ceil((double) arr[i] / (double) divisor);
        }
        return limit;
    }

    private static int findSmallestDivisorBinarySearch(int[] arr, int limit) {
        int lo = Arrays.stream(arr).min().getAsInt();
        int hi = Arrays.stream(arr).max().getAsInt();

        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            int divSum = findLimit(arr, mid);
            if (divSum <= limit) {
                hi = mid -1;
            } else{
                lo = mid + 1;
            }
        }

        return lo;
    }
}
