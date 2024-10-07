package playersguide.day39;

import static playersguide.day39.Choice.*;


public class Grid {

    private String[][] rooms;

    private Fountain fountain = new Fountain();

    private final int startRow = 0;

    private final int startColumn = 0;

    private int currentRow;
    private int currentColumn;
    boolean inGrid;

    public Grid(String size) {
        switch (size) {
            case "small":
                this.rooms = new Rooms().getRoomsSmall();
                break;
            case "medium":
                this.rooms = new Rooms().getRoomsMedium();
                break;
            case "large":
                this.rooms = new Rooms().getRoomsLarge();
                break;
        }

    }

    public String move(Choice choice) {

        switch (choice) {
            case START:
                inGrid = true;
                return getRoomCoordinates() + experienceRoom();
            case EXIT:
                if (getRoomContents().equals("entrance") && inGrid) {
                    return "You feel the sun is shining, your eyes have to get used to the bright light";
                } else if (inGrid) {
                    return "you have to go to the entrance if you want to exit the grid.";
                } else {
                    return "You have to be in the grid if you want to exit the grid.";
                }
            case FOUNTAIN_ON:
                if (inGrid && getRoomContents().equals("fountain")) {
                    fountain.setFountainState(true);
                    return "You hear water falling. you feel splashes on your cheek.";
                } else return "You are not in the room with the fountain";
            case FOUNTAIN_OFF:
                if (inGrid && getRoomContents().equals("fountain")) {
                    fountain.setFountainState(false);
                    return "You hear a dripping sound.";
                } else return "You are not in the room with the fountain";
            case NORTH:
                if (inGrid) {
                    if (startRow == currentRow) {
                        return "If you go north, you leave the cavern, you can only leave the cavern by using the word exit.";
                    } else --currentRow;
                    return getRoomCoordinates() + experienceRoom();
                } else return "You are not in the grid, you have to type start if you want to be in the grid.";
            case EAST:
                if (inGrid) {
                    if (currentColumn != rooms.length - 1) {
                        ++currentColumn;
                        return getRoomCoordinates() + experienceRoom();
                    } else return "If you go east, you clash to the wall, there is no door to another room";
                } else return "You are not in the grid, you have to type start if you want to be in the grid.";
            case SOUTH:
                if (inGrid) {
                    if (currentRow != rooms[0].length - 1) {
                        ++currentRow;
                        return getRoomCoordinates() + experienceRoom();
                    } else return "If you go south, you clash to the wall, there is no door to another room";
                } else return "You are not in the grid, you have to type start if you want to be in the grid.";
            case WEST:
                if (inGrid) {
                    if (startColumn == currentColumn) {
                        System.out.println(" if you go west, you leave the cavern, you can only leave the cavern by using the word exit.");
                    } else {
                        --currentColumn;
                        return getRoomCoordinates() + experienceRoom();
                    }
                } else return "You are not in the grid, you have to type start if you want to be in the grid.";
            default:
                return "I don't understand your answer. ";

        }
    }

    public String getRoomCoordinates() {
        return "You are in room: [" + currentRow + "]" + "[" + currentColumn + "]\n";
    }

    public String getRoomContents() {
        return rooms[currentRow][currentColumn];
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



