package org.example.GreedyAlgorithm.FractionalKnapsack;

import java.util.Arrays;

public class FractionalKnapsack {

    public static int maxTotalValue(int[] val, int[] wt, int capacity) {
        int maxVal = 0;
        Item[] items = new Item[val.length];
        for(int i = 0; i< val.length;i++){
            items[i] = new Item(val[i], wt[i]);
        }

        Arrays.sort(items, (a,b) ->  Double.compare(b.ratio, a.ratio));
        for(Item item: items) {
            if(item.weight <= capacity){
                maxVal +=item.val;
                capacity -= item.weight;
            } else {
                maxVal += (item.ratio)*capacity;
                capacity = 0;
                break;
            }
        }
        return maxVal;
    }
}

