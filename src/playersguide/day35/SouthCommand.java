package playersguide.day35;

public class SouthCommand implements RobotCommand {
    public void run(Robot robot) {
        if(robot.isPowered()){
            int oneStepToSouth = robot.getY();
        oneStepToSouth--;
        robot.setY(oneStepToSouth);
        }
        else System.out.println("the robot is not Powered");}
}
