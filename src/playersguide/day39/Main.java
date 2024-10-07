package playersguide.day39;

public class Main {

    public static void main(String[] args) {
        Choice choice;
        Grid grid = new Grid();
        Menu.showStartMenu();
        do{
        choice = Menu.getAction();
        Menu.show(grid.move(choice));}
        while (choice != Choice.EXIT);

//
//
//        gridOfRooms.movingInGrid("east");
//        System.out.println(gridOfRooms.getRoomContents());
//        System.out.println(gridOfRooms.getRoomCoordinates());
    }




}
