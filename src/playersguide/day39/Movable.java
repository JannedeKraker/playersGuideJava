package playersguide.day39;

public interface Movable {
    // een interface gebruik je om gedrag/ methodes door te geven aan andere klassen dus de naam die die interface heeft moet ook een gedrag omschrijven


    void setInGrid(String sizeGrid);

    void move();

    void setCurrentRow(int row);

    void setCurrentColumn(int column);
    int getCurrentRow();
    int getCurrentColumn();
}
