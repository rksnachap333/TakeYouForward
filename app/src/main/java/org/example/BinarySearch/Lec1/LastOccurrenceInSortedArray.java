package org.example.BinarySearch.Lec1;

public class LastOccurrenceInSortedArray {

    public static void runner() {
        int n = 7;
        int key = 13;
        int[] v = {3, 4, 13, 13, 13, 20, 40};

        // returning the last occurrence index if the element is present otherwise -1
        System.out.println("Last occurrence index :" + solve(n, key, v));
    }

    private static int solve(int n, int key, int[] arr) {
        int start = 0;
        int end = n - 1;
        int res = -1;

        while (start <= end) {
            int mid = (start + end) >> 1;
            if (arr[mid] == key) {
                res = mid;
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}
