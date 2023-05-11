package playersguide.day21en22;

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
//above, and use this to display the arrow’s cost.

//Day 21 Challenge 2/2: Vin’s Trouble 50 XP
//“Master Programmer!” Vin Fletcher shouts at you as he races to catch up to
//you. “I have a problem. I created an arrow for a young man who took it and
//changed its length to be half as long as I had designed. It no longer fit in his bow
//correctly and misfired. It sliced his hand pretty bad. He’ll survive, but is there
//any way we can make sure somebody doesn’t change an arrow’s length when
//they walk away from my shop? I don’t want to be the cause of such self-inflicted
//pain.”With your knowledge of information hiding, you know you can help.
//16
//Objectives:
//• Modify your Arrow class to have private instead of public fields.
//• Add in getter methods for each of the fields that you have.
//
// Day 22 Challenge: Arrow Factories 100 XP
//Vin Fletcher sometimes makes custom-ordered arrows, but these are rare. Most
//of the time, he sells one of the following standard arrows: - The Elite Arrow,
//made from a steel arrowhead, plastic fletching, and a 95 cm shaft. - The Beginner
//Arrow, made from a wood arrowhead, goose feathers, and a 75 cm shaft. - The
//Marksman Arrow, made from a steel arrowhead, goose feathers, and a 65 cm
//shaft. You can make static methods to make these specific variations of arrows
//easy.
//Objectives:
//• Modify your Arrow class one final time to include static methods of the
//form public static Arrow createEliteArrow() { ... } for each of the three
//above arrow types.
//• <HIER BEN IK GEBLEVEN> Modify the program to allow users to choose one of these pre-defined types
//or a custom arrow. If they select one of the predefined styles, produce an
//Arrow instance using one of the new static methods. If they select one
//of the predefined styles, produce an Arrow instance using one of the new
//static methods. If they choose to make a custom arrow, use your earlier
//code to get their custom data about the desired arrow
public class Day21VinFletchersArrows {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        Arrow newArrow = new Arrow();
        Arrow eliteArrow= new Arrow();

        System.out.println("How long do you want the shaft to be, it must be between 60 - 100 cm ");
        newArrow.setArrowLength(inputKeyboard.nextInt());

        System.out.println("What material should the tip of the arrow be made of? You can choose between: steel, wood and obsidian");
        newArrow.setArrowHeadType(ArrowHeadType.valueOf(inputKeyboard.next().toUpperCase(Locale.ROOT)));

        System.out.println("What type should the feather of the arrow made of? You can choose between: plastic, goose and turkey");
        newArrow.setFeatherType(FeatherType.valueOf(inputKeyboard.next().toUpperCase(Locale.ROOT)));

        System.out.println("the costs of the arrow are: " + newArrow.getCost(newArrow) + " gold");

        System.out.println("the elite arrow");
        eliteArrow.createEliteArrow();
        System.out.println("He cost " + eliteArrow.getCost(eliteArrow) + " gold." );

    }


}
