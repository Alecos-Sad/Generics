package JavaForAll.ex8;

public class MyClassEx8 <T, U>{

    private T value;
    private U code;

    public void set(T t, U u){
        value = t;
        code = u;
    }

    public void show(){
        System.out.println("[1] " + value);
        System.out.println("[2] " + code);
    }
}
