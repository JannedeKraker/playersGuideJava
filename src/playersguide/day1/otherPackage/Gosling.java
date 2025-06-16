package playersguide.day1.otherPackage;

import playersguide.day1.otherPackage0.Bird; // in a different package

public class Gosling extends Bird { // extends means create subclass
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }
}