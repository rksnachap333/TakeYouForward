package org.example.DynamicProgramming.OneD;

public class MaximumNonAdjacentSum {

    // Simple recursion
    public static int maximumSumNonAdjacentElement(int index, int[] arr) {
        if(index == 0) return arr[index];
        if(index < 0) return 0;
        int pick = maximumSumNonAdjacentElement(index - 2, arr) + arr[index];
        int notPick = maximumSumNonAdjacentElement(index-1, arr);

        return Math.max(pick, notPick);

    }

    // DP memoization solution (Top Down)
    public static int maximumSumNonAdjacentElementDpMemo(int index, int[] arr, int[] dp) {
        if(index == 0) return arr[index];
        if(index < 0) return 0;
        if(dp[index] != -1) return dp[index];

        int pick = maximumSumNonAdjacentElement(index - 2, arr) + arr[index];
        int notPick = maximumSumNonAdjacentElement(index-1, arr);

        return dp[index] = Math.max(pick, notPick);
    }
    // DP tabulation solution (Bottom Up)
    public static int maximumSumNonAdjacentElementDpTabulation(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for(int i = 1; i < arr.length; i ++) {
            int pick = arr[i];
            if(i > 1)
                pick += dp[i-2];
            int notPick = dp[i-1];
            dp[i] = Math.max(pick, notPick);
        }
        return dp[arr.length-1];
    }
}
