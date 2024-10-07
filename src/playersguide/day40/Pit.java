package playersguide.day40;

import playersguide.day39.Grid;
import playersguide.day39.Rooms;

public class Pit {

    private int row;// bij small is het 2
    private int column;// bij small is het 1

    Grid grid;


    public Pit(Grid grid) {
        int row = 0;
        int column = 0;
        int y = -1;

        String[][] rooms = grid.getRooms();
        for (String[] roomsArray : rooms) {
            int i = -1;
            y++;
            for (String room : roomsArray) {

                i++;
                if (room.equals("pit")) {
                    row = y;
                    column = i;
                }
            }

        }
        this.row = row;
        this.column = column;
        this.grid = grid;
    }


    public boolean isItRoomNextToPit() {
        int gridRow = grid.getCurrentRow();
        int gridColumn = grid.getCurrentColumn();
        if (gridRow == this.row - 1 || gridRow == this.row || gridRow == this.row + 1) {
            if (gridColumn == this.column - 1 || gridColumn == this.column || gridColumn == this.column + 1) {
                if (gridRow == this.row && gridColumn == this.column) {
                    return false;
                } else return true;
            }
        }return false;}


public int getColumn() {
    return column;
}

public int getRow() {
    return row;
}

}
