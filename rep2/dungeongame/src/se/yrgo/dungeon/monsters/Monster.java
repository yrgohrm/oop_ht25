package se.yrgo.dungeon.monsters;

import se.yrgo.dungeon.*;

public interface Monster {
    String getName();
    boolean fight(Player p);
    boolean talk(Player p);
}
