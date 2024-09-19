package playersguide.day34;

public class SouthCommand extends RobotCommand{
    public void run(Robot robot) {
        if(robot.isPowered()){
            int oneStepToSouth = robot.getY();
        oneStepToSouth--;
        robot.setY(oneStepToSouth);
        }
        else System.out.println("the robot is not Powered");}
}
