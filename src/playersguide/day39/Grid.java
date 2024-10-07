package playersguide.day39;

public class Grid {

    private final String[][] rooms = {{"entrance", null, "fountain", null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}};

    private Fountain fountain = new Fountain();

    private final int startRow = 0;
    private final int startColumn = 0;
    private int currentRow;
    private int currentColumn;



    public String doSomething(String command) {
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



    public String move(String move) {
        switch (move) {
            case "start":
                return getRoomCoordinates() + experienceRoom();
            case "north":
                if (startRow == currentRow) {
                    return " if you go north, you leave the cavern, you can only leave the cavern by using the word exit.";
                } else currentRow--;
                return getRoomCoordinates() + experienceRoom();
            case "east":
                currentColumn++;
                return getRoomCoordinates() + experienceRoom();

            case "south":
                currentRow++;
                return getRoomCoordinates() + experienceRoom();

            case "west":
                if (startColumn == currentColumn) {
                    System.out.println(" if you go west, you leave the cavern, you can only leave the cavern by using the word exit.");
                }
                currentColumn--;
                return getRoomCoordinates() + experienceRoom();
            default:
                return " ";

        }
    }

    public String getRoomCoordinates() {
        return "You are in room: [" + currentRow + "]" + "[" + currentColumn + "]\n";
    } // Wat is beter? met String naam of zonder: beter kort.

    public String getRoomContents() {
        String roomContent = rooms[currentRow][currentColumn];
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



