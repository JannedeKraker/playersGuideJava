package playersguide.day31;

public class TicTacToo {

    public static void main(String[] args) {
        startGame();
        GameBoardTicTacToo newGame = new GameBoardTicTacToo();
        newGame.setXAtGameBoard();
        newGame.getGameBoardTicTacToo();

    }

    private static void startGame() {
        System.out.println("Player X: ");
        Player playerOne = new Player();
        System.out.println("Player O: ");
        Player playerTwo = new Player();
        System.out.println("Hello " + playerOne.getName() + " and " + playerTwo.getName() + ". \nWelcome to the tic tac too Game!");
    }
}
