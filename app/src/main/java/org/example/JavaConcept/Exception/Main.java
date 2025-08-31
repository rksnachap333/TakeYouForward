package org.example.JavaConcept.Exception;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int m = 5;
        try {
            int ans = n / m;
            System.out.println("Answer: " + ans);
        } catch (ArithmeticException e) {
            System.out.println(
                    "Error: Division by zero is not allowed!");
        }
        finally {
            System.out.println(
                    "This is finally block.");
        }

        System.out.println("-----------Custom Age Exception Handling------------");

        try {
            CustomExceptionDemo.validateAge(18);
            CustomExceptionDemo.validateAge(17);
        } catch (AgeRestrictionException e) {
            throw new RuntimeException(e);
        }

    }
}
