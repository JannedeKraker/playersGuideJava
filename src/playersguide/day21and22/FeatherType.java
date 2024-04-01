package playersguide.day21and22;

public enum FeatherType {
    PLASTIC(10f),
    TURKEY(5f),
    GOOSE(3f);

    private final float cost;
    public float getCost() {
        return cost;
    }
    FeatherType(float cost) {
        this.cost = cost;
    }
}
