package org.example.JavaConcept.Abstraction;

public class Car extends Vehicle{
    @Override
    void accelerate() {
        System.out.println("Car is accelerating.....");
    }

    @Override
    void applyBrake() {
        System.out.println("Applied brake on car...");
    }
}
