package org.example.BinarySearch.Lec1;

import org.example.BinaryTree.MediumProblem.BottomViewOfTree;

public class FindHowManyTimeArrayRotated {

    public static void runner() {
//        int[] arr = new int[]{9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
//        int[] arr = new int[]{2,3,4,5,6,7,8,9,10,1};
        int[] arr = new int[]{4,5,6,7,0,1,2,3};

        BottomViewOfTree.Pair<Integer, Integer> pair= findMin(arr);
        System.out.println("No of rotation == " + pair.getKey());
    }

    private static BottomViewOfTree.Pair<Integer, Integer> findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int lo = 0;
        int hi = arr.length - 1;
        int index = 0;
        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            if (min > arr[mid]) {
                index = mid;
                min = arr[mid];
            }

            if (arr[mid] <= arr[hi]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return new BottomViewOfTree.Pair(index, min);
    }
}
