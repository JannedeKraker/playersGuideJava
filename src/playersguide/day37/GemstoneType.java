package playersguide.day37;

public enum GemstoneType {
    EMERALD ("emerald"),
    AMBER("amber"),
    SAPPHIRE("sapphire"),
    DIAMOND("diamond"),
    BITSTONE("bitstone");
    final String name;
    private GemstoneType(String name){
        this.name = name;
    }
}
