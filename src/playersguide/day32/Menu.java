package playersguide.day32;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static InventoryItem getItemFromUser() {
        showMenuItems();
        int choice = input.nextInt();
        return switch (choice) {
            case 1 -> new Arrow();
            case 2 -> new Bow();
            case 3 -> new Rope();
            case 4 -> new Water();
            case 5 -> new Food();
            case 6 -> new Sword();
            default -> null;
        };

    }
    public static boolean getYesOrNoFromUser(){
        System.out.println("Do you want to add more items in your pack? y/n");
        String choice = input.next();
        return choice.equals("y");
    }

    private static void showMenuItems() {
        System.out.println("What do you want to add to your package? ");
        System.out.println("1. An arrow || weight: 0.1 kg || volume: 0.05 l");
        System.out.println("2. A bow    || weight: 1.0 kg || volume: 4.0 l");
        System.out.println("3. A rope   || weight: 1.0 kg || volume: 1.5 l");
        System.out.println("4. Water    || weight: 2.0 kg || volume: 3.0 l");
        System.out.println("5. Food     || weight: 1.0 kg || volume: 0.5 l");
        System.out.println("6. A Sword  || weight: 5.0 kg || volume: 3.0 l");
    }


}
