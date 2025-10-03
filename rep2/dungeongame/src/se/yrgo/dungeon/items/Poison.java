package se.yrgo.dungeon.items;

import se.yrgo.dungeon.*;

public class Poison implements Item {
    @Override
    public String getName() {
        return "pure poison";
    }

    @Override
    public void use(Player p) {
        System.out.println("Oh, it's nasty!");
        p.wound(5);
    }
}
