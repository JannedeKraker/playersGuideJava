package playersguide.day20;

import java.util.Locale;
import java.util.Scanner;

public class ComposedSoup {
    static void ComposedSoup() {

        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Chose what kind of recipe you want, you can chose out: soup, stew and gumbo");
        TypeRecipe typeRecipe = TypeRecipe.valueOf(inputKeyboard.nextLine().toUpperCase(Locale.ROOT));
        System.out.println("Chose what kind of main ingredient you want, you can chose out:  potato, mushroom,carrot and chicken");
        MainIngredient mainIngredient = MainIngredient.valueOf(inputKeyboard.nextLine().toUpperCase(Locale.ROOT));
        System.out.println("Chose what kind of seasoning you want, you can chose out: spicy, sweet and salty");
        Seasoning seasoning = Seasoning.valueOf(inputKeyboard.nextLine().toUpperCase(Locale.ROOT));
        System.out.println("You get: " + seasoning.nameSeasoning + mainIngredient.nameIngredient + typeRecipe.nameTypeRecipe);


    }
}


