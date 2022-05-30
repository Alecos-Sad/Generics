package JavaForAll.ex5;

public class DemoEx5 {
    public static void main(String[] args) {
        AlphaEx5<Integer> A1 = new AlphaEx5<>(123);
        AlphaEx5<String> A2 = new AlphaEx5<>("Green");
        BravoEx5<Integer, String> B1;
        B1 = new BravoEx5<>(321,"Blue");
        BravoEx5<Character, Character> B2 = new BravoEx5<>('B', 'C');

        A1.show();
        A2.show();
        B1.show();
        B2.show();

    }
}
