package playersguide.day34;

public class WestCommand extends RobotCommand{
    public void run(Robot robot) {
        int oneStepToWest = robot.getX();
        oneStepToWest--;
        robot.setY(oneStepToWest);
    }
}
