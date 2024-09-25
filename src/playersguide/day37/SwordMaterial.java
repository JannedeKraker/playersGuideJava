package playersguide.day37;

public enum SwordMaterial {
    WOOD("wood"),
    BRONZE("bronze"),
    IRON("iron"),
    STEEL("steel"),
    BINARIUM ("binarium");
   final String name;
    private SwordMaterial(String name){
        this.name = name;
    }

}
