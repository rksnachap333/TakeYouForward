package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.FactoryDesignPattern;

public class HogRider extends Troop {
    public HogRider() {
        super(65, 75);
    }

    @Override
    public void attack() {
        System.out.println("Hog rider smashes defences causing "+ damage + " damage!");
    }

    @Override
    public void move() {
        System.out.println("Hog rider moves fast and jumps over walls");
    }
}
