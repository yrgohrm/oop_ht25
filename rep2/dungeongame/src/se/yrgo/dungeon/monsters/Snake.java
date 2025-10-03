package se.yrgo.dungeon.monsters;

import se.yrgo.dungeon.*;

public class Snake implements Monster {

    @Override
    public String getName() {
        return "a snake";
    }

    @Override
    public boolean fight(Player p) {
        System.out.println("Hisss! The snake bites.");
        p.wound(1);
        return false;
    }

    @Override
    public boolean talk(Player p) {
        System.out.println("jhdkjh fdhs kjhsd kjhsdfk");
        return false;
    }
    
}
