package org.example.BitManipulation;

public class CountNoOfSetBit {

    public static int countSetBits1(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 1)
                count++;
            n = n / 2;
        }

        if (n == 1)
            count++;
        return count;
    }

    public static int countSetBits2(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

    public static int countSetBits3(int n) {
        int count = 0;
        while (n > 0) {
            count += 1;
            n = n & (n - 1);
        }
        return count;
    }

}
