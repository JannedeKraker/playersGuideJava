package playersguide.day39;

public class Rooms {
    private int pitRow;
    private int pitColumn;
    private int secondPitRow;
    private int secondPitColumn;
    private int thirdPitRow;
    private int thirdPitColumn;
    private int forthPitRow;
    private int forthPitColumn;
    private String[][] roomsSmall = new String[][]
            {{"entrance", "empty", "fountain", "empty"},
                    {"empty", "empty", "empty", "empty"},
                    {"empty", "pit", "empty", "empty"},
                    {"empty", "empty", "empty", "empty"}};
    private String[][] roomsMedium = new String[][]
            {{"entrance", "empty", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "pit"},
                    {"empty", "empty", "fountain", "empty", "empty", "empty"},
                    {"empty", "pit", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "empty"}};
    private String[][] roomsLarge = new String[][]
            {{"entrance", "empty", "empty", "empty", "empty", "pit", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                    {"empty", "pit", "empty", "empty", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "pit", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "fountain"},
                    {"empty", "empty", "empty", "empty", "empty", "empty", "pit", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"}};


    public int getPitRow() {
        return pitRow;
    }

    public int getPitColumn() {
        return pitColumn;
    }

    public int getSecondPitRow() {
        return secondPitRow;
    }

    public int getSecondPitColumn() {
        return secondPitColumn;
    }

    public int getThirdPitRow() {
        return thirdPitRow;
    }

    public int getThirdPitColumn() {
        return thirdPitColumn;
    }

    public int getForthPitRow() {
        return forthPitRow;
    }

    public int getForthPitColumn() {
        return forthPitColumn;
    }




    public String[][] getRoomsSmall() {
        this.pitRow = 3;
        this.pitColumn = 1;
        return roomsSmall;
    }

    public String[][] getRoomsMedium() {
        this.pitRow = 2;
        this.pitColumn = 1;
        this.secondPitRow = 1;
        this.secondPitColumn = 5;
        return roomsMedium;
    }

    public String[][] getRoomsLarge() {
        this.pitRow = 0;
        this.pitColumn = 5;
        this.secondPitRow = 2;
        this.secondPitColumn = 1;
        this.thirdPitRow = 4;
        this.thirdPitColumn = 3;
        this.forthPitRow =6 ;
        this.forthPitColumn = 6;
        return roomsLarge;
    }
}
