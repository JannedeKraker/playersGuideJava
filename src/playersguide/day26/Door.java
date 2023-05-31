package playersguide.day26;

import java.util.Scanner;
import java.util.regex.*;


public class Door {
    private StateOfDoor stateOfDoor;
    private String passcode;

    public Door() {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("You can lock the door with an passcode. Give an passcode with four numbers: ");
        passcode = inputKeyboard.nextLine();
        /* this regex means that this string consists of a minimum and a maximum of 4 digits*/
        String regex = "\\d{4}";

        if (Pattern.compile(regex).matcher(passcode).matches()) {
            System.out.println("the door is locked with your passcode");
        } else {
            System.out.println("Your passcode does not consist of 4 digits.");
            Door newDoor = new Door();
        }
    }
}


