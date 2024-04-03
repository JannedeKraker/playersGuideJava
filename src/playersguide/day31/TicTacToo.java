package playersguide.day31;

import java.util.Scanner;

public class TicTacToo {
    Player playerOne;
    Player playerTwo;
    static String playerOnePawn = "X";
    static String playerTwoPawn = "O";
    boolean play= true;
    public static void main(String[] args) {

        TicTacToo ticTacToo = new TicTacToo();
        ticTacToo.startGame();
        while(ticTacToo.play){
        GameBoardTicTacToo newGame = new GameBoardTicTacToo();
        for (int i = 1; i <= 5; i++) {
            if(newGame.isThereAWinner(ticTacToo)){;break;}
            newGame.setPawnAtGameBoard(playerOnePawn, newGame.getChoice(playerOnePawn));
            newGame.getGameBoardTicTacToo();
            if (i == 5) {
                System.out.println("The board is full.");
                ticTacToo.playerOne.setDraw(1);
                ticTacToo.playerTwo.setDraw(1);
            } else {
                if(newGame.isThereAWinner(ticTacToo)){break;}
                newGame.setPawnAtGameBoard(playerTwoPawn,newGame.getChoice(playerTwoPawn));
                newGame.getGameBoardTicTacToo();
            }
        }
            System.out.println("Do you want to play an other round? yes or no ");
            Scanner input = new Scanner(System.in);
            String yesOrNo = input.next();
            if (yesOrNo.equals("no")) ticTacToo.play = false;
        }
        System.out.println(ticTacToo.playerOne.getName() + " has won: " + ticTacToo.playerOne.getWin() + " time." );
        System.out.println(ticTacToo.playerTwo.getName() + " has won: " + ticTacToo.playerTwo.getWin() + " time." );

    }

    public void startGame() {
        System.out.println("Player X: ");
        this.playerOne = new Player(playerOnePawn);
        System.out.println("Player O: ");
        this.playerTwo = new Player(playerTwoPawn);
        System.out.println("Hello " + playerOne.getName() + " and " + playerTwo.getName() + ". \nWelcome to the tic tac too Game!");
    }

    public void whoIsTheWinner(String XorO){
        if("X".equals(XorO)){playerOne.setWin(1); playerTwo.setLose(1);}
        else { playerTwo.setWin(1); playerOne.setLose(1);}

    }
}
