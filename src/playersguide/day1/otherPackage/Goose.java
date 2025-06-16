package playersguide.day1.otherPackage;

import playersguide.day1.otherPackage0.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() throws RuntimeException {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
//        throw new ArrayIndexOutOfBoundsException();
    }

    public void helpOtherGooseSwim() throws Exception {
        Goose other = new Goose();
        other.floatInWater(); // DOES NOT COMPILE
        System.out.println(other.text); // DOES NOT COMPILE
        throw new Exception("deze heb ik gegooid");
    }

    public void testExceptions() throws Exception {
        Goose other = new Goose();
        other.helpGooseSwim();
        try {
            other.helpOtherGooseSwim();
        } finally {
            System.out.println("Maar we gaan wel door met het programma");
        }
        System.out.println("en dit dan?");
    }

    public static void main(String[] args) throws Exception {
        Goose other1 = new Goose();
        other1.testExceptions();
    }
}