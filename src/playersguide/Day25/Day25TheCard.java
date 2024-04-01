package playersguide.Day25;

import java.util.ArrayList;


public class Day25TheCard {
    public static void main(String[] args) {
        Card numberCard = new Card(CardRank.NUMBER_SIX, CardColor.RED);
        numberCard.numberOrSymbolCard(numberCard);

        Card symbolCard = new Card(CardRank.SYMBOL_CIRCUMFLEX, CardColor.GREEN);
        symbolCard.numberOrSymbolCard(symbolCard);

        printCardDeck();
    }
    public static void printCardDeck() {
        ArrayList deck = new ArrayList();
        for (int i = 0; i < 14; i++) {
            CardRank rank = CardRank.values()[i];

            for (int j = 0; j < 4; j++) {
                Card card = new Card(rank, CardColor.values()[j]);
                deck.add(card);
                System.out.println("The " + card.getCardColor().getColor() + " " + card.getCardRank().getRank() + "\u001B[0m" + " card");
            }
        }
    }
}
















