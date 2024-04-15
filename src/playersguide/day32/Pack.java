package playersguide.day32;

import java.lang.reflect.Array;

public class Pack {

    double maxVolume;
    double maxWeight;
    int totalNumberOfItems;
    InventoryItem[] items;
    int itemCount;
    double volumeCount;
    double weightCount;

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
        int i = 0;
        for (InventoryItem item : items) {
            if (volumeCount >= maxVolume || item.getVolume() > (maxVolume-volumeCount)) {
                System.out.println("The package has to much volume if you add this " + item.getName() + ".");
                return false;
            } else if (weightCount >= maxWeight || item.getWeight() > (maxWeight-weightCount)) {
                System.out.println("The package has to much weight if you add this " + item.getName() + ".");
                return false;

            } else if (itemCount == totalNumberOfItems) {
                System.out.println("There are to many items if you add the " + item.getName() + ".");
                return false;

            } else {
                volumeCount += item.getVolume();
                weightCount += item.getWeight();
                itemCount++;
                System.out.println( "after adding "+ item.getName() + ".\nThe volume of the package is: " + volumeCount + "." +
                        "\nThe weight of the package is: " + weightCount + ". \nThere are "+ itemCount + " items in your package.");
                this.items[i] = item;
                i++;
            }

        }
        return true;
    }

}
