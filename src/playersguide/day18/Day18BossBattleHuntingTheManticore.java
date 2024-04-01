package playersguide.day18;

import java.util.Scanner;

import static playersguide.day12.Day12ThePrototype.*;
import static playersguide.day16.Day16TakingANumber.*;




public class Day18BossBattleHuntingTheManticore {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        int manticoreHealth = 10;
        int cityHealth = 15;
        int round = 1;
        int shot = 1;
        int manticoreDistance = askForNumberInRange("Player 1, choose the Manticore’s distance from the city: ", 0, 100);

        emptyScreen();
        beginMenu(round, manticoreHealth, cityHealth, shot);

        while (manticoreHealth > 0 && cityHealth > 0) {
            System.out.println("player 2, guess the distance to the manticore:");
            int guessNumber = keyboard.nextInt();

            if (manticoreDistance > guessNumber) {
                cityHealth--;
                round++;
                shot++;

                System.out.println("\n The shot fell not farr enough. The Manticore hit you, you are damaged for 1 point...\n");
                beginMenu(round, manticoreHealth, cityHealth, shot);
            } else if (manticoreDistance < guessNumber) {
                cityHealth--;
                round++;
                shot++;

                System.out.println("\n The shot fell to far away. The Manticore hit you, you are damaged for 1 point...\n");
                beginMenu(round, manticoreHealth, cityHealth, shot);
            } else {
                System.out.print("\n You have hit the Manticore, ");
                if (round % 3 == 0 && round % 5 == 0) {
                    System.out.println(ANSI_BLUE + "with an electric fiery shot!!\n" + ANSI_RESET);
                    manticoreHealth -= 10;
                    round++;
                    shot++;
                } else if (round % 3 == 0) {
                    System.out.println(ANSI_RED + "with an fiery shot!!\n" + ANSI_RESET);
                    manticoreHealth -= 3;
                    round++;
                    shot++;
                } else if (round % 5 == 0) {
                    System.out.println(ANSI_YELLOW + "with an electric shot!!\n" + ANSI_RESET);
                    manticoreHealth -= 3;
                    round++;
                    shot++;
                } else {
                    System.out.println("with an normal shot!\n");
                    manticoreHealth--;
                    round++;
                    shot++;
                }
                beginMenu(round, manticoreHealth, cityHealth, shot);
            }
        }
    }


    public static void beginMenu(int round, int manticoreHealth, int cityHealth, int shot) {
        int damagePoints;
        String destroyed = "";
        if (shot % 3 == 0 && shot % 5 == 0) {
            damagePoints = 10;
        } else if (shot % 3 == 0) {
            damagePoints = 3;
        } else if (shot % 5 == 0) {
            damagePoints = 3;
        } else {
            damagePoints = 1;
        }

        if (manticoreHealth <= 0) {
            destroyed = "\n| But the city of Consolas has been saved! The Manticore  |\n| is destroyed!! You don't have to use your canon again.  |";
        } else if (cityHealth <= 0) {
            destroyed = "\n| But the Manticore has destroyed the city of Consolas!!! | \n| The canon is fall into pieces and cannot shoot again.   |";
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("| STATUS:                                                 |");
        System.out.println("| Round: " + round + " | City: " + cityHealth + "/15  | Manticore: " + manticoreHealth + "/10              |");
        System.out.println("| The cannon is expected to deal " + damagePoints + " damage this round.     | " + destroyed);
        System.out.println("-----------------------------------------------------------\n");
    }
}

