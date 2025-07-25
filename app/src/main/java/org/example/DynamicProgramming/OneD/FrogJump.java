package org.example.DynamicProgramming.OneD;

public class FrogJump {

    // Normal recursion
    public static int minEnergyUse(int index, int[] energy) {
        if(index == 0) return 0;

        int left = minEnergyUse(index -1, energy) + Math.abs(energy[index] - energy[index-1]);
        int right = Integer.MAX_VALUE;
        if(index > 1)
            right = minEnergyUse(index -2, energy) + Math.abs(energy[index] - energy[index-2]);
        return Math.min(left, right);
    }

    // DP Memoization
    public static int minEnergyUseDPMemoization(int index, int[] energy, int[] dp) {
        if(index == 0) return 0;
        if(dp[index] != -1) return dp[index];
        int left = minEnergyUse(index -1, energy) + Math.abs(energy[index] - energy[index-1]);
        int right = Integer.MAX_VALUE;
        if(index > 1)
            right = minEnergyUse(index -1, energy) + Math.abs(energy[index] - energy[index-1]);
        return dp[index] = Math.min(left, right);
    }

    // DP Solution tabulation
    public static int minEnergyUseDPTabulation(int n, int[] energy) {
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i = 1; i< n; i++) {
            int firstStep = dp[i-1] + Math.abs(energy[i-1] - energy[i]);
            int secondStep = Integer.MAX_VALUE;
            if(i > 1)
                secondStep = dp[i -2] + Math.abs(energy[i - 2] - energy[i]);

            dp[i] = Math.min(firstStep, secondStep);
        }

        return dp[n-1];
    }

    // DP Solution tabulation with space optimization
    public static int minEnergyUseDPTabulationOpt(int n, int[] energy) {
        int prev = 0, prevPrev = 0;
        for(int i = 1; i< n; i++) {
            int firstStep = prev + Math.abs(energy[i-1] - energy[i]);
            int secondStep = Integer.MAX_VALUE;
            if(i > 1)
                secondStep = prevPrev + Math.abs(energy[i - 2] - energy[i]);

            int curr = Math.min(firstStep, secondStep);
            prevPrev = prev;
            prev = curr;
        }

        return prev;
    }
}
