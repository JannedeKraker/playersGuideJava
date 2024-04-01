package playersguide.day6;


import playersguide.day16.Day16TakingANumber;


public class Day6TheFourSistersAndTheDuckbear {
    public static void main(String[] args) {


//        instead of this code I used a method from Day16

//        int howManyEggs;
//        Scanner input = new Scanner(System.in);
//        System.out.println("How many chocolate eggs are there today? ");
//        howManyEggs = input.nextInt();

        int howManyEggs = Day16TakingANumber.askForNumber("How many chocolate eggs are there today? ");
        int eachSisterGet = howManyEggs / 4;
        int duckBearget = howManyEggs % 4;
        System.out.println("Each sister get " + eachSisterGet + " eggs.");
        System.out.println("Pet DuckBear get " + duckBearget + " eggs.");
    }
}
