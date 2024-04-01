package playersguide.day15;


public class Day15ChallengeTheLawsOfFreach {
    public static void main(String[] args) {

        int[] array = {4, 51, -7, 13, -99, 15, -8, 45, 90};

        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.

        for (int number : array) {
            if (number < currentSmallest)
                currentSmallest = number;
        }

        System.out.println("The smallest number is: " + currentSmallest);
        int total = 0;

        for (int number : array) {
            total += number;
        }

        double average = (double) total / array.length;
        System.out.println("the average of all the numbers in the array is: " + average);
    }
}
