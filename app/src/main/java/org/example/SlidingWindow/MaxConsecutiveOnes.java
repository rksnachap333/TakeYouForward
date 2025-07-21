package org.example.SlidingWindow;

/**
* Given a binary array nums and an integer k, flip at most k 0's.
* Return the maximum number of consecutive 1's after performing the flipping operation.
 * */
public class MaxConsecutiveOnes {

    // Brute Force
    public static int findMaxConsecutiveOnesReplacingKZero1(int[] nums, int k){
        int maxCount = 0;
        for(int i = 0; i< nums.length;i++) {
            int countZero = 0;
            int j = i;
            while (j < nums.length){
                if(nums[j] == 0) countZero++;
                if(countZero <= k){
                    maxCount = Math.max(maxCount, j -i +1);
                } else{
                    break;
                }
                j++;
            }
        }

        return maxCount;
    }

    public static int findMaxConsecutiveOnesReplacingKZero2(int[] nums, int k){
        int maxCount = 0;
        int l = 0, r = 0;
        int countZero = 0;
        while(r < nums.length) {
            if(nums[r] == 0)countZero++;
            if(countZero <=k ){
                maxCount = Math.max(maxCount, r- l + 1);
            } else {
                while(countZero >k && l <= r){
                    if(nums[l] == 0)countZero--;
                    l++;
                }
            }

            r++;
        }
        return maxCount;
    }
//    public static int findMaxConsecutiveOnesReplacingKZero3(int[] nums, int k){
//
//    }


}
