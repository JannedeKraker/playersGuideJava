package playersguide.day39;

public interface Movable {
    //TODO methodes maken inplaats van variablen, in de rest van de code dus ook methodes aanroepen.
    int currentRow = 0;
    int currentColumn = 0;

    void setInGrid(String sizeGrid);

    void setCurrentRow(int row);

    void setCurrentColumn(int column);
    int getCurrentRow();
    int getCurrentColumn();
}
