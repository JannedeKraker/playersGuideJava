package playersguide.day1.otherPackage0;

import playersguide.day1.otherPackage0.Bird;

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // calling protected member
        System.out.println(bird.text); // calling protected member
    }
}