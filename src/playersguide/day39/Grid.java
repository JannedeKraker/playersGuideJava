package playersguide.day39;


import java.util.ArrayList;

public class Grid {

    private String[][] rooms;
    private Player player = new Player();
    private Fountain fountain = new Fountain();
    ArrayList<Monster> monsters = new ArrayList<>();
    ArrayList<Maelstrom> maelstroms = new ArrayList<>();


    String gridSize;

    private final int startRow = 0;

    private final int startColumn = 0;

    boolean inGrid;


    public Grid(String size) {
        Maelstrom maelstrom = new Maelstrom(size);
        Maelstrom maelstrom2 = new Maelstrom(size);
        Amarok amarok = new Amarok();
        switch (size) {
            case "small":
                this.rooms = new Rooms().getRoomsSmall();
                gridSize = size;
                maelstroms.add(maelstrom);
                monsters.add(maelstrom);
                monsters.add(amarok);
                break;
            case "medium":
                this.rooms = new Rooms().getRoomsMedium();
                gridSize = size;
                maelstroms.add(maelstrom);
                monsters.add(maelstrom);
                monsters.add(amarok);
                break;
            case "large":
                this.rooms = new Rooms().getRoomsLarge();
                gridSize = size;
                maelstroms.add(maelstrom);
                maelstroms.add(maelstrom2);
                monsters.add(maelstrom);
                monsters.add(maelstrom2);
                monsters.add(amarok);
                break;
        }

    }

    private boolean isInGrid(Movable thing) {
        return switch (gridSize) {
            case "small" ->
                    (thing.getCurrentRow() <= 3 & thing.getCurrentColumn() <= 3) & (thing.getCurrentRow() >= 0 & thing.getCurrentColumn() >= 0);
            case "medium" ->
                    (thing.getCurrentRow() <= 5 & thing.getCurrentColumn() <= 5) & (thing.getCurrentRow() >= 0 & thing.getCurrentColumn() >= 0);
            case "large" ->
                    (thing.getCurrentRow() <= 7 & thing.getCurrentColumn() <= 7) & (thing.getCurrentRow() >= 0 & thing.getCurrentColumn() >= 0);
            default -> false;
        };
    }

    public boolean isCloseTo(String thing) {
        // hier bereken ik de laagste rij waar de pit in kan zitten, of 0 of hoger, door die 0 voorkom ik dat hij buiten de grid komt
        int rowMin = Math.max(player.getCurrentRow() - 1, 0);
        // hier bereken ik de hoogste rij waar de pit kan zijn, door de length -1 kan hij niet buiten de grid komen want hij pakt de laagste waarde van die twee
        int rowMax = Math.min(player.getCurrentRow() + 1, rooms.length - 1);
        // hier bereken op dezelfe manier als de rij de laagste column waar de pit kan zitten.
        int columnMin = Math.max(player.getCurrentColumn() - 1, 0);
        // hier bereken ik op dezelfde manier als de rij waar de hoogste collumn waar de pit kan zitten, met als verschil dat deze de lengte heeft van de hoeveelheid columns
        int columnMax = Math.min(player.getCurrentColumn() + 1, rooms[0].length - 1);

        // hier loopt hij door alle kamers om de pit heen en de kamer van de pit zelf.
        for (int row = rowMin; row <= rowMax; row++) {
            for (int column = columnMin; column <= columnMax; column++) {
                // hier checkt hij of de combinatie van de row en de column dezelfde collumn en row zijn van waar de speler nu is.
                boolean isPlayersRoom = row == player.getCurrentRow() && column == player.getCurrentColumn();
                //hier checkt hij de combinatie van dat hij niet in de players kamer is maar wel of de kamer er omheen een pit is.
                if (!isPlayersRoom && rooms[row][column].equals(thing)) {
                    return true;
                }
            }
        }
        return false;
    }


    public String[][] getRooms() {
        return rooms;
    }

