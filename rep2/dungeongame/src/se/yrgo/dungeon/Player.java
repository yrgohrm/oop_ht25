package se.yrgo.dungeon;

import java.util.*;

import se.yrgo.dungeon.items.*;

public class Player {
    private int health;
    private List<Item> inventory;

    public Player() {
        health = 20;
        inventory = new ArrayList<>();
    }

    public void wound(int amount) {
        health -= amount;
    }

    public void heal(int amount) {
        health += amount;
    }

    public void pickup(Item item) {
        inventory.add(item);
    }

    public void drop(Item item) {
        inventory.remove(item);
    }

    public void use(Item item) {
        item.use(this);
    }

    public boolean isDead() {
        return health < 1;
    }

    public int getHealth() {
        return health;
    }
}
