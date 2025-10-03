package se.yrgo.dungeon.monsters;

import se.yrgo.dungeon.*;

public class Troll implements Monster {

    private int health;

    public Troll() {
        health = 10;
    }

    @Override
    public String getName() {
        return "a big cave troll";
    }

    @Override
    public boolean fight(Player p) {
        System.out.println("The troll bites your arm.");
        p.wound(10);
        health -= 5;

        return health < 1;
    }

    @Override
    public boolean talk(Player p) {
        System.out.println("Oogogo googo googog!");
        p.wound(1);

        return false;
    }

    @Override
    public String toString() {
        return "Troll [health=" + health + "]";
    }
    
    
}
