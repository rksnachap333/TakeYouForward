package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.FactoryDesignPattern.WithDesign;

import org.example.JavaConcept.DesignPattern.CreationalDesignPattern.FactoryDesignPattern.*;

public class TroopFactory {

    public static Troop createTroop(String troopName) {
        Troop troop;
        switch (troopName) {
            case "HogRider" -> troop = new HogRider();
            case "Barbarian" -> troop = new Barbarian();
            case "Archer" -> troop = new Archer();
            case "Wizard" -> troop = new Wizard();
            default -> throw new IllegalArgumentException("Unknown troop type +" + troopName);
        }

        return troop;

    }
}
