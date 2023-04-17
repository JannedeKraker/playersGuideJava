package playersguide.day10;

import java.util.Scanner;


//There are watchtowers in the region around Consolas
// that can alert you when an enemy is spotted.
// With some help from you, they can tell you which direction the enemy is from the watchtower.
// Objectives:
// Ask the user for an x value and a y value.
// These are coordinates of the enemy relative to the watchtower’s location.
// Positive x-values are east, positive y-values are north (as they would be on a normal graph)
// Using if statements and relational operators, display a message about what direction the enemy
// is coming from. For example, “The enemy is to the northwest!” or “The enemy is here!
public class Day10Watchtower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Where is the enemy? Can you give me the x value? ");
        int xValue = input.nextInt();
        System.out.println("Can you also give me the y value?");
        int yValue = input.nextInt();
        directionIndicator(xValue,yValue);


}
    static void directionIndicator(int xValue, int yValue){
        String yDirection = "";
        String xDirection = "";
        if (xValue > 0) {
            xDirection = "East";
        } else if (xValue < 0) {
            xDirection = "West";

        } else if (xValue == 0 && yValue == 0) {
            xDirection = "Run the enemy is here! waaaaah\nwaaaaaaaaaah";
        }

        if (yValue > 0) {
            yDirection = "North";
        } else if (yValue < 0) {
            yDirection = "South";
        } else if (xValue == 0 && yValue == 0) {
            yDirection = "O noh!! ";

        }
        System.out.println("the enemy is: ");
        System.out.println(yDirection + " " + xDirection);
    }
}
