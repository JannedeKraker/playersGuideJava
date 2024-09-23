package playersguide.day36;


public class RoomCoordinateRecord {
    private  final int coordinateRoomRow;
    private final int coordinateRoomColumn;

    public int getCoordinateRoomRow() {
        return coordinateRoomRow;
    }

    public int getCoordinateRoomColumn() {
        return coordinateRoomColumn;
    }

    RoomCoordinateRecord(int coordinateRoomRow, int coordinateRoomColumn){
      this.coordinateRoomRow = coordinateRoomRow;
      this.coordinateRoomColumn = coordinateRoomColumn;
    }

    public String getRoomCoordinates(){
        String coordinatesRoom = "Room row: " + coordinateRoomRow + "\nRoom column: " + coordinateRoomColumn;
    return coordinatesRoom;
    }

    public static boolean isItAnAdjacentRoom(RoomCoordinateRecord RoomOne, RoomCoordinateRecord RoomTwo){

        int differenceRow = RoomOne.getCoordinateRoomRow() -
                RoomTwo.getCoordinateRoomRow();
        int differenceColumn = RoomOne.getCoordinateRoomColumn() -
                RoomTwo.getCoordinateRoomColumn();

        if (differenceRow == 1 || differenceRow == -1 || differenceColumn == 1 || differenceColumn == -1 ) return true;
       else return false;


    }

}
