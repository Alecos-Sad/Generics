package JavaForAll.ex7;

public class AlphaEx7 <T, U> implements MyInterfaceEx7<T>{

    public U value;

    @Override
    public void show(T t) {
        System.out.println(t + ": " + value);
    }
}
