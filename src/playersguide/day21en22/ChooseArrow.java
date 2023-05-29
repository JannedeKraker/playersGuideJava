package playersguide.day21en22;

import java.util.Scanner;

public class ChooseArrow {
    public static void main(String[] args) {
        Arrow beginnerArrow = new Arrow();
        Arrow marksmanArrow = new Arrow();
        Arrow eliteArrow = new Arrow();
        Arrow customMadeArrow = new Arrow();
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("What kind of arrow do you want to buy. you can choose from four options:\n" +
                " [1]-The Beginner arrow (wooden tip, shaft length is 75 cm and feathers from a goose)\n" +
                " [2]-The Marksman arrow (tip of steel, shaft length is 65 cm and feathers from a goose)\n" +
                " [3]-The Elite arrow (tip of steel, shaft length is 95 cm and feathers from plastic) \n" +
                " [4]-The custom made arrow\n");

        int menuChoice = inputKeyboard.nextInt();

        switch (menuChoice) {
            case 1:
                beginnerArrow.createBeginnerArrow();
                break;
            case 2:
                marksmanArrow.createMarksmanArrow();
                break;
            case 3:
                eliteArrow.createEliteArrow();
                break;
            case 4:
                customMadeArrow.customMadeArrow();
                break;
            default:
                System.out.println("what you typed does not exist, please try again.");
                menuChoice = inputKeyboard.nextInt();
        }
    }
}

