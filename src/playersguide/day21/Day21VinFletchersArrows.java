package playersguide.day21;

import java.util.Locale;
import java.util.Scanner;

//Vin Fletcher is a skilled arrow maker. He asks for your help building a new
//class to represent arrows and determine how much he should sell them for.“A
//tiny fragment of my soul goes into each arrow; I care not for the money; I just
//need to be able to recoup my costs and get food on the table,” he says. Each
//arrow has three parts: the arrowhead (steel, wood, or obsidian),the shaft (a
//length between 60 and 100 cm long), and the fletching (plastic, turkey feathers,
//or goose feathers). His costs are as follows: For arrowheads, steel costs 10 gold,
//wood costs 3 gold, and obsidian costs 5 gold. For fletching, plastic costs 10 gold,
//turkey feathers cost 5 gold, and goose feathers cost 3 gold. For the shaft, the
//price depends on the length: 0.05 gold per centimeter.
//Objectives:
//• Define a new Arrow class with fields for arrowhead type, fletching type,
//and length. (Hint: arrowhead types and fletching types might be good
//enumerations.)
//• Allow a user to pick the arrowhead, fletching type, and length and then
//create a new Arrow instance.
//• Add a getCost method that returns its cost as a float based on the numbers
//above, and use this to display the arrow’s cost. hier moet ik mee verder
public class Day21VinFletchersArrows {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        Arrow newArrow = new Arrow();

        System.out.println("How long do you want the shaft to be, it must be between 60 - 100 cm ");
        newArrow.setArrowLength(inputKeyboard.nextInt());

        System.out.println("What material should the tip of the arrow be made of? You can choose between: steel, wood and obsidian");
        newArrow.setArrowHeadType(ArrowHeadType.valueOf(inputKeyboard.next().toUpperCase(Locale.ROOT)));

        System.out.println("What type should the feather of the arrow made of? You can choose between: plastic, goose and turkey");
        newArrow.setFeatherType(FeatherType.valueOf(inputKeyboard.next().toUpperCase(Locale.ROOT)));

        getCost();
    }
}
