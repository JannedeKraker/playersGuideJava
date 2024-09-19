package playersguide.day32;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        go();


    }

    private static void go() {
        Pack pack = new Pack(12, 12, 12);

        boolean addmore = true;
        while (addmore) {
            pack.add(Menu.getItemFromUser());
            System.out.println(pack);
            addmore = Menu.getYesOrNoFromUser();
        }

        System.out.println(pack);
    }
}
