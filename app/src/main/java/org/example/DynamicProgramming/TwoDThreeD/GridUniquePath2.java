package org.example.DynamicProgramming.TwoDThreeD;

/*
We are given an “N*M” Maze. The maze contains some obstacles. A cell is ‘blockage’ in the maze if its value is -1. 0 represents non-blockage. There is no path possible through a blocked cell.

We need to count the total number of unique paths from the top-left corner of the maze to the bottom-right corner. At every cell, we can move either down or towards the right.
 */
public class GridUniquePath2 {

    // Simple Recursion
    public static int findThePathCountWithoutAnyObstacle(int m, int n, int[][] grid) {
        if(m > 0 && n > 0 && grid[m][n] == -1)return 0;
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        int down = findThePathCountWithoutAnyObstacle(m-1, n, grid);
        int right = findThePathCountWithoutAnyObstacle(m, n-1, grid);
        return down + right;
    }

    // Dp Memoization
    public static int findThePathCountWithoutAnyObstacleMemoization(int m, int n, int[][] grid, int[][] dp) {
        if(m > 0 && n > 0 && grid[m][n] == -1)return 0;
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        if(dp[m][n] != -1) return dp[m][n];
        int down = findThePathCountWithoutAnyObstacle(m-1, n, grid);
        int right = findThePathCountWithoutAnyObstacle(m, n-1, grid);
        return dp[m][n] = down + right;
    }
}
