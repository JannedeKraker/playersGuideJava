package playersguide.day24;

//The second pedestal asks you to create a Color class to represent a color. The
//pedestal includes an etching of this diagram that illustrates its potential usage:
//The color consists of three parts or channels: red, green, and blue, which indicate
//how much those channels are lit up. Each channel can be from 0 to 255. 0 means
//completely off; 255 means completely on. The pedestal also includes some color
//names, with a set of numbers indicating their specific values for each channel.
//These are commonly used colors: White (255, 255, 255), Black (0, 0, 0), Red
//(255, 0, 0), Orange (255,165, 0), Yellow (255, 255, 0), Green (0, 128, 0), Blue
//(0, 0, 255), Purple (128, 0, 128).
//Objectives:
//• Define a new Color class with fields for its red, green, and blue channels.
//• Add appropriate constructors that you feel make sense for creating new
//Color objects.
//• Create final static fields to define the eight commonly used colors for easy
//access.
//• In your main method, make two Color-typed variables. Use a constructor
//to create a color instance and use a static field for the other. Display each
//of their red, green, and blue channel values.
//To study if you find this difficult yet: - static final fields are the generally
//only fields that you can and want to make public. A bit about those fields on
//GeeksForGeeks
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

