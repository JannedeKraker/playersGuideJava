package playersguide.day39;

import java.util.Scanner;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);

    public static String getSize() {
        String size = "";
        boolean isNotGoodAnswer = true;

        while (isNotGoodAnswer) {
            System.out.println("How big do you want the grid of rooms to be? (small, medium or large)");
            size = keyboard.nextLine().toLowerCase().trim();
            if (size.equals("small") || size.equals("medium") || size.equals("large")) {
                isNotGoodAnswer = false;
            } else {
                System.out.println("I don't understand what you want.");
            }
        }
        return size;
    }

    public static Choice getAction() {

        System.out.println("What do you want to do?");
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
        System.out.println(string);
    }

    public static String startMenu() {
        String green = "\u001B[32m";
        String normalColor = "\u001B[0m";
        return ("Welcome at the Fountain of Objects game.\n" +
                "You can search in the grid of rooms for the fountain of Objects.\n" +
                "Pay close attention because it is very dark.\n" +
                "If you have found the Fountain of Objects you must activate it to win.\n" +
                "Once you have done that you must return to the entrance.\n" +
                "If you succeed, you have won the game.\n" +
                "The commands to move are:" + green + " north, east, south, west" + normalColor + ".\n" +
                "You can exit the entrance by typing:" + green + " exit" + normalColor + ".\n" +
                "To activate the fountain, type:" + green + " fountain on" + normalColor + ".\nTo deactivate it, type:" + green + " fountain off" + normalColor + ".\n" +
                "You have a bow and five arrows, you can shoot arrows into rooms around you with these commands:" + green + " shoot north, shoot east, shoot south, shoot west" + normalColor + ".\n" +
                "If a monster is in that room, it is killed" + ".\n" +
                "If you want to start type:" + green + " start" + normalColor + ".\n");

    }
    public static String helpMenu(){
        return "test String help menu";
    }
}
