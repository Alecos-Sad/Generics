package JavaForAll.ex3;

public class DemoEx3 {
    public static void main(String[] args) {

        MyClassEx3 A = new MyClassEx3(12);
        System.out.println(A.name);
        MyClassEx3 B = new MyClassEx3("Java");
        System.out.println(B.name);
        MyClassEx3 C = new MyClassEx3(new AlphaEx3(300));
        System.out.println(C.name);

    }


}
