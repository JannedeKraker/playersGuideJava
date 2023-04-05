//Hint: try read a bit about ‘recursion’
//        The Council of Freach has summoned you. New writing has appeared on the
//        Tomb of Algol the Wise, the last True Programmer to wander this land. The
//        writing strikes fear and awe into the hearts of the looploving people of Freach:
//        “The next True Programmer shall be able to write any looping code with a
//        method call instead.” The Senior Counselor, scared of a world without loops,
//        asks you to put your skill to the test and rewrite the following code, which
//        counts down from 10 to 1, with no loops:
//        for (int x = 10; x > 0; x--)
//        System.out.println(x);
public class Day17ChallengeCountdown {
    public static void main(String[] args) {

        countingToNull(10);
    }
  static void countingToNull(int x){
      System.out.println(x);
      if (x > 0){
      x-=1;
      countingToNull(x);}

 }

}

