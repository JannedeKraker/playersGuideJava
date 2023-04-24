package playersguide.day21;

public enum FeatherType {
    PLASTIC(10),
    TURKEY(5),
    GOOSE(3);

    public int getCost() {
        return cost;
    }

    private final int cost;

    FeatherType(int cost) {
        this.cost = cost;
    }
}
