package org.example.BinarySearch.Lec2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinCapacityToShipPackageWithinDDays {

    public static void runner() {
        int[] weights = new int[]{5, 4, 5, 2, 3, 4, 5, 6};
        int day = 5;

        int minCapacity = findMinimumCapacity(weights, day);
        System.out.println("(Brute Force) Min weight needed ==" + minCapacity);
        int minCapacityBinary = findMinimumCapacityBinary(weights, day);
        System.out.println("(Binary Search) Min weight needed ==" + minCapacityBinary);
    }

    //Brute Force
    private static int findMinimumCapacity(int[] arr, int day) {
        int min = Arrays.stream(arr).max().getAsInt();
        int max = Arrays.stream(arr).sum();
        for (int i = min; i <= max; i++) {
            int tripNeeded = getTheNeededTrip(arr, i);
            if (tripNeeded == day) {
                return i;
            }
        }
        return -1;
    }

    private static int getTheNeededTrip(int[] arr, int capacity) {
        int neededTrip = 0;
        int tempWeightCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (tempWeightCount + arr[i] > capacity) {
                tempWeightCount = arr[i];
                neededTrip++;
            } else {
                tempWeightCount += arr[i];
            }
        }
        if (tempWeightCount <= capacity)
            neededTrip++;

        return neededTrip;
    }

    private static int findMinimumCapacityBinary(int[] weights, int day) {
        int lo = Arrays.stream(weights).max().getAsInt();
        int hi = Arrays.stream(weights).sum();

        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            int tripNeeded = getTheNeededTrip(weights, mid);
            if (tripNeeded == day) return mid;
            if (tripNeeded < day) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return -1;
    }


}
