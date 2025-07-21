package org.example.Pattern.JavaProgram;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number to reverse: ");
        // int number = scanner.nextInt();
        // int reverse = ReverseDigit.reverseDigitOfNumber(number);
        // System.out.println("Reversed Number: " + reverse);
        // System.out.println("Enter a number to check whether it is a palindrome: ");
        // number = scanner.nextInt();
        // boolean isPalindrome = CheckPalindrome.isPalindrome(number);
        // if (isPalindrome) {
        // System.out.println("The number " + number + " is a palindrome.");
        // } else {
        // System.out.println("The number " + number + " is not a palindrome.");
        // }

        // System.out.println("Enter a number to check whether it is an Armstrong
        // number: ");
        // number = scanner.nextInt();
        // boolean isArmstrong = AmstrongNumber.isArmstrong(number);
        // if (isArmstrong) {
        // System.out.println("The number " + number + " is an Armstrong number.");
        // } else {
        // System.out.println("The number " + number + " is not an Armstrong number.");
        // }

        // System.out.println("Enter a number to print its divisors: ");
        // number = scanner.nextInt();
        // PrintAllDivisor.printAllDivisors(number);

        // System.out.println("Enter a number to check for prime number: ");
        // number = scanner.nextInt();
        // boolean isPrime = CheckPrime.isPrime(number);
        // System.out.println("Is the number " + number + " prime? " + isPrime);
        System.out.println("Find the gcd of two numbers ....");
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int gcd = GCDFinder.findGCD(firstNumber, secondNumber);
        System.out.println("The GCD of " + firstNumber + " and " + secondNumber + " is: " + gcd);
        scanner.close();
    }
}