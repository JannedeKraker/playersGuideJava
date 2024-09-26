package playersguide.day38;

public class Main {
    public static void main(String[] args) {


        ColoredItem<Bow> bow = new ColoredItem<>(new Bow(), "red");
        bow.display();

        ColoredItem<Sword> sword = new ColoredItem<>(new Sword(), "blue");
        sword.display();

        ColoredItem<Axe> axe = new ColoredItem<>(new Axe(), "green");
        axe.display();


    }
}
