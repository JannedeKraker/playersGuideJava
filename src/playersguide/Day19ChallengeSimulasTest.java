package playersguide;

import java.util.Scanner;

//As you move through the village of Enumerant, you notice a short, cloaked
//figure following you. Not being one to enjoy a mysterious figure tailing you,
//you seize a moment to confront the figure. “Don’t be alarmed!” she says. “I
//am Simula. They are saying you’re a Programmer. Is this true?” You answer
//in the aﬀirmative, and Simula’s eyes widen. “If you are truly a Programmer,
//you will be able to help me. Follow me.” She leads you to a backstreet and
//into a dimly lit hovel. She hands you a small, locked chest. “We haven’t seen
//any Programmers in these lands in a long time. And especially not ones that
//can craft types. If you are a True Programmer, you will want what is in that
//chest. And if you are a True Programmer, I will gladly give it to you to aid
//you in your quest.” The chest is a small box you can hold in your hand. The
//lid can be open, closed (but unlocked), or locked. You’d normally be able to go
//between these states, opening, closing, locking, and unlocking the box, but the
//box is broken.You need to create a program with an enumeration to recreate
//this locking mechanism.
//The box can be in three states: if the box is in the OPEN state, you can close
//it, and it becomes CLOSED if the box is in the CLOSED state, you can open
//it, and it becomes OPEN if the box is in the CLOSED state, you can lock it,
//and it becomes LOCKED if the box is in the LOCKED state, you can unlock
//it, and it becomes CLOSED
//Nothing happens if you attempt an impossible action in the current state, like
//opening a locked box. The program below shows what using this might look
//like:
//The chest is locked. What do you want to do? unlock
//The chest is unlocked. What do you want to do? open
//The chest is open. What do you want to do? close
//The chest is unlocked. What do you want to do?
//Objectives:
//• Define an enumeration for the state of the chest.
//• Make a variable whose type is this new enumeration.
//• Write code to allow you to manipulate the chest with the lock, unlock,
//
//open, and close commands, but ensure that you don’t transition between
//states that don’t support it.
//• Loop forever, asking for the next command.
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


