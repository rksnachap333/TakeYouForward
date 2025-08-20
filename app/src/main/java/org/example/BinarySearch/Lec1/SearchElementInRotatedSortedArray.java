package org.example.BinarySearch.Lec1;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchElementInRotatedSortedArray {

    public static void runner() {
        int[] arr = new int[] {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int n = 9, k = 5;
        int ans = search(arr, n, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }

    private static int search(int[] arr, int size, int  target) {
        int low = 0;
        int high = size -1;
        while(low <= high) {

            int mid = (low + high) >> 1;
            if(arr[mid] == target) return mid;

            //check whether the left part is sorted or not
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]) {
                    high = mid -1;
                } else{
                    low = mid + 1;
                }
            } else{
                if(arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else{
                    high = mid -1;
                }
            }

        }
        return -1;
    }
}
