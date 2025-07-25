package org.example.DynamicProgramming.OneD;

import java.util.Arrays;

public class HouseRobber {

    public static int maxRobbing(int[] houses) {
//        int[] arr1 = Arrays.copyOfRange(houses, 0, houses.length-1);
//        int[] arr2 = Arrays.copyOfRange(houses, 1, houses.length);
//        int firstSum = MaximumNonAdjacentSum.maximumSumNonAdjacentElementDpTabulation(arr1);
//        int secondSum = MaximumNonAdjacentSum.maximumSumNonAdjacentElementDpTabulation(arr2);



        int [] arr1;
        int [] arr2;
        if (houses.length > 1) {
             arr1 = Arrays.copyOfRange(houses, 0, houses.length - 1);
             arr2 = Arrays.copyOfRange(houses, 1, houses.length);
            // use arr1 and arr2
        } else {
            // handle the case where nums.length == 1
             arr1 = new int[0];
             arr2 = new int[0];
            // or just skip processing
        }

        int firstSum = MaximumNonAdjacentSum.maximumSumNonAdjacentElementDpTabulation(arr1);
        int secondSum = MaximumNonAdjacentSum.maximumSumNonAdjacentElementDpTabulation(arr2);

        return Math.max(firstSum, secondSum);
    }
}
