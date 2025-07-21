package org.example.Pattern.JavaProgram;

public class AmstrongNumber {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            int rem = number % 10; // Get the last digit
            sum += rem * rem * rem; // Cube the digit and add to sum
            number /= 10; // Remove the last digit from the original number
        }

        if (sum == originalNumber) {
            return true; // The number is an Armstrong number
        }
        return false;
    }

}
