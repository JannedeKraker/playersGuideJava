package playersguide.day34;

public class OnCommand extends RobotCommand{
    @Override
    public void run(Robot robot) {
        robot.setPowered(true);
    }
}
