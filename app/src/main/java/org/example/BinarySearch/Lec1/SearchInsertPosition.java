package org.example.BinarySearch.Lec1;

public class SearchInsertPosition {

    public static void runner() {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int ind = searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }

    private static int searchInsert(int[] arr, int target) {
        int low = 0, high = arr.length -1;
        int ans = high;

        while(low <= high) {
            int mid = (low + high) >>1;
            if(arr[mid] >= target){
                ans = mid;
                low = mid + 1;
            } else{
                high = mid -1;
            }
        }
        return ans;
    }
}
