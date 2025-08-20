package org.example.BinarySearch.Lec1;

public class CountOccurrencesInSortedArray {

    public static void runner() {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int ans = countOccurrence(arr, n, x);
        System.out.println("The number of occurrences is (using two pointer): " + ans);

        int ans1 = count(arr, n, x);
        System.out.println("The number of occurrences is(using binary search): " + ans1);

    }

    // Brute force (Calculate the count traversing all the element) (o(n))
    //Two Pointer solution (o(n))
    private static int countOccurrence(int[]arr, int size, int key) {
        int low = 0;
        int high = size -1;

        while(low <= high) {
            if(arr[low] != key && arr[low] < key){
                low ++;
            }
            if(arr[high] != key && arr[high] > key){
                high --;
            }
            if(arr[low] == key && arr[high] == key) break;

        }
        if(low > high) return -1;
        return high - low + 1;
    }

    public static int firstOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return last;
    }

    public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        int first = firstOccurrence(arr, n, k);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurrence(arr, n, k);
        return new int[] {first, last};
    }

    public static int count(int arr[], int n, int x) {
        int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

}
