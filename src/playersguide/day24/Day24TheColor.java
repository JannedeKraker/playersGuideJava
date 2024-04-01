package playersguide.day24;


public class Day24TheColor {
    public static void main(String[] args) {
        Color pink = new Color(255, 192, 203);
        Color red = Color.red;
        System.out.println("rgb red: " + red);
        System.out.println("rgb pink: " + pink);

    }

    public static class Color {
        int redValue = 255;
        int greenValue = 128;
        int blueValue = 255;

        final static Color white = new Color(255, 255, 255);
        final static Color black = new Color(0, 0, 0);
        final static Color red = new Color(255, 0, 0);
        final static Color orange = new Color(255, 165, 0);
        final static Color yellow = new Color(255, 255, 0);
        final static Color green = new Color(0, 128, 0);
        final static Color blue = new Color(0, 0, 255);
        final static Color purple = new Color(128, 0, 128);

        public Color(int redValue, int greenValue, int blueValue) {
            this.redValue = redValue;
            this.greenValue = greenValue;
            this.blueValue = blueValue;
        }
        @Override
        public String toString() {
            return "(" + redValue + "," + greenValue + "," + blueValue + ")";
        }
    }
}

