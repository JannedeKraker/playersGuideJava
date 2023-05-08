package playersguide.day21;

public enum FeatherType {
    PLASTIC(10f),
    TURKEY(5f),
    GOOSE(3f);

    public float getCost() {
        return cost;
    }

    private final float cost;

    FeatherType(float cost) {
        this.cost = cost;
    }
}
