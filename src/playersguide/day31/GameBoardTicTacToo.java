package playersguide.day31;

import java.util.ArrayList;
import java.util.Scanner;

public class GameBoardTicTacToo {
    static Scanner input = new Scanner(System.in);
    StringBuilder fieldLine1 = new StringBuilder("   |   |   ");
    StringBuilder fieldLine2 = new StringBuilder("   |   |   ");
    StringBuilder fieldLine3 = new StringBuilder("   |   |   ");
    StringBuilder fieldLineOne = new StringBuilder("     1 | 2 | 3 \n");
    StringBuilder fieldLineTwo = new StringBuilder("     4 | 5 | 6 \n");
    StringBuilder fieldLineThree = new StringBuilder("     7 | 8 | 9 \n");
    StringBuilder middleLine = new StringBuilder("---+---+---");
    StringBuilder middleLineSecond = new StringBuilder("    ---+---+---\n");


    public GameBoardTicTacToo() {
        getGameBoardTicTacToo();
    }

    public void getGameBoardTicTacToo() {
        ArrayList<StringBuilder> gameBoard = new ArrayList<>();
        gameBoard.add(0, fieldLine1);
        gameBoard.add(1, fieldLineOne);
        gameBoard.add(2, middleLine);
        gameBoard.add(3, middleLineSecond);
        gameBoard.add(4, fieldLine2);
        gameBoard.add(5, fieldLineTwo);
        gameBoard.add(6, middleLine);
        gameBoard.add(7, middleLineSecond);
        gameBoard.add(8, fieldLine3);
        gameBoard.add(9, fieldLineThree);


        for (StringBuilder line : gameBoard) {
            System.out.print(line);

        }

    }

    public void setPawnAtGameBoard(String pawn, int choice) {
        String fieldIsNotEmpty = "You can not choose this field, because it is not empty. Try again.";
        switch (choice) {

            case 1:
                if (isTheFieldEmpty(choice))
                    fieldLine1.replace(1, 2, pawn);
                else {
                    System.out.println(fieldIsNotEmpty);
                    setPawnAtGameBoard(pawn, choice);
                }
                break;
            case 2:
                if (isTheFieldEmpty(choice))
                    fieldLine1.replace(5, 6, pawn);
                else {
                    System.out.println(fieldIsNotEmpty);
                    setPawnAtGameBoard(pawn, choice);
                }
                break;
            case 3:
                if (isTheFieldEmpty(choice))
                    fieldLine1.replace(9, 10, pawn);
                else {
                    System.out.println(fieldIsNotEmpty);
                    setPawnAtGameBoard(pawn, choice);
                }
                break;
            case 4:
                if (isTheFieldEmpty(choice))
                    fieldLine2.replace(1, 2, pawn);
                else {
                    System.out.println(fieldIsNotEmpty);
                    setPawnAtGameBoard(pawn, choice);
                }
                break;
            case 5:
                if (isTheFieldEmpty(choice))
                    fieldLine2.replace(5, 6, pawn);
                else {
                    System.out.println(fieldIsNotEmpty);
                    setPawnAtGameBoard(pawn, choice);
                }
                break;
            case 6:
                if (isTheFieldEmpty(choice))
                    fieldLine2.replace(9, 10, pawn);
                else {
                    System.out.println(fieldIsNotEmpty);
                    setPawnAtGameBoard(pawn, choice);
                }
                break;
            case 7:
                if (isTheFieldEmpty(choice))
                    fieldLine3.replace(1, 2, pawn);
                else {
                    System.out.println(fieldIsNotEmpty);
                    setPawnAtGameBoard(pawn, choice);
                }
                break;
            case 8:
                if (isTheFieldEmpty(choice))
                    fieldLine3.replace(5, 6, pawn);
                else {
                    System.out.println(fieldIsNotEmpty);
                    setPawnAtGameBoard(pawn, choice);
                }
                break;
            case 9:
                if (isTheFieldEmpty(choice))
                    fieldLine3.replace(9, 10, pawn);
                else {
                    System.out.println(fieldIsNotEmpty);
                    setPawnAtGameBoard(pawn, choice);
                }
                break;
            default:
                System.out.println("I don't understand the input, try again");
                setPawnAtGameBoard(pawn, choice);
                break;
        }


    }

