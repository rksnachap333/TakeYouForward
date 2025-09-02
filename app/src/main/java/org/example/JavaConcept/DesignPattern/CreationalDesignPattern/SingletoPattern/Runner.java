package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.SingletoPattern;

import org.example.JavaConcept.DesignPattern.CreationalDesignPattern.BuilderPattern.Email;

public class Runner {

    public static void main(String[] args) {


        Thread thread1 = new Thread(() -> {
            DatabaseConnection dbConnection1 = DatabaseConnection.getDBInstance();
        });
        Thread thread2 = new Thread(() -> {
            DatabaseConnection dbConnection2 = DatabaseConnection.getDBInstance();
        });

        thread1.start();
        thread2.start();

    }
}
