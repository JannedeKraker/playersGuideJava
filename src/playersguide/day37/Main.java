package playersguide.day37;

public class Main {
    public static void main(String[] args) {
        Sword basicSword = new Sword(SwordMaterial.IRON);
        Sword woodAmberSword = new Sword(SwordMaterial.WOOD,GemstoneType.AMBER, 50, 25);
        Sword steelDiamondSword = new Sword(SwordMaterial.STEEL, GemstoneType.DIAMOND);

        System.out.println(basicSword);
        System.out.println(woodAmberSword);
        System.out.println(steelDiamondSword);
    }
}
