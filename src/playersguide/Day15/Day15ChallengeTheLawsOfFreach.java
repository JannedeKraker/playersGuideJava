package playersguide.Day15;

//The town of Freach recently had an awful looping disaster. The lead investigator
//found that it was a faulty ++ operator in an old for loop, but the town council
//has chosen to ban all loops but the foreach loop. Yet Freach uses the code
//presented earlier in this level to compute the minimum and the average value
//in an int array. They have hired you to rework their existing for-based code to
//use foreach loops instead.
//Objectives:
//• Start with the code for computing an array’s minimum and average values
//(see below)
//int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
//int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
//for (int index = 0; index < array.length; index++)
//{
//if (array[index] < currentSmallest)
//currentSmallest = array[index];
//}
//System.out.println(currentSmallest);
//int total = 0;
//for (int index = 0; index < array.length; index++)
//total += array[index];
//double average = (double)total / array.length;
//System.out.println(average);
//• Modify the code to use foreach loops instead of for loops
public class Day15ChallengeTheLawsOfFreach {
    public static void main(String[] args) {

        int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };

int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.

for (int number : array) {
if (number < currentSmallest)
currentSmallest = number;
}

System.out.println("The smallest number is: " + currentSmallest);
int total = 0;

for (int number : array){
total += number;
}

double average = (double)total / array.length;
System.out.println("the average of all the numbers in the array is: " + average);

    }
}
