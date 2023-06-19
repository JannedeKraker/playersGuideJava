package playersguide.day26;

import java.util.Scanner;
import java.util.regex.*;


public class Door {
    private StateOfDoor stateOfDoor = StateOfDoor.CLOSED;
    private String passcode;

    public Door() {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Welcome to the door. You can lock the door with an passcode. Give an passcode with four numbers: ");
        String newPasscode = inputKeyboard.nextLine();
        /* this regex means that this string consists of a minimum and a maximum of 4 digits*/
        String regex = "\\d{4}";

        if (Pattern.compile(regex).matcher(newPasscode).matches()) {
            System.out.println("the door is locked with your passcode");
            this.stateOfDoor = StateOfDoor.LOCKED;
            this.passcode = newPasscode;
        } else {
            System.out.println("Your passcode does not consist of 4 digits.");
            Door newDoor = new Door();
        }
    }

    public String getPasscode() {
        return passcode;
    }

    public void lockDoor() {
        if (stateOfDoor.equals(StateOfDoor.LOCKED)) {
            System.out.println("The door is already locked. What do you want to do? ");
            stateOfDoor.setStateOfDoor("locked");
        } else if (stateOfDoor.equals(StateOfDoor.CLOSED)) {
            stateOfDoor = StateOfDoor.LOCKED;
            System.out.println("The door is " + stateOfDoor + ". What do you want to do? ");
        } else {
            System.out.println("The door is open. You can only lock the Door when it is closed. What do you want to do? ");
        }
    }

    public void unlockDoor() {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("What is the passcode from the door?");
        String tryPasscode = inputKeyboard.nextLine();
        if (tryPasscode.equals(getPasscode())) {
            System.out.println("the door is unlocked");
            stateOfDoor = StateOfDoor.CLOSED;
        } else {
            System.out.println("that is the wrong passcode");
        }
    }


    public void openDoor() {
        if (stateOfDoor.equals(StateOfDoor.LOCKED)) {
            System.out.println("You can not open the door because it is Locked.");
        } else if (stateOfDoor.equals(StateOfDoor.CLOSED)) {
            stateOfDoor = StateOfDoor.OPEN;
            System.out.println("The door is " + stateOfDoor.getStateOfDoor() + ".");
        } else {
            System.out.println("The door is already open.");
        }
    }

    public void closeDoor() {
        if (stateOfDoor.equals(StateOfDoor.LOCKED)) {
            System.out.println("The door is already closed and locked.");
        } else if (stateOfDoor.equals(StateOfDoor.CLOSED)) {
            System.out.println("The door is already closed.");
        } else {
            stateOfDoor = StateOfDoor.CLOSED;
            System.out.println("The door is " + stateOfDoor.getStateOfDoor() + ".");
        }
    }

    public void exitDoor(boolean runWhileLoop) {
        System.out.println("Goodbye, the door dissolves into nothingness");
        runWhileLoop = false;
    }

    public void changePassword() {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("What is the passcode from the door now?");
        String tryPasscode = inputKeyboard.nextLine();
        if (tryPasscode.equals(getPasscode())) {
            System.out.println("the passcode is correct. give a new passcode:");
            String newPasscode = inputKeyboard.nextLine();
            /* this regex means that this string consists of a minimum and a maximum of 4 digits*/
            String regex = "\\d{4}";
            if (Pattern.compile(regex).matcher(newPasscode).matches()) {
                System.out.println("the door is locked with your new passcode");
                this.stateOfDoor = StateOfDoor.LOCKED;
                this.passcode = newPasscode;
            }
        }else {
                System.out.println("that is the wrong passcode");
            }
        }
    }



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





