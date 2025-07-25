package org.example.DynamicProgramming.OneD;

public class FrogJumpWithKSteps {
    // Simple Recursion Solution
    public static int minEnergyUse(int index, int[] energy, int steps) {
        if(index == 0) return 0;
        int minSteps = Integer.MAX_VALUE;
        for(int j = 1; j <= steps; j++) {
            if(index- j >= 0) {
                int jump = minEnergyUse(index - j, energy, steps) + Math.abs(energy[index] - energy[index - j]);
                minSteps = Math.min(jump, minSteps);
            }
        }

        return minSteps;
    }

    // DP Memoization solution
    public static int minEnergyUseDPMemoization(int index, int[] energy, int steps, int[] dp) {
        if(index == 0) return 0;
        if(dp[index] != -1) return dp[index];
        int minSteps = Integer.MAX_VALUE;
        for(int j = 1; j < steps; j++) {
            if(index- j >= 0) {
                int jump = minEnergyUse(index - j, energy, steps) + Math.abs(energy[index] - energy[index - j]);
                minSteps = Math.min(jump, minSteps);
            }
        }
        return dp[index] = minSteps;
    }

    // DP Tabulation solution
    public static int minEnergyUseDPTabulation(int n, int[] energy, int steps) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for(int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;

            // Loop to try all possible jumps from '1' to 'k'
            for (int j = 1; j <= steps; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(energy[i] - energy[i - j]);
                    mmSteps = Math.min(jump, mmSteps);
                }
            }
            dp[i] = mmSteps;
        }
        return dp[n-1];
    }
}
