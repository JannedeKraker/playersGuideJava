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
    StringBuilder fieldLineThree =new StringBuilder( "     7 | 8 | 9 \n");
    StringBuilder middleLine = new StringBuilder("---+---+---");
    StringBuilder middleLineSecond =new StringBuilder("    ---+---+---\n");


    public GameBoardTicTacToo() {
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

    public void setXAtGameBoard() {
        System.out.println("Where do you place your X ?");
        int choice = input.nextInt();
        switch (choice) {
            case 1: fieldLine1.replace(1,2,"X");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                break;
        }


    }

    public void setOAtGameBoard() {

    }
}
