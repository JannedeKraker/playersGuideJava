package playersguide.day21;

import java.util.Locale;

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

