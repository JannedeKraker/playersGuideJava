package playersguide.day39;

import playersguide.day40.Pit;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String whereAreWe;
        String experienceRoom;
        Grid grid = new Grid(Menu.getSize());
        Pit pit = new Pit(grid);

        Menu.showStartMenu();
        do {
            Choice choice = Menu.getAction();
            whereAreWe = grid.move(choice);
            experienceRoom = grid.experienceRoom();

//            System.out.println("is the room next to pit? "+ pit.isItRoomNextToPit());
            Menu.show(whereAreWe);
        }
        while (!experienceRoom.equals("You feel the sun is shining, your eyes have to get used to the bright light") && !experienceRoom.equals("You are dead."));

//
//
//        gridOfRooms.movingInGrid("east");
//        System.out.println(gridOfRooms.getRoomContents());
//        System.out.println(gridOfRooms.getRoomCoordinates());
    }


}
