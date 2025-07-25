package org.example.DynamicProgramming.OneD;

public class ClimbingStair {

    // Basic Recursion approach
    public static int findMaxWayToClimb(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        return findMaxWayToClimb(n -1) + findMaxWayToClimb(n -2);
    }

    //DP Memoization
    public static int findMaxWayToClimb(int n, int[] dp) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = findMaxWayToClimb(n-1, dp) +  findMaxWayToClimb(n-2, dp);
    }
}
