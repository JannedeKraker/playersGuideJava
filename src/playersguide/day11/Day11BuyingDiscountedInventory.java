package playersguide.day11;

import java.util.Locale;
import java.util.Scanner;



public class Day11BuyingDiscountedInventory {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Hello, Welcome at my shop. What is your name?");
        String nameCustomer = inputKeyboard.nextLine();
        String nameCustomerToLowerCase = nameCustomer.toLowerCase(Locale.ROOT);
        menu();
        System.out.println("What do you want to buy? Typ the number of the product: ");
        int menuNumber = inputKeyboard.nextInt();
        saleOrNot(nameCustomerToLowerCase, menuNumber);
    }

    static void menu() {
        System.out.println("--------------------------");
        System.out.println("| for sale:              |");
        System.out.println("|------------------------|");
        System.out.println("| 1. Rope                |");
        System.out.println("| 2. Torches             |");
        System.out.println("| 3. Climbing Equipment  |");
        System.out.println("| 4. Clean Water         |");
        System.out.println("| 5. Machete             |");
        System.out.println("| 6. Canoe               |");
        System.out.println("| 7. Food Supplies       |");
        System.out.println("--------------------------");
    }

    //I used a switch statement. but it is better to use a switch expression.
    // I have to figure out how that works.
    static void howMuchCost(int menuNumber) {
        int rope = 10;
        int torches = 15;
        switch (menuNumber) {
            case 1:
                System.out.println("A rope cost" + rope + "gold");
                break;
            case 2:
                System.out.println("Torches cost" + torches + "gold");
                break;
            case 3:
                System.out.println("Climbing Equipment cost 25 gold");
                break;
            case 4:
                System.out.println("Clean Water cost 1 gold");
                break;
            case 5:
                System.out.println("Machete cost 20 gold");
                break;
            case 6:
                System.out.println("The canoe cost 200 gold");
                break;
            case 7:
                System.out.println("Food Supplies cost 1 gold");
                break;
        }
    }

    static void howMuchCostWithSale(int menuNumber) {
        double discount = 2;
        double rope = 10 / discount;
        double torches = 15 / discount;
        double climbingEquipment = 25 / discount;
        double water = 1 / discount;
        double machete = 20 / discount;
        double canoe = 200 / discount;
        double food = 1 / discount;
        switch (menuNumber) {
            case 1:
                System.out.println("A rope cost now " + rope + " gold");
                break;
            case 2:
                System.out.println("Torches cost now " + torches + " gold");
                break;
            case 3:
                System.out.println("Climbing Equipment cost now " + climbingEquipment + " gold");
                break;
            case 4:
                System.out.println("Clean Water cost now " + water + " gold");
                break;
            case 5:
                System.out.println("Machete cost now " + machete + " gold");
                break;
            case 6:
                System.out.println("The canoe cost now" + canoe + " gold");
                break;
            case 7:
                System.out.println("Food Supplies cost now " + food + " gold");
                break;
        }
    }

    static void saleOrNot(String nameCustomer, int menuNumber) {
        String nameCustomerSale = "janne de kraker";

        if (nameCustomerSale.equals(nameCustomer)) {
            System.out.println("You have 50% discount!");
            howMuchCostWithSale(menuNumber);

        } else howMuchCost(menuNumber);

    }
}

