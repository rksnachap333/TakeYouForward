package org.example.GreedyAlgorithm.FindMinimumNumberOfCoins;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FindMinimumNumberOfCoins {

    public static int findMinimumCoin(int[] denomination, int v) {
        int minCoin = 0;
        Integer[] denomi = Arrays.stream(denomination).boxed().toArray(Integer[]::new);
        Arrays.sort(denomi, Collections.reverseOrder());

        for (Integer currency : denomi) {
            if (currency <= v) {
                minCoin += (v / currency);
                v = v % currency;
            }
            if (v == 0) break;
        }
        return minCoin;
    }
}
