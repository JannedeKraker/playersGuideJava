package playersguide.day31;

public class TicTacToo {
    static String playerOnePawn = "X";
    static String playerTwoPawn = "O";
    public static void main(String[] args) {

        startGame();
        GameBoardTicTacToo newGame = new GameBoardTicTacToo();
        for (int i = 1; i <= 5; i++) {
            if(newGame.isThereAWinner()){break;}
            newGame.setPawnAtGameBoard(playerOnePawn, newGame.getChoice(playerOnePawn));
            newGame.getGameBoardTicTacToo();
            if (i == 5) {
                System.out.println("The board is full.");
            } else {
                if(newGame.isThereAWinner()){break;}
                newGame.setPawnAtGameBoard(playerTwoPawn,newGame.getChoice(playerTwoPawn));
                newGame.getGameBoardTicTacToo();
            }
        }

    }

    private static void startGame() {
        System.out.println("Player X: ");
        Player playerOne = new Player(playerOnePawn);
        System.out.println("Player O: ");
        Player playerTwo = new Player(playerTwoPawn);
        System.out.println("Hello " + playerOne.getName() + " and " + playerTwo.getName() + ". \nWelcome to the tic tac too Game!");
    }
}
