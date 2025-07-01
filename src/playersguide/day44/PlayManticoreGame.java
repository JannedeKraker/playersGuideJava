package playersguide.day44;

import playersguide.day18.Day18BossBattleHuntingTheManticoreTwoPlayer;

import java.util.Scanner;
//TODO met Mark bespreken ->
// Answer this question: How might you use inheritance, polymorphism, or interfaces to allow the
// game to be either a single player (the computer randomly chooses the starting location and
// direction) or two players (the second human determines the starting location and direction)?
public class PlayManticoreGame {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Do you want to play a one player or two player game? (type one or two)");
        String oneOrTwo = keyboard.nextLine().trim().toLowerCase();

        if (oneOrTwo.equals("one")) {
            Day44BossBattleHuntingTheManticoreOnePlayer.main(new String[0]);
        } else if (oneOrTwo.equals("two")) {
            Day18BossBattleHuntingTheManticoreTwoPlayer.main(new String[0]);
        } else {
            System.out.println("I don't understand, bye.");
        }
    }
}
