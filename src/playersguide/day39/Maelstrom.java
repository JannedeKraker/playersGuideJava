package playersguide.day39;

import java.util.Random;

public class Maelstrom implements Movable {

    private int currentRow;
    private int currentColumn;

    public Maelstrom(String sizeGrid) {
        setInGrid(sizeGrid);

    }
    public void move() {
        currentRow++;
        currentColumn -= 2;
    }
    public void whereIsMaelstrom() {
        System.out.println("Maelstrom is [" + currentRow + "," + currentColumn + "]");
    }

    @Override
    public int getCurrentRow() {
        return currentRow;
    }

    @Override
    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    @Override
    public int getCurrentColumn() {
        return currentColumn;
    }

    @Override
    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public void setInGrid(String sizeGrid) {
        Random random = new Random();
        if (sizeGrid.equals("small")) {
            currentRow = random.nextInt(4);
            currentColumn = random.nextInt(4);
        } else if (sizeGrid.equals("medium")) {
            currentRow = random.nextInt(6);
            currentColumn = random.nextInt(6);
        } else {
            currentRow = random.nextInt(8);
            currentColumn = random.nextInt(8);
        }
    }

    public boolean isAtRoomWithMaelstrom(int playerCurrentRow, int playerCurrentColumn) {
        return playerCurrentRow == currentRow && playerCurrentColumn == currentColumn;
    }

    //TODO bekijken of ik deze met minder code/ simpeler kan maken. hij is bijna hetzelfde als isCloseToPit
    public boolean hearingMaelstrom(int playerCurrentRow, int playerCurrentColumn, String[][] rooms) {

        // hier bereken ik de laagste rij waar de maelstrom  in kan zitten, of 0 of hoger, door die 0 voorkom ik dat hij buiten de grid komt
        int rowMin = Math.max(playerCurrentRow - 1, 0);
        // hier bereken ik de hoogste rij waar de maelstrom  kan zijn, door de length -1 kan hij niet buiten de grid komen want hij pakt de laagste waarde van die twee
        int rowMax = Math.min(playerCurrentRow + 1, rooms.length - 1);
        // hier bereken op dezelfe manier als de rij de laagste column waar de maelstrom  kan zitten.
        int columnMin = Math.max(playerCurrentColumn - 1, 0);
        // hier bereken ik op dezelfde manier als de rij waar de hoogste collumn waar de maelstrom kan zitten, met als verschil dat deze de lengte heeft van de hoeveelheid columns
        int columnMax = Math.min(playerCurrentColumn + 1, rooms[0].length - 1);

        // hier loopt hij door alle kamers om de pit heen en de kamer van de pit zelf.
        for (int row = rowMin; row <= rowMax; row++) {
            for (int column = columnMin; column <= columnMax; column++) {
                // hier checkt hij of de combinatie van de row en de column dezelfde collumn en row zijn van waar de speler nu is.
                boolean isPlayersRoom = row == playerCurrentRow && column == playerCurrentColumn;
                //hier checkt hij de combinatie van dat hij niet in de players kamer is maar wel of de kamer er omheen een maelstrom is.
                if (!isPlayersRoom & row == this.currentRow & column == this.currentColumn) {
                    return true;
                }
            }
        }
        return false;
    }
}
