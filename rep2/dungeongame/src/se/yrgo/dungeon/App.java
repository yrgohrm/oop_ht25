package se.yrgo.dungeon;

import java.util.*;

import se.yrgo.dungeon.colors.*;
import se.yrgo.dungeon.items.*;
import se.yrgo.dungeon.monsters.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ansi monsterStyle = Ansi.make().red().bold();
        Ansi itemStyle = Ansi.make().yellow();

        Player p = new Player();

        Item diamond = new Diamond();
        Item poison = new Poison();

        Monster troll = new Troll();
        Monster troll2 = new Troll();
        Monster troll3 = new Troll();
        Monster snake = new Snake();

        Room startingRoom = new Room("a hallway",
                List.of(troll),
                List.of(diamond));

        Room room00 = new Room("an empty cave", List.of(), List.of());
        Room room01 = new Room("an empty cave", List.of(), List.of());
        Room room02 = new Room("an empty cave", List.of(), List.of());
        Room room10 = new Room("an empty hallway", List.of(), List.of());
        Room room12 = new Room("a funny hallway", List.of(troll2, snake), List.of());
        Room room20 = new Room("a colorful hallway", List.of(), List.of());
        Room room21 = new Room("an immense cave", List.of(troll3), List.of());
        Room room22 = new Room("a small cave", List.of(), List.of(poison));

        Room[][] world = {
                { room00, room01, room02 },
                { room10, startingRoom, room12 },
                { room20, room21, room22 },
        };

        int currentX = 1;
        int currentY = 1;

        game: while (true) {
            Ansi.clearScreen();

            Room currentRoom = world[currentY][currentX];
            System.out.printf("You are now in %s.%n%n", currentRoom.getName());

            if (currentRoom.getMonsters().isEmpty()
                    && currentRoom.getItems().isEmpty()) {
                System.out.println("It is a very empty room.");
                System.out.println();
            }

            if (!currentRoom.getMonsters().isEmpty()) {
                System.out.println("There are some monsters here:");
                for (Monster monster : currentRoom.getMonsters()) {
                    String name = monsterStyle.format(monster.getName());
                    System.out.println(name);
                }
                System.out.println();
            }

            if (!currentRoom.getItems().isEmpty()) {
                System.out.println("You can see some items here:");
                for (Item item : currentRoom.getItems()) {
                    String name = itemStyle.format(item.getName());
                    System.out.println(name);
                }
                System.out.println();
            }

            System.out.println("What do you want to do?");
            String action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "up" -> {
                    currentY--;
                    if (currentY < 0) {
                        currentY = 2;
                    }
                }
                case "down" -> {
                    currentY++;
                    if (currentY > 2) {
                        currentY = 0;
                    }
                }
                case "left" -> {
                    currentX--;
                    if (currentX < 0) {
                        currentX = 2;
                    }
                }
                case "right" -> {
                    currentX++;
                    if (currentX > 2) {
                        currentX = 0;
                    }
                }
                case "fight" -> {
                    doFight(scanner, currentRoom, p);
                }
                case "quit" -> {
                    System.out.println("Coward!");
                    break game;
                }
                default -> {
                    System.out.println("Unknown command!");
                }
            }
        }
    }

    private static void doFight(Scanner scanner, Room currentRoom, Player p) {
        List<Monster> monsters = currentRoom.getMonsters();
        Monster monster = null;
        if (monsters.isEmpty()) {
            System.out.println("Nothing here to fight!");
            return;
        }

        if (monsters.size() == 1) {
            monster = monsters.get(0);
        } else {
            for (int i = 0; i < monsters.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, monsters.get(i).getName());
            }
            System.out.println();
            System.out.println("Who do you want to fight");
            int number = scanner.nextInt();
            scanner.nextLine();

            monster = monsters.get(number - 1);
        }

        // does currently not handle if the monster dies
        monster.fight(p);

        // not so nice thing to just avoid the clear screen
        System.out.println("Press enter to continue.");
        scanner.nextLine();
    }
}
