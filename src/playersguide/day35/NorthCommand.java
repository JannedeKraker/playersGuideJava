package playersguide.day35;

public class NorthCommand implements RobotCommand {
    public void run(Robot robot) {
        if (robot.isPowered()) {
            int oneStepToNorth = robot.getY();
            oneStepToNorth++;
            robot.setY(oneStepToNorth);
        } else System.out.println("the robot is not Powered");
    }
}
