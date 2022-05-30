package JavaForAll.ex1;

public class MyClassEx1 {

    int code;

    public MyClassEx1(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    static <T> void show(T t){
        System.out.println("Value: " + t);
    }

    @Override
    public String toString() {
        return "MyClass " + code;
    }
}
