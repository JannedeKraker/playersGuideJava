package playersguide.day34;

public class EastCommand extends RobotCommand {
    public void run(Robot robot) {
        int oneStepToEast = robot.getX();
        oneStepToEast++;
        robot.setY(oneStepToEast);
    }
}
