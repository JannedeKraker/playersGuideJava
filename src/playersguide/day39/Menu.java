package playersguide.day39;

import java.util.Scanner;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);

    public static String getSize() {
        String size = "";
        boolean isNotGoodAnswer = true;

        while(isNotGoodAnswer){
        System.out.println("How big do you want the grid of rooms to be? (small, medium or large)");
        size = keyboard.nextLine().toLowerCase().trim();
        if (size.equals("small") || size.equals("medium") || size.equals("large")){
            isNotGoodAnswer = false;
        }
        else {
            System.out.println("I don't understand what you want.");
        }
        }return size;}

    public static Choice getAction() {

        System.out.println("What do you want to do?");
        String choice = keyboard.nextLine().toLowerCase().trim();
        return switch (choice) {
            case "start" -> Choice.START;
            case "exit" -> Choice.EXIT;
            case "fountain on" -> Choice.FOUNTAIN_ON;
            case "fountain off" -> Choice.FOUNTAIN_OFF;
            case "north" -> Choice.NORTH;
            case "east" -> Choice.EAST;
            case "south" -> Choice.SOUTH;
            case "west" -> Choice.WEST;
            default -> Choice.NO_GOOD_ANSWER;
        };
    }

    public static void show(String string) {
        System.out.println(string);
    }

    public static void showStartMenu() {
        String green = "\u001B[32m";
        String normalColor = "\u001B[0m";
        System.out.println("Welcome at the Fountain of Objects game.\n" +
                "You can search in the grid of rooms for the fountain of Objects.\n" +
                "Pay close attention because it is very dark.\n" +
                "If you have found the Fountain of Objects you must activate it to win.\n" +
                "Once you have done that you must return to the entrance.\n" +
                "If you succeed, you have won the game.\n" +
                "The commands to move are:" + green + " north, east, south, west" + normalColor + ".\n" +
                "You can exit the entrance by typing:" + green + " exit" + normalColor + ".\n" +
                "To activate the fountain, type:" + green + " fountain on" + normalColor + ".\nTo deactivate it, type:" + green + " fountain off" + normalColor + ".\n" +
                "If you want to start type:" + green + " start" + normalColor + ".\n");

    }
}
