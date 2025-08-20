package org.example.BinarySearch.Lec1;

public class FloorAndCeil {

    public static void runner() {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] ans = getFloorAndCeil(arr, x);
        System.out.println("The floor and ceil are: " + ans[0]
                + " " + ans[1]);
    }

    public static int[] getFloorAndCeil(int[] arr, int x) {
        int f = findFloor(arr, x);
        int c = findCeil(arr, x);
        return new int[] {f, c};
    }

    private static int findFloor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr[high];
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int findCeil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = high;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
