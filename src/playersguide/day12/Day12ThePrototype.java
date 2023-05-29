package playersguide.day12;// Mylara, the captain of the Guard of Consolas,
// has approached you with the beginnings of a plan to hunt down The Uncoded One’s airship.
// “If we’re going to be able to track this thing down,” she says,
// “we need you to make us a program that can help us home in on a location.”
// She lays out a plan for a program to help with the hunt. One user,
// representing the airship pilot, picks a number between 0 and 100. Another user,
// the hunter, will then attempt to guess the number.
// The program will tell the hunter that they guessed correctly or that the number was too high or low.
// The program repeats until the hunter guesses the number correctly.
// Mylara claims, “If we can build this program, we can use what we learn to build a better
// version to hunt down the Uncoded One’s airship.”
//
//        Sample Program:
//
//        User 1, enter a number between 0 and 100: 27
//        After entering this number, the program should clear the screen and continue like this:
//        User 2, guess the number.
//        What is your next guess? 50
//        50 is too high.
//        What is your next guess? 25
//        25 is too low.
//        What is your next guess? 27
//        You guessed the number!
//        Objectives:
//
//        Build a program that will allow a user, the pilot, to enter a number.
//        If the number is above 100 or less than 0, keep asking.
//        Clear the screen once the program has collected a good number
//        (you can just write 50 blank lines to clear the screen :) ).
//        Ask a second user, the hunter,to guess numbers.
//        Indicate whether the user guessed too high, too low, or guessed right.
//        Loop until they get it right, then end the program.

import playersguide.day16.Day16TakingANumber;

import java.util.Scanner;

public class Day12ThePrototype {
    public static void main(String[] args) {
//        Instead of this code I used a method from Day16
//        Scanner inputKeyboard = new Scanner(System.in);
//        System.out.println("Hello Pilot, what is the number the hunter has to guess? (between 0 and 100)");
//        int number = inputKeyboard.nextInt();
        int number = Day16TakingANumber.askForNumberInRange("Hello Pilot, what is the number the hunter has to guess?", 0, 100);
        emptyScreen();
        goodNumber(number);
    }

    static void goodNumber(int number) {
        if (number < 1 || number > 99) {
            System.out.println("Hello Pilot, what is the number the hunter has to guess? --> (between 0 and 100)");
            Scanner inputKeyboard = new Scanner(System.in);
            number = inputKeyboard.nextInt();
            emptyScreen();
            guessTheNumber(number);
        } else guessTheNumber(number);
    }

    static void guessTheNumber(int number) {
        System.out.println("Hello hunter, guess the number from the Pilot");
        Scanner inputKeyboard = new Scanner(System.in);
        int guessNumber = inputKeyboard.nextInt();

        while (number > guessNumber || number < guessNumber) {

            if (number > guessNumber) {
                System.out.println("Hello hunter, the number is too low, guess again:");
                inputKeyboard = new Scanner(System.in);
                guessNumber = inputKeyboard.nextInt();
            } else if (number < guessNumber) {
                System.out.println("Hello hunter, the number is too high guess again:");
                inputKeyboard = new Scanner(System.in);
                guessNumber = inputKeyboard.nextInt();
            }
        }
        System.out.println("Yes! You have catch the Pilot! We are saved!!");
    }

    public static void emptyScreen() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

    }
}
