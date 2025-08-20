package org.example.Graph.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FloodFillAlgo {

    public static void runner() {

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int[] delRow = new int[]{-1, 0, 1, 0};
        int[] delCol = new int[]{0, 1, 0, -1};
        int[][] ans = floodFill(image, 1, 1, 2);
        System.out.println("Flood fill result : ");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // get initial color
        int iniColor = image[sr][sc];
        int[][] ans = image;
        // delta row and delta column for neighbours
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1};
        dfs(sr, sc, ans, image, newColor, delRow, delCol, iniColor);
        return ans;
    }

    public static void dfs(int row, int col,
                           int[][] ans,
                           int[][] image,
                           int newColor, int delRow[], int delCol[],
                           int iniColor) {

        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        for(int i = 0; i < 4; i++) {
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
            image[nrow][ncol] == iniColor && ans[nrow][ncol] != newColor) {
                dfs(nrow, ncol, ans, image, newColor, delRow, delCol, iniColor);
            }
        }

    }
}
