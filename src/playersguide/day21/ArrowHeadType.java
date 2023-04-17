package playersguide.day21;

public enum ArrowHeadType {
    STEEL(10),
    WOOD(3),
    OBSIDIAN(5);

    private final int cost;

    ArrowHeadType(int cost) {
        this.cost = cost;
    }
}
