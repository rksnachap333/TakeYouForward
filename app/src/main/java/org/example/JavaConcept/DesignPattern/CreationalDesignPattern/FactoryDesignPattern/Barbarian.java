package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.FactoryDesignPattern;

public class Barbarian extends Troop{

    public Barbarian() {
        super(70, 80);
    }

    @Override
    public void attack() {
        System.out.println("Barbarian swings sword causing "+ damage + "damage!");
    }

    @Override
    public void move() {
        System.out.println("Barbarian charges quickly towards enemy");
    }
}
