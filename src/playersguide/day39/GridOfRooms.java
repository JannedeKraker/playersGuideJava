package playersguide.day39;

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
            default: return " ";
        }
    }

    public void movingInGrid(String move) {
        switch (move) {
            case "north":
                if (startRoomRow == whichRoomAreWeRow) {
                    System.out.println(" if you go north, you leave the cavern, you can only leave the cavern by using the word exit.");
                } else whichRoomAreWeRow--;
                break;
            case "east":
                whichRoomAreWeColumn++;
                break;
            case "south":
                whichRoomAreWeRow++;
                break;
            case "west":
                if (startRoomColumn == whichRoomAreWeColumn) {
                    System.out.println(" if you go west, you leave the cavern, you can only leave the cavern by using the word exit.");
                }
                whichRoomAreWeColumn--;
                break;
        }
    }

    public String getRoomCoordinates() {
        return "[" + whichRoomAreWeRow + "]" + "[" + whichRoomAreWeColumn + "]";
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
                return "light shines in from outside. You are at the entrance.";
            case "fountain":
                if (fountain.getFountainState()) {
                    return "You hear water falling. you feel splashes on your cheek.";
                } else {
                    return "you hear a dripping sound";
                }
            default:
                return "we are lost";

        }
    }
}



