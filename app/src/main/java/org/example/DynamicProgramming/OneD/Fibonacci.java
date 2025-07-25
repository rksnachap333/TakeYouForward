package org.example.DynamicProgramming.OneD;

public class Fibonacci {
    //Normal recursion
    public static int findFibonacci(int n) {
        if(n <= 1) return n;
        return findFibonacci(n-1) + findFibonacci(n -2);
    }

    // DP Memoization
    public static int findFibonacciDP(int n, int[] dp) {
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = findFibonacciDP(n - 1,dp)+ findFibonacciDP(n -2, dp);
    }

    // DP Tabulation
    public static int findFibonacciDPTabulation(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