    public String move(Choice choice) {

        switch (choice) {
            case START:
                inGrid = true;
                return getRoomCoordinates() + player.showAmountOffArrows() + experienceRoom();
            case EXIT:
                if (getRoomContents().equals("entrance") && inGrid) {
                    Rooms.finished = true;
                    return "You feel the sun is shining, your eyes have to get used to the bright light.\n";
                } else if (inGrid) {
                    return "you have to go to the entrance if you want to exit the grid.\n";
                } else {
                    return "You have to be in the grid if you want to exit the grid.\n";
                }
            case HELP:
                return Menu.helpMenu();
            case FOUNTAIN_ON:
                if (inGrid && getRoomContents().equals("fountain")) {
                    fountain.setFountainState(true);
                    return "You hear water falling. you feel splashes on your cheek.\n";
                } else return "You are not in the room with the fountain\n";
            case FOUNTAIN_OFF:
                if (inGrid && getRoomContents().equals("fountain")) {
                    fountain.setFountainState(false);
                    return "You hear a dripping sound.\n";
                } else return "You are not in the room with the fountain\n";
            case NORTH:
                if (inGrid) {
                    if (startRow == player.getCurrentRow()) {
                        return "If you go north, you leave the cavern, you can only leave the cavern by using the word exit.\n";
                    } else player.setCurrentRow(-1);
                    return getRoomCoordinates() + player.showAmountOffArrows() + experienceRoom();
                } else return "You are not in the grid, you have to type start if you want to be in the grid.\n";
            case EAST:
                if (inGrid) {
                    if (player.getCurrentColumn() != rooms.length - 1) {
                        player.setCurrentColumn(+1);
                        return getRoomCoordinates() + player.showAmountOffArrows() + experienceRoom();
                    } else return "If you go east, you clash to the wall, there is no door to another room.\n";
                } else return "You are not in the grid, you have to type start if you want to be in the grid.\n";
            case SOUTH:
                if (inGrid) {
                    if (player.getCurrentRow() != rooms[0].length - 1) {
                        player.setCurrentRow(+1);
                        return getRoomCoordinates() + player.showAmountOffArrows() + experienceRoom();
                    } else return "If you go south, you clash to the wall, there is no door to another room.\n";
                } else return "You are not in the grid, you have to type start if you want to be in the grid.\n";
            case WEST:
                if (inGrid) {
                    if (startColumn == player.getCurrentColumn()) {
                        System.out.println("If you go west, you leave the cavern, you can only leave the cavern by using the word exit.\n");
                    } else {
                        player.setCurrentColumn(-1);
                        return getRoomCoordinates() + player.showAmountOffArrows() + experienceRoom();
                    }
                } else return "You are not in the grid, you have to type start if you want to be in the grid.\n";
            case SHOOT_NORTH: // row - 1
            case SHOOT_EAST: // column + 1
            case SHOOT_SOUTH: // row + 1
            case SHOOT_WEST: // column - 1
                try {
                    if (player.areThereArrows()) {
                        if (isThereAMonster(choice)) {
                            String killedMonster = killTheMonster();
                            Monster.name = "";
                            player.setArrows(-1);
                            return "You have killed " + killedMonster + ".\n" + player.showAmountOffArrows();
                        } else {
                            player.setArrows(-1);
                            return "Your arrow hits the wall. There is no monster in that room.\n" + player.showAmountOffArrows();
                        }
                    } else return "You can't shoot anymore. You're out of arrows.\n";
                } catch (IndexOutOfBoundsException e) {
                    player.setArrows(-1);
                    return "Your arrow won't go far because there's no other room there.\n";
                }
            default:
                return "I don't understand your answer.\n";

        }
    }

    public boolean isThereAMonster(Choice choice) {
        int shotRoomRow = player.getCurrentRow();
        int shotRoomColumn = player.getCurrentColumn();

        switch (choice) {
            case SHOOT_NORTH:
                shotRoomRow--;// row - 1
                break;
            case SHOOT_EAST:
                shotRoomColumn++;// column + 1
                break;
            case SHOOT_SOUTH:
                shotRoomRow++; // row + 1
                break;
            case SHOOT_WEST:
                shotRoomColumn--; // column - 1
                break;
        }
        for (Monster monster : monsters) {
            if (monster.isMonsterAtRoom(shotRoomRow, shotRoomColumn, rooms)) {
                if (monster instanceof Maelstrom) {
                    Monster.name = "maelstrom";
                } else {
                    Monster.name = "amarok";
                }
                return true;
            }
        }
        return false;
    }

