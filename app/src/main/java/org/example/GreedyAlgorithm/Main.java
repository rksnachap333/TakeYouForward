package org.example.GreedyAlgorithm;

import org.example.GreedyAlgorithm.AssignCookies.AssignCookies;
import org.example.GreedyAlgorithm.FindMinimumNumberOfCoins.FindMinimumNumberOfCoins;
import org.example.GreedyAlgorithm.FractionalKnapsack.FractionalKnapsack;
import org.example.GreedyAlgorithm.LemonadeChange.LemonadeChange;
import org.example.GreedyAlgorithm.ValidParanthesisChecker.ValidParenthesisChecker;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Assign Cookies-----------------");
        int[] g = new int[] {1,5,3,3,4};
        int[] s = new int[] {4,2,1,2,1,3};
        int greed = AssignCookies.assignCookies(g,s);
        System.out.println("greed can be satisfied of ==="+ greed);
        System.out.println("--------------Fractional Knapsack-------------------");
        int[] values = new int[] {100, 60, 120};
        int[] weight = new int[] {20, 10, 30};

        int maxValue = FractionalKnapsack.maxTotalValue(values, weight, 50);
        System.out.println("max value can be get ==="+ maxValue);
        System.out.println("----------------------------");

        int[] denomination = new int[] { 1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int v = 87;

        int minCoin = FindMinimumNumberOfCoins.findMinimumCoin(denomination,v);
        System.out.println("Minimum coin will be ===="+ minCoin);
        System.out.println("---------------Lemonade Change--------------");
        int[] bills = new int[] {5, 5, 5, 10, 20};
        boolean check = LemonadeChange.checkLemonadeChange(bills);
        System.out.println("Lemonade change is possible ? =="+check);
        System.out.println("-----------Valid Parenthesis Checker-----------------");
        String parenthesisStr = "*";
        boolean isValid = ValidParenthesisChecker.isValidParenthesis(parenthesisStr, 0, 0);
        System.out.println("String give for valid parenthesis check is == "+isValid);
        System.out.println("--------------------");
    }
}
