package playersguide.day23;

//You arrive at the Catacombs of the Class, the place that will reveal the path to
//the Fountain of Objects. The Catacombs lie inside a mountain, with a wide stone
//entrance leading you into a series of three chambers. In the first chamber, you
//find five pedestals with the remnants of a class definition and specific instructions
//by each. Etched above a sealed doorway at the back of the room is the text,
//“Only the True Programmer who can remake the Five Prototypes can proceed.”
//Each pedestal appears to have instructions for crafting a class. These are the
//Five Prototypes that you must reassemble.
//The first pedestal asks you to create a Point class to store a point in two dimen-
//sions. Each point is represented by an x-coordinate (x), a side-to-side distance
//from a special central point called the origin, and a y-coordinate (y), an up-and-
//down distance away from the origin.
//Objectives:
//• Define a new Point class with fields and getter methods for x and y.
//• Add a constructor to create a point from a specific x- and y-coordinate.
//• Add a parameterless constructor to create a point at the origin (0, 0).
//• In your main method, create a point at (2, 3) and another at (-4, 0).
//Display these points on the console window in the format (x, y) to illustrate
//that the class works.
//• Answer this question: Are your x and y immutable? Why did you choose
//what you did?
//To study if you find this diﬀicult yet: - extra about constructors in Java -
//Handy to print a nice representation of a class: overriding the toString method
public class Day23ThePoint {
    public static void main(String[] args) {

        Point point = new Point(2, 3);
        Point anotherPoint = new Point(-4, 0);

        System.out.println(point);
        System.out.println(anotherPoint);


    }

    public static class Point {


        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point() {
            x = 0;
            y = 0;
        }
        public int getX() {
            return x;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }

        public int getY() {
            return y;
        }
    }
}

