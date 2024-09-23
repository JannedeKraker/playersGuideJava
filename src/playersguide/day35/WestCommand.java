package playersguide.day35;

public class WestCommand implements RobotCommand {
    public void run(Robot robot) {

        if (robot.isPowered()) {
            int oneStepToWest = robot.getX();
            oneStepToWest--;
            robot.setX(oneStepToWest);
        } else System.out.println("the robot is not Powered");
    }
}
