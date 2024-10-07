package playersguide.day39;

import java.util.Scanner;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);

    public static Choice getAction() {

        System.out.println("What do you want to do?");
        String choice = keyboard.next();
        switch (choice){
            case "start": return Action.START;
            case "exit": return Action.EXIT;
            case "fountain on": return Action.FOUNTAIN_ON;
            case "fountain off": return Action.FOUNTAIN_OFF;
            case "north": return Move.NORTH;
            case "east": return Move.EAST;
            case "south": return Move.SOUTH;
            case "west": return Move.WEST;
            default: return null;
        }
    }

    public static void show(String string){
        System.out.println(string);
    }

    public static void showStartMenu() {
        System.out.println("Welcome at the Fountain of Objects game.\n" +
                "You can search in the grid of rooms for the fountain of Objects.\n " +
                "Pay close attention because it is very dark.\n " +
                "If you have found the Fountain of Objects you must activate it to win.\n " +
                "Once you have done that you must return to the entrance.\n " +
                "If you succeed, you have won the game.\n " +
                "The commands to move are: north, east, south, west.\n " +
                "You can exit the entrance by typing: exit.\n " +
                "To activate the fountain, type on. and to deactivate it, type off.\n" +
                "If you want to start typ start.");

    }
}
