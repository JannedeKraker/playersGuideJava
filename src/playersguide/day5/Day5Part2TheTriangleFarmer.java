package playersguide.day5;

import java.util.Scanner;

/*
Write a program that lets you input the triangle’s base size and height.
Compute the area of a triangle by turning the above equation into code.
Write the result of the computation.

Area = base x height / 2
*/
public class Day5Part2TheTriangleFarmer {
    public static void main(String[] args) {
        double baseSize;
        double heightSize;

        Scanner input = new Scanner(System.in);

        System.out.println("what is the base of the triangle? ");
        baseSize = input.nextDouble();

        System.out.println("what is the height of the triangle? ");
        heightSize = input.nextDouble();

        double areaSize = baseSize * heightSize / 2;
        System.out.println("The Area size of the triangle is: " + areaSize);
    }
}
