package playersguide.day39;

import java.util.Random;

public class Maelstrom implements Movable {

    private int currentRow;
    private int currentColumn;

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

    public boolean hearingMaelstrom(int playerCurrentRow, int playerCurrentColumn) {
        return (playerCurrentRow++ == currentRow || playerCurrentRow-- == currentRow|| playerCurrentRow == currentRow) &&  (playerCurrentColumn++ == currentColumn || playerCurrentColumn-- == currentColumn|| playerCurrentColumn == currentColumn);

    }
}
