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
public class Day11 {
    public static void main(String[] args) {
        menu();
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("What do you want to buy? Typ the number of the product: ");
        int menuNumber = inputKeyboard.nextInt();
        howMuchCost(menuNumber);

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
        switch (menuNumber) {
            case 1:
                System.out.println("A rope cost 10 gold");
                break;
            case 2:
                System.out.println("Torches cost 15 gold");
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
}

