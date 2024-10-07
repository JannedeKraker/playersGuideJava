package playersguide.day39;

import static playersguide.day39.Choice.*;


public class Grid {

    private final String[][] rooms = {{"entrance", "empty", "fountain", "empty"},
            {"empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty"}};

    private Fountain fountain = new Fountain();

    private final int startRow = 0;
    private final int startColumn = 0;
    private int currentRow;
    private int currentColumn;


       public String move(Choice choice) {

        switch (choice) {
            case START:
                return getRoomCoordinates() + experienceRoom();
            case EXIT:
                return "You feel the sun is shining, your eyes have to get used to the bright light";
            case FOUNTAIN_ON:
                fountain.setFountainState(true);
                return "You hear water falling. you feel splashes on your cheek.";
            case FOUNTAIN_OFF:
                fountain.setFountainState(false);
                return "You hear a dripping sound.";
            case NORTH:
                if (startRow == currentRow) {
                    return " if you go north, you leave the cavern, you can only leave the cavern by using the word exit.";
                } else currentRow--;
                return getRoomCoordinates() + experienceRoom();
            case EAST:
                currentColumn++;
                return getRoomCoordinates() + experienceRoom();
            case SOUTH:
                currentRow++;
                return getRoomCoordinates() + experienceRoom();
            case WEST:
                if (startColumn == currentColumn) {
                    System.out.println(" if you go west, you leave the cavern, you can only leave the cavern by using the word exit.");
                }
                currentColumn--;
                return getRoomCoordinates() + experienceRoom();
            default:
                return "I don't understand your answer. ";

        }
    }

    public String getRoomCoordinates() {
        return "You are in room: [" + currentRow + "]" + "[" + currentColumn + "]\n";
    }

    public String getRoomContents() {
        return rooms[currentRow][currentColumn].toString();
    }

    public String experienceRoom() {
        switch (getRoomContents()) {
            case "empty":
                return "It is very quiet and dark here.";
            case "entrance":
                if (fountain.getFountainState()) {
                    return "You won!! The fountain of Objects has been put back into use.";
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



