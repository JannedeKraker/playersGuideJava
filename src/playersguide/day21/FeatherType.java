package playersguide.day21;

public enum FeatherType {
    PLASTIC_FEATHER(10),
    TURKEY_FEATHER(5),
    GOOSE_FEATHER(3);

    private final int cost;

    FeatherType(int cost) {
        this.cost = cost;
    }
}
