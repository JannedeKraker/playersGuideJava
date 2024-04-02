package playersguide.day31;

public class TicTacToo {

    public static void main(String[] args) {
        String playerOnePawn = "X";
        String playerTwoPawn = "O";
        startGame();
        GameBoardTicTacToo newGame = new GameBoardTicTacToo();
        for (int i = 1; i <= 5; i++) {
            newGame.setPawnAtGameBoard(playerOnePawn);
            newGame.getGameBoardTicTacToo();
            if (i == 5) {
                System.out.println("The board is full.");
            } else {
                newGame.setPawnAtGameBoard(playerTwoPawn);
                newGame.getGameBoardTicTacToo();
            }
        }
    }

    private static void startGame() {
        System.out.println("Player X: ");
        Player playerOne = new Player();
        System.out.println("Player O: ");
        Player playerTwo = new Player();
        System.out.println("Hello " + playerOne.getName() + " and " + playerTwo.getName() + ". \nWelcome to the tic tac too Game!");
    }
}
