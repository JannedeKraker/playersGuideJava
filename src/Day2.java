import java.util.Scanner;
public class Day2 {


        public static void main(String[] args) {

            System.out.println("Bread is ready");
            System.out.println("Who is the bread for?");

            Scanner inputIsland = new Scanner(System.in);
            String whoIsBreadFor = inputIsland.next();
            System.out.println( "bread is for " + whoIsBreadFor);


        }
    }


