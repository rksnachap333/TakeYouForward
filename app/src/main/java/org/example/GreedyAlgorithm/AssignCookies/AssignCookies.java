package org.example.GreedyAlgorithm.AssignCookies;

import java.util.Arrays;
import java.util.Collections;

public class AssignCookies {

    public static int assignCookies(int[] greed, int[] size) {
        int n = greed.length;
        int m = size.length;
        Arrays.sort(greed);
        Arrays.sort(size);
        int l = 0, r = 0;
        while(l < m) {
            if(greed[r] <= size[l]) {
                r++;
            }
            l++;
        }
        return r;
    }
}
