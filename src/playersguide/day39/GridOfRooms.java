package playersguide.day39;

import java.util.Scanner;

public class GridOfRooms {

    private final String[][] gridOfRooms = {{"entrance", null, "fountain", null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}};

    private Fountain fountain = new Fountain();

    private final int startRoomRow = 0;
    private final int startRoomColumn = 0;
    private int whichRoomAreWeRow;
    private int whichRoomAreWeColumn;

    static Scanner keyboard = new Scanner(System.in);

    public String doSomethingAtTheRoom(String command) {
        switch (command) {
            case "exit":
                return "You feel the sun is shining, your eyes have to get used to the bright light";
            case "fountain on":
                fountain.setFountainState(true);
                return "You hear water falling. you feel splashes on your cheek.";
            case "fountain off":
                fountain.setFountainState(false);
                return "You hear a dripping sound.";
            default:
                return " ";
        }
    }

    public String getAnswer() {
        String answer = keyboard.next();
        return answer;
    }

    public String movingInGrid(String move) {
        switch (move) {
            case "start": return getRoomCoordinates() + experienceRoom();
            case "north":
                if (startRoomRow == whichRoomAreWeRow) {
                    return " if you go north, you leave the cavern, you can only leave the cavern by using the word exit.";
                } else whichRoomAreWeRow--;
                return getRoomCoordinates() + experienceRoom();

            case "east":
                whichRoomAreWeColumn++;
                return getRoomCoordinates() + experienceRoom();

            case "south":
                whichRoomAreWeRow++;
                return getRoomCoordinates() + experienceRoom();

            case "west":
                if (startRoomColumn == whichRoomAreWeColumn) {
                    System.out.println(" if you go west, you leave the cavern, you can only leave the cavern by using the word exit.");
                }
                whichRoomAreWeColumn--;
                return getRoomCoordinates() + experienceRoom();
            default:
                return " ";

        }
    }

    public String getRoomCoordinates() {
        return "You are in room: [" + whichRoomAreWeRow + "]" + "[" + whichRoomAreWeColumn + "]";
    } // Wat is beter? met String naam of zonder?

    public String getRoomContents() {
        String roomContent = gridOfRooms[whichRoomAreWeRow][whichRoomAreWeColumn];
        return roomContent;
    } // Wat is beter? met String naam of zonder?

    public String experienceRoom() {
        switch (getRoomContents()) {
            case "null":
                return "It is very quiet and dark here.";
            case "entrance":
                if (fountain.getFountainState()) {
                    return "You won!!";
                } else {
                    return "light shines in from outside. You are at the entrance.";
                }
            case "fountain":
                if (fountain.getFountainState()) {
                    return "You feel splashes on your cheek. You hear the rushing waters from the Fountain of Objects. It has been reactivated!";
                } else {
                    return "you hear a dripping sound";
                }
            default:
                return "we are lost";

        }
    }
}