    public int getChoice(String pawn) {
        System.out.println("Where do you place your " + pawn + "?");
        int choice = input.nextInt();
        return choice;
    }

    public boolean isTheFieldEmpty(int choice) {
        char empty = ' ';
        char field;
        switch (choice) {
            case 1:
                field = fieldLine1.charAt(1);
                return field == empty;
            case 2:
                field = fieldLine1.charAt(5);
                return field == empty;
            case 3:
                field = fieldLine1.charAt(9);
                return field == empty;
            case 4:
                field = fieldLine2.charAt(1);
                return field == empty;
            case 5:
                field = fieldLine2.charAt(5);
                return field == empty;
            case 6:
                field = fieldLine2.charAt(9);
                return field == empty;
            case 7:
                field = fieldLine3.charAt(1);
                return field == empty;
            case 8:
                field = fieldLine3.charAt(5);
                return field == empty;
            case 9:
                field = fieldLine3.charAt(9);
                return field == empty;
            default:
                return false;
        }
    }

    public boolean isThereAWinner() {
        StringBuilder lineXWinner = new StringBuilder(" X | X | X ");
        StringBuilder lineOWinner = new StringBuilder(" O | O | O ");

        StringBuilder firstLineVertical = new StringBuilder();
            firstLineVertical.append(fieldLine1.substring(0, 4))
                             .append(fieldLine2.substring(0, 4))
                             .append(fieldLine3.substring(0, 3));

        StringBuilder secondLineVertical = new StringBuilder();
            secondLineVertical.append(fieldLine1.substring(4, 9))
                              .append(fieldLine2.substring(5, 9))
                              .append(fieldLine3.substring(5, 7));

        StringBuilder thirdLineVertical = new StringBuilder();
            thirdLineVertical.append(fieldLine1.substring(8, 11))
                             .append(fieldLine2.substring(7, 11))
                             .append(fieldLine3.substring(7, 11));

        StringBuilder firstSlentingLine = new StringBuilder();
            firstSlentingLine.append(fieldLine1.substring(0, 4))
                             .append(fieldLine2.substring(4, 8))
                             .append(fieldLine3.substring(8, 11));

        StringBuilder secondSlentingLine = new StringBuilder();
            secondSlentingLine.append(fieldLine1.substring(8, 11))
                              .append(fieldLine2.substring(3, 8))
                              .append(fieldLine3.substring(0, 3));

        boolean winnerX = compare(fieldLine1, lineXWinner) | compare(fieldLine2, lineXWinner) | compare(fieldLine3, lineXWinner);
        boolean winnerO = compare(fieldLine1, lineOWinner) | compare(fieldLine2, lineOWinner) | compare(fieldLine3, lineOWinner);
        boolean winnerXVertical = compare(lineXWinner, firstLineVertical) | compare(lineXWinner, secondLineVertical) | compare(lineXWinner, thirdLineVertical);
        boolean winnerOVertical = compare(lineOWinner, firstLineVertical) | compare(lineOWinner, secondLineVertical) | compare(lineOWinner, thirdLineVertical);
        boolean winnerXSlenting = compare(lineXWinner, firstSlentingLine) | compare(lineXWinner, secondSlentingLine);
        boolean winnerOSlenting = compare(lineOWinner, firstSlentingLine) | compare(lineOWinner, secondSlentingLine);

        if (winnerX || winnerO) {
            System.out.println(winnerX ? "Player X has won!" : "Player O has won!");
        }
        if (winnerXVertical || winnerOVertical) {
            System.out.println(winnerXVertical ? "Player X has won!" : "Player O has won!");
        }
        if (winnerXSlenting || winnerOSlenting) {
            System.out.println(winnerXSlenting ? "Player X has won!" : "Player O has won!");
        }
        return winnerX || winnerO || winnerXVertical || winnerOVertical || winnerXSlenting || winnerOSlenting;

    }

    boolean compare(StringBuilder one, StringBuilder two) {
        if (one.length() != two.length()) {
            return false;
        }
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) != two.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
