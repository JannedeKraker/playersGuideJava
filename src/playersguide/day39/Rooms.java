package playersguide.day39;

import playersguide.day40.*;

public class Rooms {
  Pit[] pits;
  RoomsNextToPit[] roomsNextToPits;



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
