package org.example.BinarySearch.Lec1;

public class PeakElement {

    public static void runner() {

        int[] arr = new int[] {1,2,1,3,5,6,4};
        int peak = peakElementBruteForce(arr);
        System.out.println("(Brute Force) Peak element in the arr at =="+peak);

        int peak2 = findPeakElement(arr);
        System.out.println("(Binary Search) Peak element in the arr  at =="+peak2);
    }

    // Brute force complexity = o(n)
    private static int peakElementBruteForce(int[] arr) {

        int n = arr.length;
        for(int i = 0; i< n -1; i++) {
            if((i == 0 || arr[i-1] < arr[i]) && (i == n-1 || arr[i]> arr[i+1]))
                return i;
        }

        return -1;
    }

    public static int findPeakElement(int[] arr) {
        int n = arr.length; // Size of array

        // Edge cases:
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n-1] > arr[n - 2]) return n - 1;

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) >> 1;

            if(arr[mid] > arr[mid -1] && arr[mid] > arr[mid +1]) return mid;

            if(arr[mid]> arr[mid-1]){
                low = mid +1;
            } else{
                high = mid -1;
            }

        }

        return -1;
    }
}
