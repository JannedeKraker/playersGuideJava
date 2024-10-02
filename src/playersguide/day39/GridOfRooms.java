package playersguide.day39;

public class GridOfRooms {

  private  final String[][] gridOfRooms = {{"entrance", null, "fountain", null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}};


  private final int startRoomRow = 0;
  private final int startRoomColumn = 0;
  private int whichRoomAreWeRow;
  private int whichRoomAreWeColumn;

    public void movingInGrid(String move) {
        switch (move) {
            case "north":
                if (startRoomRow == whichRoomAreWeRow) {
                    System.out.println(" if you go north, you leave the cavern, you can only leave the cavern by using the word exit.");
                } else whichRoomAreWeRow--;
                break;
            case "east":
                whichRoomAreWeColumn++;
                break;
            case "south":
                whichRoomAreWeRow++;
                break;
            case "west":
                if (startRoomColumn == whichRoomAreWeColumn) {
                    System.out.println(" if you go west, you leave the cavern, you can only leave the cavern by using the word exit.");
                }
                whichRoomAreWeColumn--;
                break;
        }
    }
    String getRoomCoordinates(){
       return "["+ whichRoomAreWeRow + "]" + "["+ whichRoomAreWeColumn + "]";
    } // Wat is beter? met String naam of zonder?
    String getRoomContents() {
        String roomContent = gridOfRooms[whichRoomAreWeRow][whichRoomAreWeColumn];
        return roomContent;
    } // Wat is beter? met String naam of zonder?

}
