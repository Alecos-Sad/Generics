package RobotStar;

public class Robot<T extends Head> {
    private Body body;
    private T head;

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public void foo(Robot<?> ob) {

    }

}
