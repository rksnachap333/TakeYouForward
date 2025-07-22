package org.example.SlidingWindow;

public class BinarySubarrayWithSum {

    public static int binarySubarrayWithSum(int[] array, int goal) {
        if(goal < 0) return 0;
        int l = 0, r = 0, sum = 0, count =0;
        while(r < array.length) {
            sum += array[r];

            while(sum > goal){
                sum -=array[l];
                l++;
            }
            count = count + (r- l + 1);
            r++;
        }

        return count;
    }
}
