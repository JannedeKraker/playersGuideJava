package playersguide.day6;


import playersguide.day16.Day16TakingANumber;

/*
Create a program that lets the user enter the number of chocolate eggs gathered that day.
Using / and %, compute how many eggs each sister should get and how many are left over for the duckbear.
Answer this question: What are three total egg counts where the duckbear gets more than each sister does?
You can use the program you created to help you find the answer. answer: 1, 2 amd 3 eggs.
4 sisters
 */
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
