package playersguide.day35;

public class OffCommand implements RobotCommand {

    public void run(Robot robot) {
    robot.setPowered(false);
    }
}
