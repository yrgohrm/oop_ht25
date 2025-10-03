package se.yrgo.dungeon.items;

import se.yrgo.dungeon.*;

public class Diamond implements Item {

    @Override
    public void use(Player p) {
        System.out.println("nothing happens");
    }

    @Override
    public String getName() {
        return "a sparkling diamond";
    }

    @Override
    public String toString() {
        return getName();
    }
}
