package JavaForAll.ex4;

public class DemoEx4 {

    static <T> void show(T t) {
        System.out.println("[1] " + t);
    }

    static void show(String s) {
        System.out.println("[2] " + s);
    }

    static <T, U> void show(T t, U u) {
        System.out.println("[3] " + t + " and " + u);
    }

    static <T> void show(T t, int n) {
        System.out.println("[4] " + t + " and number " + n);
    }

    static void show(int n, char s) {
        System.out.println("[5] Number " + n + " char " + s);
    }

    public static void main(String[] args) {
        show(100);
        show('A');
        show("Alpha");
        show("Alpha", "Bravo");
        show('B', 200.0);
        show("Delta", 300);
        show(400, 'C');
        DemoEx4.<Character, Integer>show('D', 500);
        DemoEx4.<Character>show('D',500);
    }


}
