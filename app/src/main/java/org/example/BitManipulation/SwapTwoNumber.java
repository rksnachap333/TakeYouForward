package org.example.BitManipulation;

public class SwapTwoNumber {
    public static void swapTwoNumbers(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
