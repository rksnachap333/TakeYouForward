package org.example.BinarySearch.Lec1;

public class UpperBound {

    public static void runner() {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int n = 6, x = 9;
        int ind = upperBound(arr, n, x);
        System.out.println("The upper bound is the index: " + ind);
    }

    private static int upperBound(int[] arr, int size, int target) {
        int low = 0, high = size - 1;
        int ans = size;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
