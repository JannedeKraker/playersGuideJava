package playersguide.day32;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pack pack1 = new Pack(12,12,6);
        Menu menu = new Menu();
        InventoryItem[] items = new InventoryItem[]{menu.getMenu(), menu.getMenu(), menu.getMenu(), menu.getMenu(),menu.getMenu(), menu.getMenu()};

        pack1.add(items);
        System.out.println(pack1.toString());
        System.out.println("volume now is: " + pack1.getVolume());
        System.out.println("Max volume is: " + pack1.getMaxVolume());
        System.out.println("weight now is: " + pack1.getWeight());
        System.out.println("Max weight is: " + pack1.getMaxWeight());


    }
}
