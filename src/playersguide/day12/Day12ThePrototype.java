package playersguide.day12;
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
