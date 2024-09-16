package playersguide.day32;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        go();


    }

    private static void go() {
        Pack pack1 = new Pack(12, 12, 12);
        Menu menu = new Menu();
        boolean addmore = true;
        int i = 0;
        InventoryItem[] items = new InventoryItem[20];
// het gaat nog niet zoals ik wil, hij geeft nu achteraf aan wat er in the pack zit, maar dat moet tussen door voor day 33.
        while (addmore) {

            items[i] = menu.getMenu();
            i++;


            System.out.println("Do you want to add more items in your pack? y/n");
            String choice = input.next();
            addmore = choice.equals("y");
        }
        pack1.add(items);
        System.out.println(pack1);
    }
}
