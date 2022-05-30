package JavaForAll.ex8;

public class DemoEx8 {
    public static void main(String[] args) {
        MyClassEx8<String, Character> obj = new MyClassEx8<>();
        obj.set("MyClass", 'D');
        obj.show();

        AlphaEx8<Double> A = new AlphaEx8<>();
        A.set(123.0,"Alpha");
        A.show();

        BravoEx8 B = new BravoEx8();
        B.set('B', 321);
        B.show();
    }
}
