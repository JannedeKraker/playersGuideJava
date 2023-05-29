package playersguide.Day25;

public enum CardColor {

    RED ("\u001B[31m" + "red"),
    GREEN ("\u001B[32m" + "green"),
    BLUE ("\u001B[34m" + "blue"),
    YELLOW ("\u001B[33m" + "yellow");
    private final String color;


    CardColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
