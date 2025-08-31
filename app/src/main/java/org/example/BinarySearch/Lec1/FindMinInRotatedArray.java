package org.example.BinarySearch.Lec1;

public class FindMinInRotatedArray {

    public static void runner() {
//        int[] arr = new int[]{9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
//        int[] arr = new int[]{2,3,4,5,6,7,8,9,10,1};
        int[] arr = new int[]{5,6,7,8,9,10,1, 2,3,4};

        int min = findMin(arr);
        System.out.println("Minimum in this array == " + min);
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            if (min > arr[mid]) {
                min = arr[mid];
            }

            if (arr[mid] <= arr[hi]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return min;
    }
}
