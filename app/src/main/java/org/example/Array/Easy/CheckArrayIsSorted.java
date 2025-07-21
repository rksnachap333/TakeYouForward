package org.example.Array.Easy;

class CheckArrayIsSorted {

    // Complexity: O(n)
    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return true; // An empty array or null is considered sorted
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // If any element is smaller than the previous one, it's not sorted
            }
        }

        return true; // If we reach here, the array is sorted
    }
}