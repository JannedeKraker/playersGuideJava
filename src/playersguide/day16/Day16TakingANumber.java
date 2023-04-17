package playersguide.day16;
// Many previous tasks have required getting a number from a user. To save time
//writing this code repeatedly, you have decided to make a method to do this
//common task.

import java.util.Scanner;

//Objectives:
//• Make a method with the signature int askForNumber(String text). Dis-
//play the text parameter in the console window, get a response from the
//user, convert it to an int, and return it. This might look like this: int
//result = askForNumber(“What is the airspeed velocity of an unladen swal-
//low?”);.
//• Make a method with the signature int askForNumberInRange(String
//text, int min, int max). Only return if the entered number is between
//the min and max values. Otherwise, ask again.
//• Place these methods in at least one of your previous programs to improve
//it. askForNumber(); used in Day6
//    askForNumberInRange(); used in Day12
public class Day16TakingANumber {
    public static void main(String[] args) {

        System.out.println(askForNumber("What is the airspeed velocity of an unladen swallow?"));
        System.out.println(askForNumberInRange("Guess the number.", 0,100));
    }

    public static int askForNumber(String question) {
        System.out.println(question);
        Scanner keyboard = new Scanner(System.in);
        int answer = keyboard.nextInt();
        return answer;
    }

// Method written with recursion, so the method is used in the method. He'll work well.
// But my teacher wrote this:
// ~ In most cases you avoid recursion because of possible memory problems and
// because even for professional programmers it is usually more difficult to understand
// than a normal loop. ~
// so I'm going to do it again with a do while loop instead of recursion.

//    static int askForNumberInRange(String question, int min, int max) {
//        System.out.println(question + "(between " + min + " and " + max + ")");
//        Scanner keyboard = new Scanner(System.in);
//        int answer = keyboard.nextInt();
//        if (answer < min || answer > max) {
//           return askForNumberInRange(question, min, max);
//        }
//        return answer;
//    }
public static int askForNumberInRange(String question, int min, int max) {
       System.out.println(question + "(between " + min + " and " + max + ")");
       Scanner keyboard = new Scanner(System.in);
       int answer = keyboard.nextInt();
       while (answer < min || answer > max) {
           System.out.println(question + "(between " + min + " and " + max + ")");
           answer = keyboard.nextInt();
       }
       return answer;
   }
}




