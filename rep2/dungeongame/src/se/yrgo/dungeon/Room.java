package se.yrgo.dungeon;

import java.util.*;

import se.yrgo.dungeon.items.*;
import se.yrgo.dungeon.monsters.*;

public class Room {
    private String name;
    private List<Monster> monsters;
    private List<Item> items;

    public Room(String name, List<Monster> monsters, List<Item> items) {
        this.name = name;
        this.monsters = new ArrayList<>(monsters);
        this.items = new ArrayList<>(items);
    }

    public String getName() {
        return name;
    }

    public List<Monster> getMonsters() {
        return Collections.unmodifiableList(monsters);
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public String toString() {
        return "Room [name=" + name + ", monsters=" + monsters + ", items=" + items + "]";
    }

    
}
