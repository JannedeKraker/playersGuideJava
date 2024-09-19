package playersguide.day34;

public class NorthCommand extends RobotCommand{
    public void run(Robot robot) {
        int oneStepToNorth = robot.getY();
        oneStepToNorth++;
        robot.setY(oneStepToNorth);
    }
}
