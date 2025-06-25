package playersguide.day39;

import java.util.Scanner;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);

    public static String getSize() {
        String size = "";
        boolean isNotGoodAnswer = true;

        while (isNotGoodAnswer) {
            System.out.print("\nHow big do you want the maze of rooms to be? (small, medium or large)\n");
            size = keyboard.nextLine().toLowerCase().trim();
            if (size.equals("small") || size.equals("medium") || size.equals("large")) {
                isNotGoodAnswer = false;
            } else {
                System.out.print("I don't understand what you want.\n");
            }
        }
        return size;
    }

    public static Choice getAction() {

        System.out.print("\nWhat do you want to do?\n");
        String choice = keyboard.nextLine().toLowerCase().trim();
        return switch (choice) {
            case "start" -> Choice.START;
            case "exit" -> Choice.EXIT;
            case "help" -> Choice.HELP;
            case "fountain on" -> Choice.FOUNTAIN_ON;
            case "fountain off" -> Choice.FOUNTAIN_OFF;
            case "north" -> Choice.NORTH;
            case "east" -> Choice.EAST;
            case "south" -> Choice.SOUTH;
            case "west" -> Choice.WEST;
            case "shoot north" -> Choice.SHOOT_NORTH;
            case "shoot east" -> Choice.SHOOT_EAST;
            case "shoot south" -> Choice.SHOOT_SOUTH;
            case "shoot west" -> Choice.SHOOT_WEST;
            default -> Choice.NO_GOOD_ANSWER;
        };
    }

    public static void show(String string) {
        System.out.print(string);
    }

    public static String startMenu() {
        String green = "\u001B[32m";
        String normalColor = "\u001B[0m";
        return (
                "You enter the Cavern of Objects, a maze of rooms filled with dangerous pits in search\n" +
                        "of the Fountain of Objects.\n" +
                        "Light is visible only in the entrance, and no other light is seen anywhere in the caverns.\n" +
                        "You must navigate the Caverns with your other senses.\n" +
                        "Find the Fountain of Objects, activate it, and return to the entrance.\n" +
                        "Look out for pits. You will feel a breeze if a pit is in an adjacent room. \n" +
                        "If you enter a room with a pit, you will die.\n" +
                        "Maelstroms ar violent forces of sentient wind.\n" +
                        "Entering a room with one could transport you to any other location in the caverns.\n" +
                        "You will be able to hear their growling and groaning in nearby rooms.\n" +
                        "Amaroks roam the caverns. Encountering one is certain death,\n" +
                        "but you can smell their rotten stench in nearby rooms.\n" +
                        "You carry with you a bow and a quiver of arrows.\n" +
                        "You can use them to shoot Maelstroms and Amaroks in the caverns but be warned:\n" +
                        "you have a limited supply.\n" + helpMenu());


    }

    public static String helpMenu() {
        String green = "\u001B[32m";
        String normalColor = "\u001B[0m";
        return          "\nThe commands to move are:" + green + " north, east, south, west" + normalColor + ".\n" +
                        "You can exit the entrance by typing:" + green + " exit" + normalColor + ".\n" +
                        "To activate the fountain, type:" + green + " fountain on" + normalColor + ".\nTo deactivate it, type:" + green + " fountain off" + normalColor + ".\n" +
                        "You have a bow and five arrows, you can shoot arrows into rooms around you with these commands:" + green + " shoot north, shoot east, shoot south, shoot west" + normalColor + ".\n" +
                        "If a monster is in that room, it is killed" + ".\n" +
                        "If ypu want to see the commands again type:" + green + " help" + normalColor + ".\n" +
                        "If you want to start type:" + green + " start" + normalColor + ".\n";
    }
}
