package org.example.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/**
 There is only one row of fruit trees on the farm, oriented left to right. An integer array called fruits represents the trees, where fruits[i] denotes the kind of fruit produced by the ith tree.



 The goal is to gather as much fruit as possible, adhering to the owner's stringent rules:



 1) There are two baskets available, and each basket can only contain one kind of fruit. The quantity of fruit each basket can contain is unlimited.

 2) Start at any tree, but as you proceed to the right, select exactly one fruit from each tree, including the starting tree. One of the baskets must hold the harvested fruits.

 3) Once reaching a tree with fruit that cannot fit into any basket, stop.



 Return the maximum number of fruits that can be picked.
 **/

public class FruitIntoBasket {

    public static int totalFruitsIntoBasket1(int[] fruits) {
        int totalFruits = 0;

        for(int i = 0 ; i< fruits.length;i++){

            Set<Integer> differentFruit = new HashSet<>();
            int j = i;

            while(j < fruits.length) {
                differentFruit.add(fruits[j]);
                if(differentFruit.size() > 2)
                    break;
                totalFruits = Math.max(totalFruits, j - i + 1);
                j++;
            }
        }

        return totalFruits;
    }

}
