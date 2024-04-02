package playersguide.day31;

import java.util.Scanner;

public class Player {
    private String name;
    private int win;
    private int lose;
    private int draw;
    Scanner input = new Scanner(System.in);

    public Player() {
        System.out.println("Hello, what's your name? ");
        String playerName = input.nextLine();
        this.name = playerName;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}
