package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.FactoryDesignPattern;

public abstract class Troop {
    protected int health;
    protected int damage;

    protected Troop(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void attack();
    public abstract void move();
}
