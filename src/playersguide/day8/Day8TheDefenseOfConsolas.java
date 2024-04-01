package playersguide.day8;

import java.awt.*;
import java.util.Scanner;


public class Day8TheDefenseOfConsolas {
    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";

        int whichColumn;
        int whichRow;
        int columnSpaceOne;
        int rowSpaceOne;
        int columnSpaceTwo;
        int rowSpaceTwo;
        int columnSpaceThree;
        int rowSpaceThree;
        int columnSpaceFour;
        int rowSpaceFour;

        Scanner input = new Scanner(System.in);

        System.out.println("Which column is affected?");
        whichColumn = input.nextInt();

        System.out.println("Which row is affected?");
        whichRow = input.nextInt();

        columnSpaceOne = whichColumn;
        rowSpaceOne = whichRow - 1;

        columnSpaceTwo = whichColumn - 1;
        rowSpaceTwo = whichRow;

        columnSpaceThree = whichColumn;
        rowSpaceThree = whichRow + 1;

        columnSpaceFour = whichColumn + 1;
        rowSpaceFour = whichRow;
        System.out.println("Defense of Consolas");
        Toolkit.getDefaultToolkit().beep();
        System.out.println(ANSI_RED + "go to: " + columnSpaceOne + "," + rowSpaceOne + ANSI_RESET);
        System.out.println(ANSI_RED + "go to: " + columnSpaceTwo + "," + rowSpaceTwo + ANSI_RESET);
        System.out.println(ANSI_RED + "go to: " + columnSpaceThree + "," + rowSpaceThree + ANSI_RESET);
        System.out.println(ANSI_RED + "go to: " + columnSpaceFour + "," + rowSpaceFour + ANSI_RESET);
    }
}
