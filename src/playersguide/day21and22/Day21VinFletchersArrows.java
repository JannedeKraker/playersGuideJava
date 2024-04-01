package playersguide.day21and22;

import java.util.Locale;
import java.util.Scanner;


public class Day21VinFletchersArrows {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        Arrow newArrow = new Arrow();
        Arrow eliteArrow = new Arrow();

        System.out.println("How long do you want the shaft to be, it must be between 60 - 100 cm ");
        newArrow.setArrowLength(inputKeyboard.nextInt());

        System.out.println("What material should the tip of the arrow be made of? You can choose between: steel, wood and obsidian");
        newArrow.setArrowHeadType(ArrowHeadType.valueOf(inputKeyboard.next().toUpperCase(Locale.ROOT)));

        System.out.println("What type should the feather of the arrow made of? You can choose between: plastic, goose and turkey");
        newArrow.setFeatherType(FeatherType.valueOf(inputKeyboard.next().toUpperCase(Locale.ROOT)));

        System.out.println("the costs of the arrow are: " + newArrow.getCost(newArrow) + " gold");

        System.out.println("the elite arrow");
        eliteArrow.createEliteArrow();
        System.out.println("He cost " + eliteArrow.getCost(eliteArrow) + " gold.");
    }
}
