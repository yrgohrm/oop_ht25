package se.yrgo.dungeon.items;

import se.yrgo.dungeon.*;

public interface Item {
    void use(Player p);
    String getName();
}
