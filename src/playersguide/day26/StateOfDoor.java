package playersguide.day26;

public enum StateOfDoor {
    OPEN ("open"),
    CLOSED("closed"),
    LOCKED ("locked");

    private final String stateOfDoor;

    StateOfDoor(String stateOfDoor) {
        this.stateOfDoor = stateOfDoor;
    }

    public String getStateOfDoor() {
        return stateOfDoor;
    }
}
