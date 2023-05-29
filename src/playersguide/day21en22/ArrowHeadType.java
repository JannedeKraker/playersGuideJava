package playersguide.day21en22;

public enum ArrowHeadType {
    STEEL(10f),
    WOOD(3f),
    OBSIDIAN(5f);
    private final float cost;
    ArrowHeadType(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }
}

