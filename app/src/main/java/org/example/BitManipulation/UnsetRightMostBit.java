package org.example.BitManipulation;

public class UnsetRightMostBit {
    public static int unsetRightMostBit(int n) {
        return n & (n - 1);
    }
}
