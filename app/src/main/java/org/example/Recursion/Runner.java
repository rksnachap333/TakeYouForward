package org.example.Recursion;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello, World! in Recursion package");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times do you want to print: ");
        int n = sc.nextInt();
        printnameNTimes(n, 1);
        System.out.println("-------------------");
        System.out.println("Printing 1 to " + n);
        print1toN(n, 1);
        System.out.println("-------------------");
        System.out.println("Printing " + n + " to 1");
        printNto1(n);
        System.out.println("-------------------");
        System.out.println("Sum of first " + n + " numbers is: " + sumOfFirstN(n));
        System.out.println("-------------------");
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        System.out.println("-------------------");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Original Array:");
        printArray(arr, 0);
        System.out.println();
        reverseArrayRecursion(arr, 0, arr.length - 1);
        System.out.println("Reversed Array:");
        printArray(arr, 0);
        arr = reverseArray(arr);
        System.out.println("Reversed Array using iterative method:");
        printArray(arr, 0);
        System.out.println();
        System.out.println("--------------------");
        System.out.print("Enter a string to check if it is a palindrome: ");
        String cString = sc.nextLine(); // Consume the newline character
        cString = sc.nextLine(); // Read the actual string
        if (isPalindrome(cString, 0)) {
            System.out.println(cString + " is a palindrome.");
        } else {
            System.out.println(cString + " is not a palindrome.");
        }
        System.out.println("--------------------");
        System.out.print("Enter a number to find its Fibonacci value: ");
        int fiboNumber = sc.nextInt();
        System.out.println("Fibonacci series of " + fiboNumber + " is: ");
        FibonnachiFinder.fibo1(fiboNumber);
        System.out.println("Fibonacci value of " + fiboNumber + " is: " + FibonnachiFinder.fibo(fiboNumber));
        sc.close();
    }

    public static void printnameNTimes(int n, int i) {
        if (i > n)
            return;

        printnameNTimes(n, i + 1);
        System.out.println("Rajesh");
    }

    public static void print1toN(int n, int i) {
        if (i > n)
            return;
        System.out.println(i);
        print1toN(n, i + 1);

    }

    public static void printNto1(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNto1(n - 1);
    }

    public static int sumOfFirstN(int n) {
        if (n == 0)
            return 0;
        return n + sumOfFirstN(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void reverseArrayRecursion(int[] arr, int start, int end) {
        if (start >= end)
            return;

        // Swap the elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverseArrayRecursion(arr, start + 1, end - 1);
    }

    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        return arr;
    }

    public static void printArray(int[] arr, int index) {
        if (index == arr.length)
            return;

        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    static boolean isPalindrome(String str, int index) {

        if (index >= str.length() / 2)
            return true;

        if (str.charAt(index) != str.charAt(str.length() - index - 1))
            return false;

        return isPalindrome(str, index + 1);

    }
}
