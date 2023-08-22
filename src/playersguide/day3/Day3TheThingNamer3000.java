//Day 3 Challenge: The Thing Namer 3000 100 XP
//        As you walk through the city of Commenton, admiring its forward-slash-based
//        architectural buildings, a young man approaches you in a panic. “I dropped my
//        Thing Namer 3000 and broke it. I think it’s mostly working, but all my variable
//        names got reset! I don’t understand what they do!” He shows you the following
//        program:
//        System.out.println("What kind of thing are we talking about?");
//        Scanner input = new Scanner(System.in);
//        String a = input.next();
//        System.out.println("How would you describe it? Big? Azure? Tattered?");
//        String b = input.next();
//        String c = "of Doom";
//        String d = "3000";
//        System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");
//        “You gotta help me figure it out!”
//        Objectives:
//        • Rebuild the program above on your computer.
//        • Add comments near each of the four variables that describe what they
//        store. You must use at least one of each comment type (// and /* */).
//        • Find the bug in the text displayed and fix it.
//        • Answer this question: Aside from comments, what else could you do to
//        make this code more understandable?
//        To study if you find this difficult yet: - W3 schools Java Comments

package playersguide.day3;
import java.util.Scanner;

public class Day3TheThingNamer3000 {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);

        // explanation of thing where we talked about
        String a = input.next();
        System.out.println("How would you describe it? Big? Azure? Tattered?");

        // description of thing
        String b = input.next();
        // descprition of the event
        String c = "Doom";
        // version number
        String d = "3000";
        System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");

    }
}


