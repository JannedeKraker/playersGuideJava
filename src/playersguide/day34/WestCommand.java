package playersguide.day34;

public class WestCommand extends RobotCommand {
    public void run(Robot robot) {

        if (robot.isPowered()) {
            int oneStepToWest = robot.getX();
            oneStepToWest--;
            robot.setX(oneStepToWest);
        } else System.out.println("the robot is not Powered");
    }
}
