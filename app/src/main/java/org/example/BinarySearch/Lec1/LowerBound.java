package org.example.BinarySearch.Lec1;

public class LowerBound {
    public static void runner() {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }

    private static int lowerBound(int[] arr, int size, int target) {
        int low = 0, high = size-1;
        int ans = size;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= target) {
                ans = mid;
                high = mid -1;
            } else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
