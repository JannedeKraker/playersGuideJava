package playersguide.day39;


import java.util.ArrayList;

public class Grid {

    private String[][] rooms;
    private Player player = new Player();
    private Fountain fountain = new Fountain();
    ArrayList<Maelstrom> maelstroms = new ArrayList<>();

    private Maelstrom maelstromOne = new Maelstrom(); // TODO arrayList van maken
    private Maelstrom maelstromTwo = new Maelstrom();
    String gridSize;

    private final int startRow = 0;

    private final int startColumn = 0;

    boolean inGrid;


    public Grid(String size) {
        switch (size) {
            case "small":
                this.rooms = new Rooms().getRoomsSmall();
                gridSize = size;
                maelstromOne.setInGrid(size);
                break;
            case "medium":
                this.rooms = new Rooms().getRoomsMedium();
                gridSize = size;
                maelstromOne.setInGrid(size);
                break;
            case "large":
                this.rooms = new Rooms().getRoomsLarge();
                gridSize = size;
                maelstromOne.setInGrid(size);
                maelstromTwo.setInGrid(size);
                break;
        }

    }

    private boolean isInGrid(Movable thing) {
        return switch (gridSize) {
            case "small" -> thing.getCurrentRow() <= 3 & thing.getCurrentColumn() <= 3;
            case "medium" -> thing.getCurrentRow() <= 5 & thing.getCurrentColumn() <= 5;
            case "large" -> thing.getCurrentRow() <= 7 & thing.getCurrentColumn() <= 7;
            default -> false;
        };
    }

    public boolean isCloseToPit() {

        int rowMin = Math.max(player.getCurrentRow() - 1, 0);
        int rowMax = Math.min(player.getCurrentRow() + 1, rooms.length - 1);
        int columnMin = Math.max(player.getCurrentColumn() - 1, 0);
        int columnMax = Math.min(player.getCurrentColumn() + 1, rooms[0].length - 1);

        for (int row = rowMin; row <= rowMax; row++) {
            for (int column = columnMin; column <= columnMax; column++) {
                boolean isCurrentRoom = row == player.getCurrentRow() && column == player.getCurrentColumn();
                if (!isCurrentRoom && rooms[row][column].equals("pit")) {
                    return true;
                }
            }
        }
        return false;
    }


    public String move(Choice choice) {

        switch (choice) {
            case START:
                inGrid = true;
                return getRoomCoordinates() + experienceRoom();
            case EXIT:
                if (getRoomContents().equals("entrance") && inGrid) {
                    Rooms.finished = true;
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
                    if (startRow == player.getCurrentRow()) {
                        return "If you go north, you leave the cavern, you can only leave the cavern by using the word exit.";
                    } else player.setCurrentRow(player.getCurrentRow() - 1);
                    return getRoomCoordinates() + experienceRoom();
                } else return "You are not in the grid, you have to type start if you want to be in the grid.";
            case EAST:
                if (inGrid) {
                    if (player.getCurrentColumn() != rooms.length - 1) {
                        player.setCurrentColumn(player.getCurrentColumn() + 1);
                        return getRoomCoordinates() + experienceRoom();
                    } else return "If you go east, you clash to the wall, there is no door to another room";
                } else return "You are not in the grid, you have to type start if you want to be in the grid.";
            case SOUTH:
                if (inGrid) {
                    if (player.getCurrentRow() != rooms[0].length - 1) {
                        player.setCurrentRow(player.getCurrentRow() + 1);
                        return getRoomCoordinates() + experienceRoom();
                    } else return "If you go south, you clash to the wall, there is no door to another room";
                } else return "You are not in the grid, you have to type start if you want to be in the grid.";
            case WEST:
                if (inGrid) {
                    if (startColumn == player.getCurrentColumn()) {
                        System.out.println(" if you go west, you leave the cavern, you can only leave the cavern by using the word exit.");
                    } else {
                        player.setCurrentColumn(player.getCurrentColumn() - 1);
                        return getRoomCoordinates() + experienceRoom();
                    }
                } else return "You are not in the grid, you have to type start if you want to be in the grid.";
            default:
                return "I don't understand your answer. ";

        }
    }


    public String getRoomCoordinates() {
        return "You are in room: [" + player.getCurrentRow() + "]" + "[" + player.getCurrentColumn() + "]\n";
    }

    public String getRoomContents() {
        return rooms[player.getCurrentRow()][player.getCurrentColumn()];
    }

    public String experienceRoom() {
        String experience;
        switch (getRoomContents()) {
            case "empty":
                experience = "It is very quiet and dark here.";
                break;
            case "entrance":
                if (fountain.getFountainState()) {
                    experience = "You won!! The fountain of Objects has been put back into use.";
                    break;
                } else {
                    experience = "Light shines in from outside. You are at the entrance.";
                    break;
                }
            case "fountain":
                if (fountain.getFountainState()) {
                    experience = "You feel splashes on your cheek. You hear the rushing waters from the Fountain of Objects. It has been reactivated!";
                    break;
                } else {
                    experience = "You hear a dripping sound";
                    break;
                }
            case "pit":
                Rooms.finished = true;
                return "You are dead.";
            default:
                return "we are lost";
        }
        if (isCloseToPit()) {
            experience += "\nYou feel a draft. There is a pit in a nearby room.";
        }
        experience += getExperienceWithMaelstrom(experience);

        //TODO methode maken om te kijken of er een maelstrom in een kamer is naast waar je bent
        if (isCloseToMaelstrom()) {
            experience += "\n You hear the growling and groaning of a maelstrom nearby.";
        }

        return experience;
    }

    private boolean isCloseToMaelstrom() {

        return false;
    }


    private String getExperienceWithMaelstrom(String experience) {
        if (gridSize.equals("large")) {
            if (maelstromTwo.isAtRoomWithMaelstrom(player.getCurrentRow(), player.getCurrentColumn())) {
                player.setCurrentRow(player.getCurrentRow() - 1);
                player.setCurrentColumn(player.getCurrentColumn() + 2);
                experience += "\nWaah, you get blown away by a maelstrom to another room.";
                if (!isInGrid(player)) {
                    player.setInGrid(gridSize);
                    experience += "\nOops, you hit the outer walls of the grid and bounce into another room.";
                }
                if (!isInGrid(maelstromTwo)) {
                    maelstromOne.setInGrid(gridSize);
                }
            }
        }
        if (maelstromOne.isAtRoomWithMaelstrom(player.getCurrentRow(), player.getCurrentColumn())) {
            player.setCurrentRow(player.getCurrentRow() - 1);
            player.setCurrentColumn(player.getCurrentColumn() + 2);
            experience += "\nWaah, you get blown away by a maelstrom to another room.";
            if (!isInGrid(player)) {
                player.setInGrid(gridSize);
                experience += "\nOops, you hit the outer walls of the grid and bounce into another room.";
            }
            if (!isInGrid(maelstromOne)) {
                maelstromOne.setInGrid(gridSize);
            }
            experience += "\nYou are now in room: " + getRoomCoordinates();

        }
        return experience;
    }

    public void setInGrid(Movable thing) {
        thing.setInGrid(gridSize);
    }
}



