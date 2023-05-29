package playersguide.Day25;

public enum CardColor {

    RED ("255-0-0"),
    GREEN ("0-204-0"),
    BLUE ("0-0-255"),
    YELLOW ("(255,255,0");
    private final String color;

    CardColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
