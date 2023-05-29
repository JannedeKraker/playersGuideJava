package playersguide.Day25;

public enum CardRank {
    NUMBER_ONE ("1"),
    NUMBER_TWO ("2"),
    NUMBER_THREE ("3"),
    NUMBER_FOUR ("4"),
    NUMBER_FIVE ("5"),
    NUMBER_SIX("6"),
    NUMBER_SEVEN("7"),
    NUMBER_EIGHT("8"),
    NUMBER_NINE("9"),
    NUMBER_TEN("10"),
    SYMBOL_DOLLAR("$"),
    SYMBOL_PERCENT("%"),
    SYMBOL_CIRCUMFLEX("^"),
    SYMBOL_AMPERSAND("&");

    private final String rank;

    CardRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
