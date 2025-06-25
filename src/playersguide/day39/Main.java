package playersguide.day39;

public class Main {


    public static void main(String[] args) {


        Grid grid = new Grid(Menu.getSize()); // hier bepaalt de speler de grootte van de grid
        Menu.showStartMenu(); // hier word een keer het start menu laten zien met alle commando's

        do {
            Choice choice = Menu.getAction(); // hier wordt gevraagt aan de speler welke actie hij wil uitvoeren
            Menu.show(grid.move(choice)); // hier wordt de actie uitgevoerd en laten zien wat je mee maakt als je die actie uitvoert
            grid.experienceRoom();// hier word laten zien wat je mee maakt in de andere kamer
        }
        while (!Rooms.finished); // als er iets gebeurd waardoor je dood gaat of het spel verlaat stopt de loop

    }
}
