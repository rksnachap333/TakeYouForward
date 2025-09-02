package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.FactoryDesignPattern;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required object name::");
        String objectName = scanner.nextLine();
        Troop troop;
        switch (objectName) {
            case "HogRider"-> troop = new HogRider();
            case "Barbarian" -> troop = new Barbarian();
            case "Archer" -> troop = new Archer();
            case "Wizard" -> troop = new Wizard();
            default -> throw new IllegalArgumentException("Unknown troop type +" +objectName);
        }

        troop.attack();
        troop.move();

    }
}
