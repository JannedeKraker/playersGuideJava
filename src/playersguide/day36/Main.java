package playersguide.day36;

public class Main {
    public static void main(String[] args) {
        RoomCoordinateRecord roomOne = new RoomCoordinateRecord(3,23);
        RoomCoordinateRecord roomTwo = new RoomCoordinateRecord(4,679);

        System.out.println( RoomCoordinateRecord.isItAnAdjacentRoom(roomOne,roomTwo));

        RoomCoordinateRecord roomThree = new RoomCoordinateRecord(4,23);
        RoomCoordinateRecord roomFour = new RoomCoordinateRecord(4,679);

        System.out.println( RoomCoordinateRecord.isItAnAdjacentRoom(roomThree,roomFour));

        RoomCoordinateRecord roomFive = new RoomCoordinateRecord(4,680);
        RoomCoordinateRecord roomSix = new RoomCoordinateRecord(800,679);

        System.out.println( RoomCoordinateRecord.isItAnAdjacentRoom(roomFive,roomSix));
    }
}
