package org.example.BinarySearch.Lec2;

import java.util.Arrays;
import java.util.OptionalInt;

public class KokoEatingBanana {

    public static void runner() {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("(Brute Force) Koko should eat at least " + ans + " bananas/hr.");

        int ans1 = minimumRateToEatBananasBinarySearch(v, h);
        System.out.println("(Binary Search) Koko should eat at least " + ans1 + " bananas/hr.");
    }


    private static int minimumRateToEatBananas(int[] arr, int hr) {
        OptionalInt max = Arrays.stream(arr).max();
        if(max.isPresent()) {
            for(int i = 1; i<= max.getAsInt();i++) {
                int time = totalTime(arr, i);
                if(time == hr) {
                    return i;
                }
            }

        }
        return -1;
    }

    private static int totalTime(int[] arr, int eatRate) {
        int time = 0;
        for(int mango : arr) {
            time += Math.ceil((double)mango/(double)eatRate);
        }
        return time;
    }

    private static int minimumRateToEatBananasBinarySearch(int[] arr, int hr) {
        OptionalInt max = Arrays.stream(arr).max();
        if(max.isPresent()) {
            int lo = 1;
            int hi = max.getAsInt();

            while(lo <= hi) {
                int mid = (lo + hi) >>1;
                int totalTime = totalTime(arr, mid);
                if(totalTime == hr) return mid;
                if(totalTime > hr) {
                    lo = mid + 1;
                } else {
                    hi = mid -1;
                }
            }
            return -1;
        }
        return -1;
    }


}
