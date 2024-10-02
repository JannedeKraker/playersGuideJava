package playersguide.day39;

public class Main {
    public static void main(String[] args) {
        GridOfRooms gridOfRooms = new GridOfRooms();
        gridOfRooms.movingInGrid("east");
        gridOfRooms.movingInGrid("east");
        System.out.println(gridOfRooms.getRoomContents());
        System.out.println(gridOfRooms.getRoomCoordinates());
    }
}
