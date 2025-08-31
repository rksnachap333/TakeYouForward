package org.example.JavaConcept.Abstraction;

public class Truck extends Vehicle{
    @Override
    void accelerate() {
        System.out.println("Truck is accelerating...");
    }

    @Override
    void applyBrake() {
        System.out.println("Driver has applied brake on Truck..");
    }
}
