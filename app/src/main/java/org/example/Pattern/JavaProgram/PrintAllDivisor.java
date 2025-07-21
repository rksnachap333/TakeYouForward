package org.example.Pattern.JavaProgram;

import java.util.*;

public class PrintAllDivisor {
    public static void printAllDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        System.out.println("Divisors of " + number + ":");
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor of 'number'
                divisors.add(i); // Add the divisor to the list

                if (number / i != i) {
                    divisors.add(number / i); // Add the divisor to the list
                } // Print the divisor
            }
        }

        for (Integer divisor : divisors) {
            System.out.print(divisor + " "); // Print each divisor
        }
        System.out.println(); // New line after printing all divisors
    }

}
