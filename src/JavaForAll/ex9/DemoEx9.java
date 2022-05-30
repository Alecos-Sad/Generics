package JavaForAll.ex9;

public class DemoEx9 {
    public static void main(String[] args) {
        FirstEx9<BravoEx9, AlphaEx9> A = new FirstEx9<>();
        A.set(new BravoEx9("Bravo"), new AlphaEx9("Alpha"));
        A.get(false).show();
        A.get(true).show();
        SecondEx9<CharlieEx9> B = new SecondEx9<>(new CharlieEx9("Charlie"));
        B.display();
    }
}
