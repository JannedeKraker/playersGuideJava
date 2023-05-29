package playersguide.day7;

import java.util.Scanner;

/*
Create a program that allows users to enter how many provinces, duchies, and estates they have.
Add up the user’s total score, giving 1 point per estate, 3 per duchy, and 6 per province.
Display the point total to the user.
 */
public class Day7TheDominionOfKings {
    public static void main(String[] args) {
        int howManyProvinces;
        int howManyDuchies;
        int howManyEstates;

        Scanner input = new Scanner(System.in);

        System.out.println("How many Provinces have your kingdom? ");
        howManyProvinces = input.nextInt();

        System.out.println("How many Duchies have your kingdom? ");
        howManyDuchies = input.nextInt();

        System.out.println("How many Estates have your kingdom? ");
        howManyEstates = input.nextInt();

        int totalPointsProvinces = howManyProvinces * 6;
        int totalPointsDuchies = howManyProvinces * 3;
        int totalPointsEstates = howManyEstates;

        System.out.println("Your kingdom is " + (totalPointsProvinces + totalPointsDuchies + totalPointsEstates)
                + " points worth.");

    }
}
