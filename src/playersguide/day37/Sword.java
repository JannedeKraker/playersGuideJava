package playersguide.day37;

public class Sword {
    SwordMaterial swordMaterial;
    GemstoneType gemstoneType;
    int length;
    int crossguardWidth;

    public Sword(SwordMaterial swordMaterial, GemstoneType gemstoneType, int length, int crossguardWidth){
        this.swordMaterial = swordMaterial;
        this.gemstoneType = gemstoneType;
        this.length = length;
        this.crossguardWidth = crossguardWidth;
    }
    public Sword(SwordMaterial swordMaterial, GemstoneType gemstoneType){
        this.swordMaterial = swordMaterial;
        this.gemstoneType = gemstoneType;

    }
    public Sword(SwordMaterial swordMaterial){
        this.swordMaterial = swordMaterial;

    }

    public Sword withMaterial(SwordMaterial swordMaterial){
        return new Sword(swordMaterial);
    }
}
