package playersguide.day14;


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

        int[] fiveNumbers = new int[]{indexNul, indexOne, indexTwo, indexThree, indexFour};
        System.out.println("the original array is: " + Arrays.toString(fiveNumbers));

        int[] duplicate = new int[5];
        int i = 0;

        for (int number : fiveNumbers) {
            duplicate[i++] = number;
        }
        System.out.println("the duplicated one is: " + Arrays.toString(duplicate));
    }
}
