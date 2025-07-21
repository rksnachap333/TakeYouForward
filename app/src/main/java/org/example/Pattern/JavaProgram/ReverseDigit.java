package org.example.Pattern.JavaProgram;

public class ReverseDigit {
    public static int reverseDigitOfNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Append it to the reverse number
            number /= 10; // Remove the last digit from the original number
        }

        return reverse; // Return the reversed number
    }
}
