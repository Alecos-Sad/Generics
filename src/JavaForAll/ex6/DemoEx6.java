package JavaForAll.ex6;

public class DemoEx6 {
    public static void main(String[] args) {
        MyClassEx6<Integer> A = new MyClassEx6<>();
        MyClassEx6 B = A;

        A.value = 100;
        A.show();
        B.show();
        A.value++;
        A.show();
        B.value = "This is text";
        B.show();
        A.show();
    }
}
