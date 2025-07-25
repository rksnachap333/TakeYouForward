package org.example.DynamicProgramming.TwoDThreeD;

public class NinjaTraining {

    public static int getMaximumMeritPoint(int[][] point,int day, int lastDayWork) {
        if(day == 0){
            int maxi = 0;
            for(int i = 0; i < 3; i++) {
                if(i != lastDayWork){
                    maxi = Math.max(maxi, point[0][i]);
                }
            }
            return maxi;
        }

        int maxi = 0;
        for(int i = 0; i< 3; i++) {
            if(i != lastDayWork) {
                int merit = point[day][i] + getMaximumMeritPoint(point,day-1,i);
                maxi = Math.max(merit, maxi);
            }
        }
        return maxi;
    }
}
