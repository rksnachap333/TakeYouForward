package org.example.Recursion;

public class FibonnachiFinder {

    public static void fibo1(int n) {
        if (n == 0) {
            System.out.print("0 ");
            return;
        }

        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        System.out.println("Fibonacci series up to " + n + ":");

        for (int i = 0; i < fibo.length; i++) {
            System.out.print(fibo[i] + " ");
        }

        System.out.println("");
    }

    public static void fibo2(int n) {

        if (n == 0) {
            System.out.print("0 ");
            return;
        }

        int secondLast = 0;
        int last = 1;
        System.out.print(secondLast + "");
        for (int i = 1; i <= n; i++) {
            System.out.print(last + "");
            int temp = last + secondLast;
            secondLast = last;
            last = temp;
        }
        System.out.println();
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
