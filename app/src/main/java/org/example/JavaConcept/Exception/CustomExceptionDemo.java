package org.example.JavaConcept.Exception;

public class CustomExceptionDemo {

    public static void validateAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Age " + age + " is not valid. Must be 18 or above.");
        } else {
            System.out.println("Welcome! Age is valid.");
        }
    }
}
