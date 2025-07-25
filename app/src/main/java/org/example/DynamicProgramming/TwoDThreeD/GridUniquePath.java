package org.example.DynamicProgramming.TwoDThreeD;

public class GridUniquePath {

    // Simple recursion
    public static int gridUniquePathCount(int m, int n) {
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        int down = gridUniquePathCount(m-1,n);
        int right = gridUniquePathCount(m,n-1);
        return down + right;
    }

    // DP Memoization Solution
    public static int gridUniquePathCountDPMemoization(int m, int n, int[][] dp) {
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        if(dp[m][n] != -1) return dp[m][n];
        int down = gridUniquePathCountDPMemoization(m-1,n, dp);
        int right = gridUniquePathCountDPMemoization(m,n-1, dp);
        return dp[m][n] = down + right;
    }

    // DP tabulation Solution
    public static int gridUniquePathCountDPTabulation(int m, int n) {
        int[][] dp= new int[m][n];

        for(int i = 0; i< m;i ++) {
            for(int j = 0; j< n; j++) {
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                    continue;
                }
                int up = 0;
                int left = 0;
                if(i > 1){
                    up = dp[i-1][j];
                }
                if(j > 1){
                    left = dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
