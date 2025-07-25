package org.example.DynamicProgramming.TwoDThreeD;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------2D/3D DP Question--------------------");
        System.out.println("-------- Ninja Training Question------------------");
        int[][] points = {{10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}};

        int n = points.length;
        int meritPoint = NinjaTraining.getMaximumMeritPoint(points, n-1, 3);
        System.out.println("Maximum merit point == "+meritPoint);

        System.out.println("------------Minimum Path Sum ---------------");
        int matrix[][] = {
                {5, 9, 6},
                {11, 5, 2}
        };

        int m1 = matrix.length;
        int n1 = matrix[0].length;

        // Calculate and print the minimum sum path in the matrix
        int minPathSum = MinimumPathSumGrid.minimumPathSum(m1-1, n1-1, matrix);
        System.out.println("Minimum path sum ===="+minPathSum);
    }
}
