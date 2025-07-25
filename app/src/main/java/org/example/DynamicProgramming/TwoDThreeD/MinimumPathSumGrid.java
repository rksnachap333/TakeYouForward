package org.example.DynamicProgramming.TwoDThreeD;

public class MinimumPathSumGrid {

    // Simple Recursion
    public static int minimumPathSum(int m, int n, int[][] grid) {
        if(m == 0 && n == 0) return grid[m][n];
        if(m < 0 || n < 0) return (int) Math.pow(10, 9);
        int up = grid[m][n] + minimumPathSum(m-1,n, grid);
        int left = grid[m][n] + minimumPathSum(m,n-1, grid);
        return Math.min(up, left);
    }

    // Simple DP memoization
    public static int minimumPathSumDPMemoization(int m, int n, int[][] grid, int[][] dp) {
        if(m == 0 && n == 0) return grid[m][n];
        if(m < 0 || n < 0) return (int) Math.pow(10, 9);
        if(dp[m][n] != -1) return dp[m][n];
        int up = grid[m][n] + minimumPathSum(m-1,n, grid);
        int left = grid[m][n] + minimumPathSum(m,n-1, grid);
        return dp[m][n] = Math.min(up, left);
    }
}
