package playersguide.day17;


public class Day17ChallengeCountdown {
    public static void main(String[] args) {

        countingToNull(10);
    }

    static void countingToNull(int x) {
        System.out.println(x);
        if (x > 0) {
            x -= 1;
            countingToNull(x);
        }
    }
}

