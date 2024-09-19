package playersguide.day34;

public class SouthCommand extends RobotCommand{
    public void run(Robot robot) {
        int oneStepToSouth = robot.getY();
        oneStepToSouth--;
        robot.setY(oneStepToSouth);
    }
}
