package org.example.GreedyAlgorithm.LemonadeChange;

import org.example.Heaps.PriorityQueueExample;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LemonadeChange {
    
    public static boolean checkLemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int bill : bills) {
            if(bill == 5){
                five++;
            } else if(bill == 10) {
                if(five == 0) return false;
                five --;
                ten++;
            } else{
                if(five == 0) return false;
                if(ten == 0 && five < 3) return false;
                if(ten == 0) five = five -3;
                else {
                    ten -=1;
                    five -=1;
                }
            }
        }
        return true;
    }
}
