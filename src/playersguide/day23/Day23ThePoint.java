package playersguide.day23;


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

