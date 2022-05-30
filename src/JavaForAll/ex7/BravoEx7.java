package JavaForAll.ex7;

public class BravoEx7 implements MyInterfaceEx7<String> {

    @Override
    public void show(String t) {
        System.out.println("Text: " + t);
    }
}
