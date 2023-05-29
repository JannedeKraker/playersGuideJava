package playersguide.day18;

import java.util.Scanner;

import static playersguide.day12.Day12ThePrototype.*;
import static playersguide.day16.Day16TakingANumber.*;

//The Uncoded One’s airship, the Manticore, has begun an all-out attack on the
//city of Consolas. It must be destroyed, or the city will fall. Only by combining
//Mylara’s prototype, Skorin’s cannon, and your programming skills will you have
//a chance to win this fight. You must build a program that allows one user—the
//pilot of the Manticore—to enter the airship’s range from the city and a second
//user—the city’s defenses—to attempt to find what distance the airship is at and
//destroy it before it can lay waste to the town.
//The first user begins by secretly establishing how far the Manticore is from
//the city, in the range 0 to 100. The program then allows a second player to
//repeatedly attempt to destroy the airship by picking the range to target until
//either the city of Consolas or the Manticore is destroyed. In each attempt, the
//player is told if they overshot (too far), fell short (not far enough), or hit the
//Manticore. The damage dealt to the Manticore depends on the turn number.
//For most turns, 1 point of damage is dealt. But if the turn number is a multiple
//of 3, a fire blast deals 3 points of damage; a multiple of 5, an electric blast deals
//3 points of damage, and if it is a multiple of both 3 and 5, a mighty fire-electric
//blast deals 10 points of damage. The Manticore is destroyed after taking 10
//points of damage.
//However, if the Manticore survives a turn, it will deal a guaranteed 1 point of
//damage to the city of Consolas. The city can only take 15 points of damage
//before being annihilated.
//Before a round begins, the user should see the current status: the current round
//number, the city’s health, and the Manticore’s health.
//A sample run of the program is shown below. The first player gets a chance to
//place the Manticore:
//Player 1, how far away from the city do you want to station the Manticore?
//At this point, the display is cleared, and the second player gets their chance:
//Player 2, it is your turn.
//-----------------------------------------------------------
//STATUS: Round: 1 City: 15/15 Manticore: 10/10
//The cannon is expected to deal 1 damage this round.
//Enter desired cannon range: 50
//That round OVERSHOT the target.
//-----------------------------------------------------------
//STATUS: Round: 2 City: 14/15 Manticore: 10/10
//The cannon is expected to deal 1 damage this round.
//Enter desired cannon range: 25
//That round FELL SHORT of the target.
//-----------------------------------------------------------
//STATUS: Round: 3 City: 13/15 Manticore: 10/10
//The cannon is expected to deal 3 damage this round.
//Enter desired cannon range: 32
//That round was a DIRECT HIT!
//-----------------------------------------------------------
//STATUS: Round: 4 City: 12/15 Manticore: 7/10
//The cannon is expected to deal 1 damage this round.
//Enter desired cannon range: 32
//That round was a DIRECT HIT!
//-----------------------------------------------------------
//STATUS: Round: 5 City: 11/15 Manticore: 6/10
//The cannon is expected to deal 3 damage this round.
//Enter desired cannon range: 32
//That round was a DIRECT HIT!
//12
//-----------------------------------------------------------
//STATUS: Round: 6 City: 10/15 Manticore: 3/10
//The cannon is expected to deal 3 damage this round.
//Enter desired cannon range: 32
//That round was a DIRECT HIT!
//The Manticore has been destroyed! The city of Consolas has been saved!
//Objectives:
//• Establish the game’s starting state: the Manticore begins with 10 health
//points and the city with 15. The game starts at round 1.
//• Ask the first player to choose the Manticore’s distance from the city (0 to
//100). Clear the screen afterward.
//• Run the game in a loop until either the Manticore’s or city’s health reaches
//0.
//• Before the second player’s turn, display the round number, the city’s
//health, and the Manticore’s health.
//• Compute how much damage the cannon will deal this round: 10 points if
//the round number is a multiple of both 3 and 5, 3 if it is a multiple of 3
//or 5 (but not both), and 1 otherwise. Display this to the player.
//• Get a target range from the second player, and resolve its effect. Tell the
//user if they overshot (too far), fell short, or hit the Manticore. If it was a
//hit, reduce the Manticore’s health by the expected amount.
//• If the Manticore is still alive, reduce the city’s health by 1.
//• Advance to the next round.
//• When the Manticore or the city’s health reaches 0, end the game and
//display the outcome.
//• Use different colors for different types of messages.
//• Note: This is the largest program you have made so far. Expect it to take
//some time!
//• Note: Use methods to focus on solving one problem at a time.
//• Note: This version requires two players, but in the future, we will modify
//it to allow the computer to randomly place the Manticore so that it can
//be a single-player game.
//To study if you find this difficult yet: - You may possibly want to use
//fields/instance variables/attributes to make it easier to pass data like the Man-
//ticore’s current health W3 schools fields - This program can grow quite big;
//possibly you want to create a separate class (say ManticoreHunting) in its own
//java file and call it from your main program, like
// Program.java
//class Program {
//public static void main(String[] args) {
//ManticoreHunting hunting = new ManticoreHunting();
//hunting.run();
//}
//}


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

