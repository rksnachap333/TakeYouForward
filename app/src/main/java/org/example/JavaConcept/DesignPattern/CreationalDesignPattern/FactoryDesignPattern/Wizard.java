package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.FactoryDesignPattern;

public class Wizard extends Troop{

    public Wizard() {
        super(50, 70);
    }

    @Override
    public void attack() {
        System.out.println("Wizard casts a fireball causing " + damage + "magical damage!");
    }

    @Override
    public void move() {
        System.out.println("Wizard teleport short distance");
    }
}
