package JavaForAll.ex7;

public class DemoEx7 {
    public static void main(String[] args) {
        AlphaEx7<Character, String> A = new AlphaEx7<>();
        A.value = "Alpha";
        A.show('A');
        BravoEx7 B = new BravoEx7();
        B.show("Bravo");
    }
}
