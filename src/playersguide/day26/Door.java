package playersguide.day26;

import java.util.Scanner;
import java.util.regex.*;


public class Door {
    private StateOfDoor stateOfDoor = StateOfDoor.CLOSED;
    private String passcode;
    private static boolean runWhileLoop = true;

    public String getPasscode() {
        return passcode;
    }

    public Door() {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("You can lock the door with an passcode. Give an passcode with four numbers: ");
        passcode = inputKeyboard.nextLine();
        /* this regex means that this string consists of a minimum and a maximum of 4 digits*/
        String regex = "\\d{4}";

        if (Pattern.compile(regex).matcher(passcode).matches()) {
            System.out.println("the door is locked with your passcode");
            stateOfDoor = StateOfDoor.LOCKED;

        } else {
            System.out.println("Your passcode does not consist of 4 digits.");
            Door newDoor = new Door();

        }
    }

    public void exit() {
        runWhileLoop = false;
    }

    public void doorOptions() {
        while (runWhileLoop) {
            System.out.println("Welcome to this door, what do you want to do? (open, lock, unlock, close, change password or nothing more)");
            Scanner keyboardInput = new Scanner(System.in);
            String toDo = keyboardInput.nextLine();
            switch (toDo) {
                case "open":
                    newDoor.openDoor();
                case "lock":
                    newDoor.lockDoor();
                case "unlock":
                    newDoor.unlockDoor();
                case "change password":
                    newDoor.changePassword();
                case "nothing more":
                    newDoor.exit();
            }

        }
    }

    public void lockDoor(StateOfDoor stateOfDoor) {

        if (stateOfDoor.equals(StateOfDoor.LOCKED)) {
            System.out.println("The Door is already locked. What do you want to do? ");
            stateOfDoor.setStateOfDoor("locked");

        } else if (stateOfDoor.equals(StateOfDoor.CLOSED)) {
            stateOfDoor = StateOfDoor.LOCKED;
            System.out.println("The Door is " + stateOfDoor + ". What do you want to do? ");

        } else {
            System.out.println("The Door is open. You can only lock the Door when it is closed. What do you want to do? ");

        }
    }

    public void unlockDoor(Door newDoor) {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("What is the passcode from the door?");
        String tryPasscode = inputKeyboard.nextLine();
        if (tryPasscode.equals(newDoor.getPasscode())) {
            System.out.println("the door is unlocked");

        } else {
            System.out.println("that is the wrong passcode");
            unlockDoor(newDoor);
        }
    }


    public void openDoor(StateOfDoor stateOfDoor) {

    }

    public void closeDoor(StateOfDoor stateOfDoor) {

    }

    public void changePassword()

//    public void ToDoWithDoor(Door newDoor) {
//
//        StateOfDoor stateOfDoor;
//        Scanner inputKeyboard = new Scanner(System.in);
//        System.out.println("The door is " + stateOfDoor + ". What do you want to do with the door? ");
//        String toDoWithDoor = inputKeyboard.nextLine();
//
//
//        while (stateOfDoor == stateOfDoor) {
//            switch (toDoWithDoor) {
//                case "open":
//                    if (stateOfDoor.equals(StateOfDoor.LOCKED)) {
//                        System.out.println("You can not open the door because it is Locked. What do you want to do?");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    } else if (stateOfDoor.equals(StateOfDoor.CLOSED)) {
//                        stateOfDoor = StateOfDoor.OPEN;
//                        System.out.println("The Door is " + stateOfDoor + ". What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    } else {
//                        System.out.println("The Door is already open. What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    }
//                case "unlock":
//                    if (stateOfDoor.equals(StateOfDoor.LOCKED)) {
//                        unlockDoor(newDoor);
//                        stateOfDoor = StateOfDoor.CLOSED;
//                        System.out.println("The Door is " + stateOfDoor + ". What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    } else if (stateOfDoor.equals(StateOfDoor.CLOSED)) {
//                        System.out.println("The Door is already unlocked. What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    } else {
//                        System.out.println("The Door is already unlocked. What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    }
//                case "close":
//                    if (stateOfDoor.equals(StateOfDoor.LOCKED)) {
//                        System.out.println("The Door is already closed and locked. What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    } else if (stateOfDoor.equals(StateOfDoor.CLOSED)) {
//                        System.out.println("The Door is already closed. What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    } else {
//                        stateOfDoor = StateOfDoor.CLOSED;
//                        System.out.println("The Door is " + stateOfDoor + ". What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    }
//                case "lock":
//                    if (stateOfDoor.equals(StateOfDoor.LOCKED)) {
//                        System.out.println("The Door is already locked. What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    } else if (stateOfDoor.equals(StateOfDoor.CLOSED)) {
//                        stateOfDoor = StateOfDoor.LOCKED;
//                        System.out.println("The Door is " + stateOfDoor + ". What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    } else {
//                        System.out.println("The Door is open. You can only lock the Door when it is closed. What do you want to do? ");
//                        toDoWithDoor = inputKeyboard.nextLine();
//                        break;
//                    }
//                default:
//                    System.out.println("I can't do what you want with the Door right now. \nOr I don't understand what you are saying. \nWhat do you want to do?");
//                    toDoWithDoor = inputKeyboard.nextLine();
//            }
//        }
//    }


}


