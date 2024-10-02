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

    public Sword(SwordMaterial swordMaterial, GemstoneType gemstoneType,int length){
        this(swordMaterial,gemstoneType,length, 20);

    }
    public Sword(SwordMaterial swordMaterial, GemstoneType gemstoneType){
       this(swordMaterial,gemstoneType,30, 20);

    }
    public Sword(SwordMaterial swordMaterial){
        this(swordMaterial,null);

    }

    public Sword withMaterial(SwordMaterial swordMaterial){
        return new Sword(swordMaterial,this.gemstoneType, this.length,this.crossguardWidth);
    }

    @Override
    public String toString() {
        String string;
        if(gemstoneType == null){
            string = "a " + swordMaterial.name + " sword of " + length + " centimetres long, a crossguard width of " + crossguardWidth + " cm";
        }
        else string =  "a " + swordMaterial.name + " sword of " + length + " centimetres long, a crossguard width of " + crossguardWidth + "cm, and an embedded " + gemstoneType.name;
    return string;}
}

