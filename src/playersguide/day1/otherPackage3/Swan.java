package playersguide.day1.otherPackage3;

import playersguide.day1.otherPackage0.Bird; // in different package than Bird

public class Swan extends Bird { // but subclass of bird
    public void swim() {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text);// package access to superclass
    }

//    public void helpOtherBirdSwim() {
//        Bird other = new Bird();// je mag wel een Bird object maken want die class is public
//        other.floatInWater();   // DOES NOT COMPILE, maar met die bird object mag je niet vanuit hier
//                                // iets protected aanroepen omdat het niet in dezelfde package zit en
//                                // het extends ook niet de Bird class, dus het is ook geen subclass van Bird.
//        System.out.println(other.text); // DOES NOT COMPILE
//    }
}