package org.example.Pattern.JavaProgram;

public class CheckPalindrome {

    public static boolean isPalindrome(int number) {
        // Reverse the number and check with the original number
        int reverse = ReverseDigit.reverseDigitOfNumber(number);
        if (number == reverse) {
            return true; // The number is a palindrome
        }
        return false;
    }
}
