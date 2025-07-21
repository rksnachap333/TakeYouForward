package org.example.Pattern.JavaProgram;

public class GCDFinder {

    public static int findGCD(int a, int b) {

        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b; // Reduce 'a' by the remainder of 'a' divided by 'b'
            } else {
                b = b % a; // Reduce 'b' by the remainder of 'b' divided by 'a'
            }
        }

        if (a == 0)
            return b;
        return a; // Return the GCD, which is the non-zero value

    }
}