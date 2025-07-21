package org.example.Pattern.JavaProgram;

public class CheckPrime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        int count = 0;
        for (int i = 1; i * i <= number; i++) { // Check divisibility from 2 to sqrt(number)
            if (number % i == 0) { // If 'i' is a divisor of 'number'
                count++; // Increment the count of divisors
                if (i != number / i) {
                    count++; // Count the corresponding divisor
                }
                if (count > 2) {
                    return false; // More than one divisor means it's not prime
                }
            }
        }
        return true; // If no divisors found, it's a prime number
    }
}
