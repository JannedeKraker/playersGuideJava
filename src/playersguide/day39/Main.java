package playersguide.day39;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid();
        Menu.showStartMenu();
        String action = Menu.getAction();
        Menu.show(grid.move(action));

//
//
//        gridOfRooms.movingInGrid("east");
//        System.out.println(gridOfRooms.getRoomContents());
//        System.out.println(gridOfRooms.getRoomCoordinates());
    }




}
