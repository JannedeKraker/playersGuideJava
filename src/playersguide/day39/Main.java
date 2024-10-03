package playersguide.day39;

public class Main {
    public static void main(String[] args) {
        GridOfRooms gridOfRooms = new GridOfRooms();
        System.out.println(fountainOfObjectsStart());

        System.out.println(whatDoYouWant());
        System.out.println(gridOfRooms.movingInGrid(gridOfRooms.getAnswer()));

//
//
//        gridOfRooms.movingInGrid("east");
//        System.out.println(gridOfRooms.getRoomContents());
//        System.out.println(gridOfRooms.getRoomCoordinates());
    }

    public static String fountainOfObjectsStart() {
        String intro = "Welcome at the Fountain of Objects game.\n" +
                "You can search in the grid of rooms for the fountain of Objects.\n " +
                "Pay close attention because it is very dark.\n " +
                "If you have found the Fountain of Objects you must activate it to win.\n " +
                "Once you have done that you must return to the entrance.\n " +
                "If you succeed, you have won the game.\n " +
                "The commands to move are: north, east, south, west.\n " +
                "You can exit the entrance by typing: exit.\n " +
                "To activate the fountain, type on. and to deactivate it, type off.\n" +
                "If you want to start typ start.";
        return intro;
    }

    public static String whatDoYouWant(){
        return "What do you want to do?";
    }
}
