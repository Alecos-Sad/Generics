package RobotStar;

public class RobotMain {

    public static void main(String[] args) {

        Body body = new Body();
        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Leg leg = new Leg();

        Robot<SmallHead> robot = new Robot(body, smallHead);
        Robot<MediumHead> robot1 = new Robot(body, mediumHead);

        robot.foo(robot1);

    }
}
