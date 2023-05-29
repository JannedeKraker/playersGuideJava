package playersguide.day8;

import java.awt.*;
import java.util.Scanner;

/*
The Uncoded One has begun an assault on the city of Consolas;
the situation is dire. From a moving airship called the Manticore,
massive fireballs capable of destroying city blocks are being catapulted into the city.
The city is arranged in blocks, numberedlike a chessboard.
The city’s only defense is a movable magical barrier,
operated by a squad of four that can protect a single cityblock by
putting themselves in each of the target’s four adjacent blocks,
as shown in the picture to the right. For example,
toprotect the city block at (Row 6, Column 5),
the crew deploys themselves to (Row 6, Column 4),
(Row 5, Column 5), (Row 6,Column 6), and (Row7, Column 5).
The good news is that if we can compute the deployment locations fast enough,
the crew canbe deployed around the target in time to prevent catastrophic damage
to the city for as long as the siege lasts.
The City ofConsolas needs a program to tell the squad where to deploy,
given the anticipated target. Something like this:

Ask the user for the target row and column.
Compute the neighboring rows and columns of where to deploy the squad.
Display the deployment instructions in a different color of your choosing.
Change the window title to be “Defense of Consolas”.
Play a sound with Toolkit.getDefaultToolkit().beep(); when the results have been computed and displayed.
 */
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
