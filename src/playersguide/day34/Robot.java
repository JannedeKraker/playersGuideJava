package playersguide.day34;

class Robot {
    private int x;

    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isPowered() {
        return isPowered;
    }

    private boolean isPowered;

    public void setPowered(boolean powered) {
        isPowered = powered;
    }

    private RobotCommand[] commands = new RobotCommand[3];

    public void run() {
        for (RobotCommand command : commands) {
            command.run(this);
            System.out.printf("[%d %d %b]\n", x, y, isPowered);
        }
    }
}