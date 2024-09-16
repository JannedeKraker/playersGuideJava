package playersguide.day34;

class Robot {
    private int x;

    private int y;

    private boolean isPowered;

    private RobotCommand[] commands = new RobotCommand[3];

    public void run() {
        for (RobotCommand command : commands) {
            command.run(this);
            System.out.printf("[%d %d %b]\n", x, y, isPowered);
        }
    }
}