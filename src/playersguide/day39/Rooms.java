package playersguide.day39;

public class Rooms {

    private String[][] roomsSmall = new String[][]
            {{"entrance", "empty", "fountain", "empty"},
            {"empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty"}};
    private String[][] roomsMedium = new String[][]
            {{"entrance", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "fountain", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty"}};
    private String[][] roomsLarge = new String[][]
            {{"entrance", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "fountain"},
            {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
            {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"}};

    public String[][] getRoomsSmall() {
        return roomsSmall;
    }
    public String[][] getRoomsMedium() {
        return roomsMedium;
    }public String[][] getRoomsLarge() {
        return roomsLarge;
    }
}
