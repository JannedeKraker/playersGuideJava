package playersguide.day32;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InventoryItem[] items = new InventoryItem[]{new Food(), new Bow(), new Rope(), new Sword(),new Water()};
        Pack pack1 = new Pack(16,16,2);
        pack1.add(items);
        System.out.println("volume now is: " + pack1.getVolume());
        System.out.println("Max volume is: " + pack1.getMaxVolume());
        System.out.println("weight now is: " + pack1.getWeight());
        System.out.println("Max weight is: " + pack1.getMaxWeight());


    }
}
