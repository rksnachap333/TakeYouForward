package org.example.DynamicProgramming.TwoDThreeD;

public class MinimumPathSumTriangularPath {

    // Simple Recursion
    public static int minimumPathSum(int i, int j, int[][] triangle, int n) {
        if(i== n-1) return triangle[i][j];
        int down = minimumPathSum(i+1, j, triangle, n);
        int diagonal = minimumPathSum(i+1, j+1, triangle, n);
        return Math.min(down, diagonal);
    }

    // Simple DP memoization
    public static int minimumPathSumDPMemoization(int i, int j, int[][] triangle,int n, int[][] dp) {
        if(dp[i][j] != -1) return dp[i][j];
        if(i == n-1) return triangle[i][j];
        int down = minimumPathSum(i+1, j, triangle, n);
        int diagonal = minimumPathSum(i+1, j+1, triangle, n);
        return dp[i][j] = Math.min(down, diagonal);
    }
}
