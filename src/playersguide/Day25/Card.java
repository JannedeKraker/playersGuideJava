package playersguide.Day25;

class Card {
    private CardRank cardRank;
    private CardColor cardColor;
    public Card(CardRank cardRank, CardColor cardColor) {
        this.cardRank = cardRank;
        this.cardColor = cardColor;
    }
    public CardRank getCardRank() {
        return cardRank;
    }
    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }
    public CardColor getCardColor() {
        return cardColor;
    }
    public void setCardColor(CardColor cardColor) {
        this.cardColor = cardColor;
    }
    public void numberOrSymbolCard(Card card) {
        String cardRank = String.valueOf(card.getCardRank());
        if (cardRank == "SYMBOL_DOLLAR" || cardRank == "SYMBOL_PERCENT"
                || cardRank == "SYMBOL_CIRCUMFLEX" || cardRank == "SYMBOL_AMPERSAND") {
            System.out.println("this card is an symbol card");
        } else {
            System.out.println("this card is an number card");
        }
    }
}
