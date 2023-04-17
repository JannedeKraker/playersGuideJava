package playersguide.day13;

//Skorin, a member of Consolas’s wall guard,
// has constructed a magic cannon that draws power from two gems:
// a fire gem and an electric gem. Every third turn of a crank, the fire gem activates,
// and the cannon produces a fire blast.The electric gem activates every fifth turn of the crank,
// and the cannon makes an electric blast. When the two line up, it generates a potent combined blast.
// Skorin would like your help to produce a program that can warn the crew about
// which turns of the crank will produce the different blasts before they do it.
// A partial output of the desired program looks like this:
// 1: Normal
// 2: Normal
// 3: Fire
// 4: Normal
// 5: Electric
// 6: Fire
// 7: Normal
// Objectives:•Write a program that will loop through the values between 1 and 100 and
// display what kind of blast the crew should expect. (The % operator maybe of use.)
// •Change the color of the output based on the type of blast.
// (For example,red for Fire, yellow for Electric, and blue for Electric and Fire)
public class day13TheMagicCannon {
    public static void main(String[] args) {

        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";

        for (int numberOfShots = 1; numberOfShots <= 100; numberOfShots++ ){
            System.out.print(numberOfShots);
            if (numberOfShots % 3 == 0 && numberOfShots % 5 == 0 ){
                System.out.println(ANSI_BLUE + " electric fiery shot" + ANSI_RESET);
            }
            else if (numberOfShots % 3 == 0){
                System.out.println(ANSI_RED + " fiery shot" + ANSI_RESET);
            }
            else if (numberOfShots % 5 == 0){
                System.out.println(ANSI_YELLOW + " electric shot" + ANSI_RESET);
            }
            else{
                System.out.println(" normal shot");
            }
        }

    }
}
