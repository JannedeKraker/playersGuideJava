package playersguide.day39;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String whereAreWe;
        Grid grid = new Grid();
        Menu.showStartMenu();
        do {
            Choice choice = Menu.getAction();
            whereAreWe = grid.move(choice);
            Menu.show(whereAreWe);
        }
        while (!whereAreWe.equals("You feel the sun is shining, your eyes have to get used to the bright light"));

//
//
//        gridOfRooms.movingInGrid("east");
//        System.out.println(gridOfRooms.getRoomContents());
//        System.out.println(gridOfRooms.getRoomCoordinates());
    }


}
