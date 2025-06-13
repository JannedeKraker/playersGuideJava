package playersguide.day39;

public class Main {

    public static void main(String[] args) {
        String whereAreWe;

        Grid grid = new Grid(Menu.getSize());


        Menu.showStartMenu();
        do {
            Choice choice = Menu.getAction();
            whereAreWe = grid.move(choice);
            grid.experienceRoom();
            Menu.show(whereAreWe);
        }
        while (!Rooms.finished);

    }
}
