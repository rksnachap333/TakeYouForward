package org.example.BitManipulation;

public class CheckIthBitIsSet {

    public static boolean isIthBitIsSet(int n, int i) {
        int mask = 1 << i;
        return (n & mask) != 0;
    }
}
