import java.util.Scanner;
public class Day3 {
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


