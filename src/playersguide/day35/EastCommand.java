package playersguide.day35;

public class EastCommand  implements RobotCommand {
    public void run(Robot robot) {
        if (robot.isPowered()) {
            int oneStepToEast = robot.getX();
            oneStepToEast++;
            robot.setX(oneStepToEast);
        } else System.out.println("the robot is not Powered");
    }
}
