package playersguide.day34;

public class NorthCommand extends RobotCommand {
    public void run(Robot robot) {
        if (robot.isPowered()) {
            int oneStepToNorth = robot.getY();
            oneStepToNorth++;
            robot.setY(oneStepToNorth);
        } else System.out.println("the robot is not Powered");
    }
}
