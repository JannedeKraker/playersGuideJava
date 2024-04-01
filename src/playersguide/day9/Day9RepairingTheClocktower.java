package playersguide.day9;

import java.util.Scanner;



public class Day9RepairingTheClocktower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a whole number so that the clock can start ticking: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Tick");
        } else {
            System.out.println("Tock");
        }
    }
}
