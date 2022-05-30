package JavaForAll.ex6;

public class MyClassEx6<T> {

    public T value;

    public void show(){
        System.out.println("Check in progress");
        System.out.println("Field value: " + value);
        System.out.println("Field type: " + value.getClass().getSimpleName());
    }

}
