package org.example.BitManipulation;

public class CheckANumberIsPowerOf2 {

    public static boolean isPowerOf2(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;

    }
}
