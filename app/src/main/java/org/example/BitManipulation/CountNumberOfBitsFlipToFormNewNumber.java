package org.example.BitManipulation;

public class CountNumberOfBitsFlipToFormNewNumber {

    public static int countBitConversionsToGetTheNumber(int a, int b) {
        int count = 0;
        int flipped = a ^ b;

        while (flipped != 0) {
            flipped &= (flipped - 1);
            count++;
        }

        return count;
    }
}
