package playersguide.day26;

import java.util.Scanner;

public class ControllerRoom {

    public void doorOptions(Door newDoor) {
        boolean runWhileLoop = true;
        while (runWhileLoop) {
            System.out.println("What do you want to do? (open, lock, unlock, close, change password or leave the door)");
            Scanner keyboardInput = new Scanner(System.in);
            String toDo = keyboardInput.nextLine();
            switch (toDo) {
                case "open":
                    newDoor.openDoor();
                    break;
                case "close":
                    newDoor.closeDoor();
                    break;
                case "lock":
                    newDoor.lockDoor();
                    break;
                case "unlock":
                    newDoor.unlockDoor();
                    break;
                case "change password":
                    newDoor.changePassword();
                    break;
                case "leave the door":
                    System.out.println("Goodbye, the door dissolves into nothingness");
                    runWhileLoop = false;
                    break;
                default:
                    System.out.println("I don't understand what you want, try it again.");
                    break;
            }

        }
    }
}
