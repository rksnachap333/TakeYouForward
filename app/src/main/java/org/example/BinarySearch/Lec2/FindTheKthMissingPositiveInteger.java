package org.example.BinarySearch.Lec2;

import java.util.Arrays;

public class FindTheKthMissingPositiveInteger {

    public static void runner() {
        int[] vec = new int[]{4, 7, 9, 10};
        int k = 4;

        int kthMissing = findKthMissingNumber(vec, k);
        int kthMissing1 = findKthMissingNumberMethod2(vec, k);
        System.out.println("(Brute Force 1) Kth missing element is == " + kthMissing);
        System.out.println("(Brute Force 2) Kth missing element is == " + kthMissing1);
        int kthMissingNumberBinary = findKthMissingNumberBinary(vec, k);
        System.out.println("(Binary Search) Kth missing element is == " + kthMissingNumberBinary);

    }

    // Brute Force complexity = O(max in arr)
    private static int findKthMissingNumber(int[] arr, int k) {
        int max = Arrays.stream(arr).max().getAsInt();
        int counter = 0;
        int index = 0;
        for (int i = 1; i <= max; i++) {
            if (i < arr[index]) {
                counter++;
                if (counter == k) return i;
            } else {
                index++;
            }
        }

        return -1;
    }

    private static int findKthMissingNumberMethod2(int[] arr, int k) {
        int max = Arrays.stream(arr).max().getAsInt();
        if(k > max) return -1;
        for(int i = 0; i< arr.length; i++) {
            if(k >= arr[i]){
                k++;
            }else{
                return k;
            }
        }

        return -1;
    }

    private static int findKthMissingNumberBinary(int[] arr, int k) {
        int lo = 1;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return hi + k + 1;
    }
}
