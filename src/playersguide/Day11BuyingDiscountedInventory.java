package playersguide;

import java.util.Locale;
import java.util.Scanner;

//It is time to resupply.
//A nearby outfitter shop has the supplies you need but is so disorganized that they cannot sell
// things to you. “Can’t sell if I can’t find the price list,” Tortuga, the owner,
// tells you as he turns over and attempts to go back to sleep in his reclining chair in the corner.
// There’s a simple solution: use your programming powers to build something to report the prices of
// various pieces of equipment, based on the user’s selection: The following items are available:
//
//        Rope
//        Torches
//        Climbing Equipment
//        Clean Water
//        Machete
//        Canoe
//        Food Supplies
//What number do you want to see the price of?
// 2 Torches cost 15 gold.
// You search around the shop and find ledgers that show the following prices for these items:
// Rope: 10 gold, Torches: 15 gold, Climbing Equipment: 25 gold, Clean Water: 1 gold,
// Machete: 20 gold, Canoe: 200 gold, Food Supplies: 1 gold.
//
//Objectives:
//
// Build a program that will show the menu illustrated above.
// Ask the user to enter a number from the menu.
// Using the information above, use a switch (either type) to show the item’s cost.
//
// After sorting through Tortuga’s outfitter shop and making it viable again,
// Tortuga realizes you’ve put him back in business. He wants to repay the favor
// by giving you a 50% discount on anything you buy from him,
// and he wants you to modify your program to reflect that. After asking the user
// for a number, the program should also ask for their name.
// If the name supplied is your name, cut the price in half before reporting it to the user.
//
//Objectives:
//
//Modify your program from before to also ask the user for their name.
//If their name equals your name, divide the cost in half.

public class Day11BuyingDiscountedInventory {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Hello, Welcome at my shop. What is your name?");
        String nameCustomer = inputKeyboard.nextLine();
        String nameCustomerToLowerCase = nameCustomer.toLowerCase(Locale.ROOT);
        menu();
        System.out.println("What do you want to buy? Typ the number of the product: ");
        int menuNumber = inputKeyboard.nextInt();
        saleOrNot(nameCustomerToLowerCase,menuNumber);
    }
    static void menu(){
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
            double rope = 10/ discount;
            double torches = 15/ discount;
            double climbingEquipment = 25 / discount;
            double water = 1 / discount;
            double machete = 20/ discount;
            double canoe = 200/ discount;
            double food = 1 / discount;
            switch (menuNumber) {
                case 1:
                    System.out.println("A rope cost now "+ rope +" gold");
                    break;
                case 2:
                    System.out.println("Torches cost now " + torches + " gold");
                    break;
                case 3:
                    System.out.println("Climbing Equipment cost now "+ climbingEquipment +" gold");
                    break;
                case 4:
                    System.out.println("Clean Water cost now "+ water + " gold");
                    break;
                case 5:
                    System.out.println("Machete cost now " + machete + " gold");
                    break;
                case 6:
                    System.out.println("The canoe cost now" + canoe +  " gold");
                    break;
                case 7:
                    System.out.println("Food Supplies cost now " + food + " gold");
                    break;
            }
    }
    static void saleOrNot(String nameCustomer, int menuNumber){
            String nameCustomerSale = "janne de kraker";

            if (nameCustomerSale.equals(nameCustomer)){
                System.out.println("You have 50% discount!");
                howMuchCostWithSale(menuNumber);

            }
            else howMuchCost(menuNumber);

        }
}

