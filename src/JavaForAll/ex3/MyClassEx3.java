package JavaForAll.ex3;

public class MyClassEx3 {

    String name;

    <T> MyClassEx3(T t) {
        name = t.toString();
    }
}
