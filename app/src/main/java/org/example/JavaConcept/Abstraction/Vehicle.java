package org.example.JavaConcept.Abstraction;

public abstract class Vehicle {

    abstract void accelerate();
    abstract void applyBrake();

    void startEngine() {
        System.out.println("Engine Started.....");
    }
}
