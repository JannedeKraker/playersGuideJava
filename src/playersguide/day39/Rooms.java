package playersguide.day39;

public class Rooms {


    static boolean finished;


    private String[][] roomsSmall = new String[][] //4x4
            {{"entrance", "empty", "fountain", "empty"},
                    {"empty", "empty", "amarok", "empty"},
                    {"empty", "pit", "empty", "empty"},
                    {"empty", "empty", "empty", "empty"}};
    private String[][] roomsMedium = new String[][] //6x6
            {{"entrance", "empty", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "pit"},
                    {"empty", "empty", "fountain", "amarok", "empty", "empty"},
                    {"empty", "pit", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "empty"},
                    {"empty", "amarok", "empty", "empty", "empty", "empty"}};
    private String[][] roomsLarge = new String[][] //8x8
            {{"entrance", "empty", "empty", "empty", "empty", "pit", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "amarok", "empty", "empty", "empty"},
                    {"empty", "pit", "empty", "empty", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                    {"empty", "empty", "empty", "pit", "empty", "empty", "empty", "amarok"},
                    {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "fountain"},
                    {"empty", "amarok", "empty", "empty", "empty", "empty", "pit", "empty"},
                    {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"}};

    public String[][] getRoomsSmall() {
        return roomsSmall;
    }

    public String[][] getRoomsMedium() {
        return roomsMedium;
    }

    public String[][] getRoomsLarge() {
        return roomsLarge;
    }
}
