package playersguide.day32;

import java.lang.reflect.Array;

public class Pack {

    double maxVolume;
    double maxWeight;
    int totalNumberOfItems;
    InventoryItem[] items;
    int itemCount = 0;
    double volumeCount = 0;
    double weightCount = 0;

    public Pack(double maxVolume, double maxWeight, int totalNumberOfItems) {
        this.maxVolume = maxVolume;
        this.maxWeight = maxWeight;
        this.totalNumberOfItems = totalNumberOfItems;
        this.items = new InventoryItem[totalNumberOfItems];
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getTotalNumberOfItems() {
        return totalNumberOfItems;
    }


    public int getNumberOfItems() {
        return this.itemCount;
    }

    public double getVolume() {
        return this.volumeCount;
    }

    public double getWeight() {
        return this.weightCount;
    }

    public boolean add(InventoryItem[] items) {

        if (items.length == 0) {
            return false;
        } else {
            for (InventoryItem item : items) {
                if (item == null) {
                    return false;
                } else if (volumeCount >= maxVolume || item.getVolume() > (maxVolume - volumeCount)) {
                    System.out.println("The package has to much volume if you add this " + item + ".");
                    return false;
                } else if (weightCount >= maxWeight || item.getWeight() > (maxWeight - weightCount)) {
                    System.out.println("The package has to much weight if you add this " + item + ".");
                    return false;
                } else if (itemCount == totalNumberOfItems) {
                    System.out.println("There are to many items if you add the " + item + ".");
                    return false;
                } else {
                    volumeCount += item.getVolume();
                    weightCount += item.getWeight();
                    this.items[itemCount++] = item;
                }
            }
            return true;
        }
    }

    @Override
    public String toString() {
        String itemInPack = " ";
        System.out.println("pack containing:  ");
        for (InventoryItem item : items) {
            if (item == null) {
                break;
            } else System.out.print(item + " ");
        }
        return itemInPack;
    }
}
