package playersguide.Day20;

import java.util.Scanner;

public class ComposedSoup {
    public static void main(String[] args) {

        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Chose what kind of recipe you want, you can chose out: SOUP, STEW and GUMBO");
        TypeRecipe one = TypeRecipe.valueOf(inputKeyboard.nextLine());
        System.out.println("Chose what kind of main ingredient you want, you can chose out:  POTATO, MUSHROOM,CARROT and CHICKEN");
        MainIngredient two = MainIngredient.valueOf(inputKeyboard.nextLine());
        System.out.println("Chose what kind of seasoning you want, you can chose out:  SPICY, SWEET and SALTY");
        Seasoning three = Seasoning.valueOf(inputKeyboard.nextLine());
        System.out.println("You get: " + three.nameSeasoning +  two.nameIngredient + one.nameTypeRecipe );


    }
}
