package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.FactoryDesignPattern;

public class Archer extends Troop {
    public Archer() {
        super(60, 60);
    }

    @Override
    public void attack() {
        System.out.println("Archer attack with bow causing " + damage + " damage!");
    }

    @Override
    public void move() {
        System.out.println("Archer can attack from distance without coming in the view of enemy");
    }
}
