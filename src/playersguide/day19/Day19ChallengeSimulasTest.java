package playersguide.day19;

import java.util.Scanner;


public class Day19ChallengeSimulasTest {
    public static void main(String[] args) {
        StateOfChest stateOfChest = StateOfChest.LOCKED;
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("The chest is " + stateOfChest + ". What do you want to do with the chest? ");
        String toDoWithChest = inputKeyboard.nextLine();

        while (stateOfChest == stateOfChest) {
            switch (toDoWithChest) {
                case "open":
                    if (stateOfChest.equals(StateOfChest.LOCKED)) {
                        System.out.println("You can not open the chest because it is Locked. What do you want to do?");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    } else if (stateOfChest.equals(StateOfChest.CLOSED)) {
                        stateOfChest = StateOfChest.OPEN;
                        System.out.println("The chest is " + stateOfChest + ". What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    } else {
                        System.out.println("The chest is already open. What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    }
                case "unlock":
                    if (stateOfChest.equals(StateOfChest.LOCKED)) {
                        stateOfChest = StateOfChest.CLOSED;
                        System.out.println("The chest is " + stateOfChest + ". What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    } else if (stateOfChest.equals(StateOfChest.CLOSED)) {
                        System.out.println("The chest is already unlocked. What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    } else {
                        System.out.println("The chest is already unlocked. What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    }
                case "close":
                    if (stateOfChest.equals(StateOfChest.LOCKED)) {
                        System.out.println("The chest is already closed and locked. What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    } else if (stateOfChest.equals(StateOfChest.CLOSED)) {
                        System.out.println("The chest is already closed. What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    } else {
                        stateOfChest = StateOfChest.CLOSED;
                        System.out.println("The chest is " + stateOfChest + ". What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    }
                case "lock":
                    if (stateOfChest.equals(StateOfChest.LOCKED)) {
                        System.out.println("The chest is already locked. What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    } else if (stateOfChest.equals(StateOfChest.CLOSED)) {
                        stateOfChest = StateOfChest.LOCKED;
                        System.out.println("The chest is " + stateOfChest + ". What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    } else {
                        System.out.println("The chest is open. You can only lock the chest when it is closed. What do you want to do? ");
                        toDoWithChest = inputKeyboard.nextLine();
                        break;
                    }
                default:
                    System.out.println("I can't do what you want with the chest right now. \nOr I don't understand what you are saying. \nWhat do you want to do?");
                    toDoWithChest = inputKeyboard.nextLine();
            }
        }
    }
}


