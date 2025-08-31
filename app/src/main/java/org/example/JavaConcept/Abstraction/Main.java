package org.example.JavaConcept.Abstraction;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.accelerate();
        car.applyBrake();
        System.out.println("-------------------------------");
        Car car1 = new Car();
        car1.startEngine();
        car1.accelerate();
        car1.applyBrake();
        System.out.println("-------------------------------");
        Vehicle truck = new Truck();
        truck.startEngine();
        truck.accelerate();
        truck.applyBrake();
    }
}
