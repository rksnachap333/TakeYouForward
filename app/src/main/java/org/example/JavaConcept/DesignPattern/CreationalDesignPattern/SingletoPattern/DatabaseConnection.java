package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.SingletoPattern;

public class DatabaseConnection {

    private static volatile DatabaseConnection INSTANCE;

    private DatabaseConnection() {
        System.out.println("DB Connection created....");
    }

    public static DatabaseConnection getDBInstance() {

        synchronized (DatabaseConnection.class) {
            if (INSTANCE == null) {
                INSTANCE = new DatabaseConnection();
            }
        }
        return INSTANCE;
    }
}
