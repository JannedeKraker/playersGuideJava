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
        Pack pack1 = new Pack(12,12,12);
        Menu menu = new Menu();
        boolean addmore = true;
        int i = 0;
        InventoryItem[] items = new InventoryItem[20];
        while (addmore){

        items[i] = menu.getMenu();
        i++;
        pack1.add(items);
        System.out.println(pack1);
//        System.out.println("volume now is: " + pack1.getVolume());
//        System.out.println("Max volume is: " + pack1.getMaxVolume());
//        System.out.println("weight now is: " + pack1.getWeight());
//        System.out.println("Max weight is: " + pack1.getMaxWeight());

            System.out.println("Do you want to add more items in your pack? y/n");
           String choice = input.next();
            addmore = choice.equals("y");
        }
    }
}
