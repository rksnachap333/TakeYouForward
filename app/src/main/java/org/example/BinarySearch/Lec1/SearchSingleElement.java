package org.example.BinarySearch.Lec1;

import java.util.Arrays;
import java.util.List;

public class SearchSingleElement {
    public static void runner() {
        int[] arr = new int[]{1,1,2,3,3};
        int singleElementUsingXOR = findSingleElementUsingXOR(arr);
        System.out.println("Single element in the arr ==="+singleElementUsingXOR);
        int singleElementUsingBinarySearch = findingSingleElementUsingBinarySearch(arr);
        System.out.println("Single element in the arr ==="+singleElementUsingBinarySearch);
    }

    // Brute force travelling one by one and checking = 0(n)
    // Using XOR also the same complexity
    //Optimal Approach = Binary Search
    private static int findSingleElementUsingXOR(int[] arr) {
        int xor = 0;

        for(int data : arr) {
            xor ^= data;
        }
        return xor;
    }

    private static int findingSingleElementUsingBinarySearch(int[] arr) {
        //Edge cases
        if(arr.length == 0) return -1;
        if(arr.length == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        int n = arr.length;
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        
        int lo = 0;
        int hi = n-1;

        while(lo <= hi) {
            int mid = (lo + hi) >> 1;

            if(arr[mid] != arr[mid -1] && arr[mid] != arr[mid+1]) return arr[mid];

            if((mid % 2 == 0 && arr[mid +1] == arr[mid])
            || (mid % 2 != 0 && arr[mid-1] == arr[mid])) {
                //we are on the left side of a single element
                lo = mid + 1;
            } else {
                //we are on the right side of a single element
                hi = mid -1;
            }
        }

        return -1;

    }
}
