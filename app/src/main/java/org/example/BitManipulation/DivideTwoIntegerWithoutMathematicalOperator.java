package org.example.BitManipulation;

public class DivideTwoIntegerWithoutMathematicalOperator {

    public static int divide(int divident, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        if (divident == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Handle overflow case
        }

        boolean sign = true;
        if (divident < 0 && divisor > 0)
            sign = false;
        if (divident > 0 && divisor < 0)
            sign = false;
        divident = Math.abs(divident);
        divisor = Math.abs(divisor);
        int ans = 0;
        while (divident >= divisor) {

            int count = 0;
            while (divident >= divisor * Math.pow(2, count)) {
                count++;
            }

            ans += Math.pow(2, count);
            divident -= divisor * Math.pow(2, count);
        }

        return sign ? ans : -1 * ans;
    }

    public static int divide1(int divident, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        if (divident == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Handle overflow case
        }

        boolean sign = true;
        if (divident < 0 && divisor > 0)
            sign = false;
        if (divident > 0 && divisor < 0)
            sign = false;
        divident = Math.abs(divident);
        divisor = Math.abs(divisor);
        int ans = 0;
        while (divident >= divisor) {

            int count = 0;
            while (divident >= divisor * (1 << count)) {
                count++;
            }

            ans += 1 << count;
            divident -= divisor * (1 << count);
        }

        return sign ? ans : -1 * ans;
    }

}
