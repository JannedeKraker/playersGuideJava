package playersguide.Day25;

import java.util.ArrayList;

//The digital Realms of Java have playing cards like ours but with some differences.
//Each card has a color (red, green, blue, yellow) and a rank (the numbers 1
//through 10, followed by the symbols $, %, ^, and &). The third pedestal
//requires that you create a class to represent a card of this nature.
//Objectives:
//• Define enumerations for card colors and card ranks.
//• Define a Card class to represent a card with a color and a rank, as described
//  above.
//• Add methods that tell you if a card is a number or symbol card (the
//  equivalent of a face card).
// • Create a main method that will create a card instance for the whole deck
//   (every color with every rank) and display each (for example, “The Red
//   Ampersand” and “The Blue Seven”).
//• Answer this question: Why do you think we used a color enumeration here
//   but made a color class in the previous challenge?
public class Day25TheCard {
    public static void main(String[] args) {

        Card numberCard = new Card(CardRank.NUMBER_SIX, CardColor.RED);
        numberCard.NumberOrSymbolCard(numberCard);


        Card symbolCard = new Card(CardRank.SYMBOL_CIRCUMFLEX, CardColor.GREEN);
        symbolCard.NumberOrSymbolCard(symbolCard);

        CardDeck();



    }

    public static void CardDeck() {
        ArrayList deck = new ArrayList();
        for (int i = 0; i < 14; i++) {
            CardRank rank = CardRank.values()[i];

            for (int j = 0; j < 4; j++) {
                Card card = new Card(rank, CardColor.values()[j]);
                deck.add(card);
                System.out.println( "The " +card.getCardColor().getColor() + " " + card.getCardRank().getRank() + "\u001B[0m"+ " card" );


            }
        }

        }
    }
















