package playersguide.day34;

import playersguide.day32.*;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    private static Robot robot = new Robot();

    public static void main(String[] args) {
        RobotCommand input1 = getCommandFromUser();
        input1.run(robot);
        System.out.println(robot);
        RobotCommand input2 = getCommandFromUser();
        input2.run(robot);
        System.out.println(robot);
        RobotCommand input3 = getCommandFromUser();
        input3.run(robot);
        System.out.println(robot);

    }

    private static void robotCommandExplanation() {
        System.out.println("You can turn the robot on and off and let it drive in any direction.\n " +
                "Use the commands: on, off, north, east, south and west .");
    }

    public static RobotCommand getCommandFromUser() {
        robotCommandExplanation();
        String command = input.next();
        return switch (command) {
            case "on" -> new OnCommand();
            case "off" -> new OffCommand();
            case "north" -> new NorthCommand();
            case "east" -> new EastCommand();
            case "south" -> new SouthCommand();
            case "west" -> new WestCommand();
            default -> null;
        };
    }
}
