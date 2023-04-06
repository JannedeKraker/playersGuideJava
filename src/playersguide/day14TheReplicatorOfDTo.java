package playersguide;// While searching an abandoned storage building containing strange code artifacts,
// you uncover the ancient Replicator of D’To.
// This can replicate the contents of any int array into another array.
// But it appears broken and needs a Programmer to reforge the magic
// that allows it to replicate once again.
//
//Objectives:
// •Make a program that creates an array of length 5.
// •Ask the user for five numbers and put them in the array.
// •Make a second array of length 5.
// •Use a loop to copy the values out of the original array and into the new one.
// •Display the contents of both arrays one at a time to illustrate that the
// Replicator of D’To works again.
import java.util.Arrays;
import java.util.Scanner;
public class day14TheReplicatorOfDTo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Can you give me 5 numbers?");

        int indexNul = keyboard.nextInt();
        int indexOne = keyboard.nextInt();
        int indexTwo = keyboard.nextInt();
        int indexThree = keyboard.nextInt();
        int indexFour = keyboard.nextInt();

        int [] fiveNumbers = new int[]{indexNul, indexOne, indexTwo, indexThree, indexFour};
        System.out.println("the original array is: " + Arrays.toString(fiveNumbers));

        int [] duplicate = new int[5];
        int i = 0;

        for (int number : fiveNumbers){
           duplicate[i++] = number;
       }

        System.out.println("the duplicated one is: "  + Arrays.toString(duplicate));


    }
}
