package playersguide.day38;

public class ColoredItem<T> {
    T type;
    String color;

    public ColoredItem(T type, String color) {
        this.type = type;
        switch (color) {
            case "blue":
                this.color = "\u001B[34m";
                break;
            case "red":
                this.color = "\u001B[31m";
                break;
            case "green":
                this.color = "\u001B[32m";
                break;
            case "yellow":
                this.color = "\u001B[33m";
                break;
            default:
                this.color = "\u001B[0m";
                break;

        }
    }

    void display() {
        System.out.println(color + type.toString() + "\u001B[0m");
    }

    ;

}
