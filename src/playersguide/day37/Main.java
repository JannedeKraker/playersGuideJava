package playersguide.day37;

public class Main {
    public static void main(String[] args) {
        Sword basicSword = new Sword(SwordMaterial.IRON);
        Sword steelDiamondSword = new Sword(SwordMaterial.STEEL, GemstoneType.DIAMOND);
        Sword woodAmberSword = new Sword(SwordMaterial.WOOD,GemstoneType.AMBER, 50, 25);

        System.out.println(basicSword);
        System.out.println(steelDiamondSword);
        System.out.println();
        System.out.println(woodAmberSword);

        Sword copySwordSteelInsteadOfWood = woodAmberSword.withMaterial(SwordMaterial.STEEL);
        System.out.println(copySwordSteelInsteadOfWood);
    }
}
