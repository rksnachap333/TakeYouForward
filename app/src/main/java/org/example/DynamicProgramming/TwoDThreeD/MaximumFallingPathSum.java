package org.example.DynamicProgramming.TwoDThreeD;

public class MaximumFallingPathSum {

    // Simple recursion
    public static int maximumFallingPathSum(int i, int j, int[][] grid, int m, int n) {
        if(j < 0 || j > m) return Integer.MIN_VALUE;
        if(i == 0) return grid[i][j];

        int up = maximumFallingPathSum(i-1, j, grid, m, n);
        int leftDiagonal = maximumFallingPathSum(i-1, j-1, grid, m, n);
        int rightDiagonal = maximumFallingPathSum(i-1, j+1, grid, m, n);
        return Math.max(Math.max(up, leftDiagonal), rightDiagonal);
    }

    // DP Memoization
    public static int maximumFallingPathSumDPMemoization(int i, int j, int[][] grid, int m, int n, int[][] dp) {
        if(j < 0 || j > m) return Integer.MIN_VALUE;
        if(i == 0) return grid[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        int up = maximumFallingPathSum(i-1, j, grid, m, n);
        int leftDiagonal = maximumFallingPathSum(i-1, j-1, grid, m, n);
        int rightDiagonal = maximumFallingPathSum(i-1, j+1, grid, m, n);
        return dp[i][j] = Math.max(Math.max(up, leftDiagonal), rightDiagonal);
    }

}
