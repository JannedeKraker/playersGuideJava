package playersguide.day32;

public abstract class InventoryItem {
    private final double weight;
    private final double volume;
    private String name;
    public InventoryItem(double weight, double volume){
        this.weight = weight;
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }
}