    public String killTheMonster() {
        if (Monster.name.equals("amarok")) {
            rooms[Amarok.shotAmarokRow][Amarok.getShotAmarokColumn()] = "empty";
            Monster.name = "an Amarok";
        } else if (Monster.name.equals("maelstrom")) {
            maelstroms.remove(0);
            Monster.name = "a maelstrom";
        }
        return Monster.name;
    }

    public String getRoomCoordinates() {
        return "\nYou are in room: [" + player.getCurrentRow() + "]" + "[" + player.getCurrentColumn() + "]\n";
    }

    public String getRoomContents() {
        return rooms[player.getCurrentRow()][player.getCurrentColumn()];
    }

    public String experienceRoom() {
        String experience;
        switch (getRoomContents()) {
            case "empty":
                experience = "It is very quiet and dark here.\n";
                break;
            case "entrance":
                if (fountain.getFountainState()) {
                    experience = "You won!! The fountain of Objects has been put back into use.\n";
                    break;
                } else {
                    experience = "Light shines in from outside. You are at the entrance.\n";
                    break;
                }
            case "fountain":
                if (fountain.getFountainState()) {
                    experience = "You feel splashes on your cheek.\nYou hear the rushing waters from the Fountain of Objects.\nIt has been reactivated!";
                    break;
                } else {
                    experience = "You hear a dripping sound\n";
                    break;
                }
            case "pit":
                Rooms.finished = true;
                return "oh no! You fell into a very deep pit.\nYou can't continue your mission to turn on the fountain.\nWhen you are better, will you come and continue your mission?!";
            case "amarok":
                Rooms.finished = true;
                return "Aaaah!! you are looking into the mouth of an amarok.\nA giant, rotting, wolf-like creature.\nSadly, this is the last thing you see in your life.\nYou are dead.";
            default:
                return "we are lost\n";
        }
        if (isCloseTo("pit")) {
            experience += "You feel a draft. There is a pit in a nearby room.\n";
        }
        if (isCloseTo("amarok")) {
            experience += "You can smell the rotten stench of an amarok in a nearby room.\n";
        }
        experience = getExperienceWithMaelstrom(experience);

        return experience;
    }


    private String getExperienceWithMaelstrom(String experience) {
        // checken of de maelstrom in dezelfde kamer is als de speler, zo ja dan wordt de speler weggeblazen zo niet dan checken of hij in een kamer er naast is en dat laten weten
        for (Maelstrom maelstrom : maelstroms) {
            if (maelstrom.isAtRoomWithMaelstrom(player.getCurrentRow(), player.getCurrentColumn())) {
                player.move();
                maelstrom.move();
                experience += "Waah, you get blown away by a maelstrom to another room.\n";
                // of de speler nog wel in de grid geplaatst is. zo niet de speler opnieuw ergens willekeurig in de grid plaatsen.
                if (!isInGrid(player)) {
                    player.setInGrid(gridSize);
                    experience += "Oops, you hit the outer walls of the grid and bounce into another room.\n";
                    experience += getRoomCoordinates() + experienceRoom();
                } else {
                    experience += getRoomCoordinates() + experienceRoom();
                }
                // of de maelstrom nog wel in de grid geplaatst is. zo niet de speler opnieuw ergens willekeurig in de grid plaatse
                if (!isInGrid(maelstrom)) {
                    maelstrom.setInGrid(gridSize);
                }

            } else if (maelstrom.hearingMaelstrom(player.getCurrentRow(), player.getCurrentColumn(), rooms)) {
                experience += "You hear the growling and groaning of a maelstrom nearby.\nBe careful not to get blown away.\n";
            }
        }
        return experience;
    }


    public void setInGrid(Movable thing) {
        thing.setInGrid(gridSize);
    }
}



