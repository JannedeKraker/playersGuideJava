package playersguide.day21en22;

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
