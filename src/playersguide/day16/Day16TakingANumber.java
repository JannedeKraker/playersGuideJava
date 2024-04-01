package playersguide.day16;
import java.util.Scanner;


public class Day16TakingANumber {
    public static void main(String[] args) {

        System.out.println(askForNumber("What is the airspeed velocity of an unladen swallow?"));
        System.out.println(askForNumberInRange("Guess the number.", 0, 100));
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




