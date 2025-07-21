package org.example.Array;

import org.example.Array.Easy.*;


public class Runner {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3 };
        int[] result = RemoveDuplicateInSortedArray.removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println("-----------------------");
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] rotatedResult = LeftRotateArrayByOne.leftRotate(arr2);
        System.out.print("Array after left rotation: ");
        for (int num : rotatedResult) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("-----------------------");
        int[] arr3 = { 0, 1, 0, 3, 12 };
        int[] movedResult = MoveAllZeroToEnd.moveZerosToEnd(arr3);
        System.out.print("Array after moving zeros to end: ");
        for (int num : movedResult) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("-----------------------");

        int[] arr4 = { 1, 2, 3, 4, 5 };
        int[] arr5 = { 2, 3, 4, 4, 5 };
        // java.util.ArrayList<Integer> unionResult =
        // Array.Easy.UnionOfTwoArray.union(arr4, arr5);
        java.util.ArrayList<Integer> unionResult = UnionOfTwoArray.union1(arr4, arr5);
        System.out.print("Union of two arrays: ");
        for (int num : unionResult) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("-----------------------");

        int[] arr6 = { 1, 1, 0, 1, 1, 1, 0, 1 };
        int maxConsecutiveOnes = MaximumConsecutiveOne.maximumConsecutiveOne(arr6);
        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes);
        System.out.println("-----------------------");
        int[] arr7 = { 2, 3, 5, 1, 9 };
        int targetSum = 10;
        int length = LongestSubArrayWithGivenSum.longestSubArrayWithGivenSum(arr7, targetSum);
        System.out.println("Length of longest subarray with sum " + targetSum + ": " + length);
        System.out.println("-----------------------");

    }
}
