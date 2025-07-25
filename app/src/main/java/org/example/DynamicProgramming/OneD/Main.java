package org.example.DynamicProgramming.OneD;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------Dynamic Programming-------------");
        System.out.println("------------Recursion------------");
        System.out.println("Fibonacci of 9 is Method-1==="+ Fibonacci.findFibonacci(9));
        int[] dp = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        System.out.println("Fibonacci of 9 is Method-2==="+Fibonacci.findFibonacciDP(9, dp));
        System.out.println("Fibonacci of 9 is Method-3==="+Fibonacci.findFibonacciDPTabulation(9));
        System.out.println("------------- Frog Jump Using 2 Steps ----------");
        int height[]={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int frogDP[] = new int[n];
        Arrays.fill(frogDP,-1);
        System.out.println("Minimum energy needed to reach frog to the top recursion =="+ FrogJump.minEnergyUse(n-1,height));
        System.out.println("Minimum energy needed to reach frog to the top memoization =="+FrogJump.minEnergyUseDPMemoization(n-1,height,frogDP));
        System.out.println("Minimum energy needed to reach frog to the top tabulation =="+FrogJump.minEnergyUseDPTabulation(n,height));
        System.out.println("Minimum energy needed to reach frog to the top tabulation opt =="+FrogJump.minEnergyUseDPTabulationOpt(n,height));
        System.out.println("------------- Frog Jump Using k Steps ----------");
        System.out.println("Minimum energy needed to reach frog to the top recursion =="+ FrogJumpWithKSteps.minEnergyUse(n-1,height, 2));
        System.out.println("Minimum energy needed to reach frog to the top memoization =="+FrogJumpWithKSteps.minEnergyUseDPMemoization(n-1,height,2, frogDP));
        System.out.println("Minimum energy needed to reach frog to the top memoization =="+FrogJumpWithKSteps.minEnergyUseDPTabulation(n,height,2));

        System.out.println("------------------MaximumNonAdjacentSum-------------------");
//        int arr[] = {2, 1, 4, 9};
//        int arr[] = {1, 2, 3, 1, 3, 5, 8, 1, 9};
        int arr[] = {1,2,3,1};
        int n1 = arr.length;
        int[] maxAdjDpArr = new int[n1];
        Arrays.fill(maxAdjDpArr,-1);
        int maxNonAdjacentSum = MaximumNonAdjacentSum.maximumSumNonAdjacentElement(n1-1,arr);
        int maxNonAdjacentSumMemo = MaximumNonAdjacentSum.maximumSumNonAdjacentElementDpMemo(n1-1,arr,maxAdjDpArr);
        int maxNonAdjacentSumTabulation = MaximumNonAdjacentSum.maximumSumNonAdjacentElementDpTabulation(arr);
        System.out.println("Maximum Non adjacent sum recursion ==="+maxNonAdjacentSum);
        System.out.println("Maximum Non adjacent sum memoization ==="+maxNonAdjacentSumMemo);
        System.out.println("Maximum Non adjacent sum tabulation ==="+maxNonAdjacentSumTabulation);
        System.out.println("------------House Robber--------------------");
        int[] houses = {2, 3, 2};
        int maxRobbed = HouseRobber.maxRobbing(houses);
        System.out.println("Maximum robbed ===="+maxRobbed);

    }
}
