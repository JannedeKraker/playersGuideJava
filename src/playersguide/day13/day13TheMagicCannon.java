package playersguide.day13;


public class day13TheMagicCannon {
    public static void main(String[] args) {

        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";

        for (int numberOfShots = 1; numberOfShots <= 100; numberOfShots++) {
            System.out.print(numberOfShots);
            if (numberOfShots % 3 == 0 && numberOfShots % 5 == 0) {
                System.out.println(ANSI_BLUE + " electric fiery shot" + ANSI_RESET);
            } else if (numberOfShots % 3 == 0) {
                System.out.println(ANSI_RED + " fiery shot" + ANSI_RESET);
            } else if (numberOfShots % 5 == 0) {
                System.out.println(ANSI_YELLOW + " electric shot" + ANSI_RESET);
            } else {
                System.out.println(" normal shot");
            }
        }
    }
}
