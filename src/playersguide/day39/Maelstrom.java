package playersguide.day39;

import java.util.Random;

public class Maelstrom implements Movable {

    private int currentRow;
    private int currentColumn;
public Maelstrom(String sizeGrid){
    setInGrid(sizeGrid);

}
public void whereIsMaelstrom(){
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

    public boolean hearingMaelstrom(int playerCurrentRow, int playerCurrentColumn) {
    // hier worden alle kamers om de player heen gecontroleerd, maar ook de kamer van de player zelf. Dit is geen probleem omdat deze methode alleen gebruikt wordt als de methode isAtRoomWithMaelstrom() false is.
        return (playerCurrentRow++ == currentRow || playerCurrentRow-- == currentRow|| playerCurrentRow == currentRow) &&  (playerCurrentColumn++ == currentColumn || playerCurrentColumn-- == currentColumn|| playerCurrentColumn == currentColumn);

    }
}
