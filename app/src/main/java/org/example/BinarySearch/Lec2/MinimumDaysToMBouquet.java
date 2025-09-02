package org.example.BinarySearch.Lec2;

import java.util.Arrays;

public class MinimumDaysToMBouquet {

    public static void runner() {

        int[] arr = new int[]{7, 7, 7, 7, 13, 11, 12, 7};
        int noOfBouquet = 2;
        int noOfFlowersNeeded = 3;
        int minimumDaysNeeded = minimumDaysNeeded(arr, noOfBouquet, noOfFlowersNeeded);
        System.out.println("(Brute Force) Minimum no of days needed ===" + minimumDaysNeeded);
        int minimumDaysNeededBinarySearch = minimumDaysNeededBinarySearch(arr, noOfBouquet, noOfFlowersNeeded);
        System.out.println("(Binary Search) Minimum no of days needed ===" + minimumDaysNeededBinarySearch);

    }

    //Brute Force approach complexity = O((max-min+1) * sizeOfarr)
    private static int minimumDaysNeeded(int[] arr, int noOfBouquet, int noOfFlowersNeeded) {
        if (arr.length < noOfBouquet * noOfFlowersNeeded) return -1;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        for (int i = min; i <= max; i++) {
            if (possibleOrNot(arr, i, noOfFlowersNeeded, noOfBouquet)) return i;
        }
        return -1;
    }

    //BinarySearch approach
    private static int minimumDaysNeededBinarySearch(int[] arr, int noOfBouquet, int noOfFlowersNeeded) {
        if (arr.length < noOfBouquet * noOfFlowersNeeded) return -1;
        int lo = Arrays.stream(arr).min().getAsInt();
        int hi = Arrays.stream(arr).max().getAsInt();
        int minDay = -1;

        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            if (possibleOrNot(arr, mid, noOfFlowersNeeded, noOfBouquet)) {
                minDay = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return minDay;
    }

    private static boolean possibleOrNot(int[] arr, int day, int req_flower, int noOfBouquet) {
        int bouquetCount = 0;
        int counter = 0;
        for (int flower : arr) {
            if (flower <= day) {
                counter++;
            } else {
                bouquetCount += counter / req_flower;
                counter = 0;
            }
        }
        bouquetCount += counter / req_flower;
        return bouquetCount >= noOfBouquet;
    }
}
