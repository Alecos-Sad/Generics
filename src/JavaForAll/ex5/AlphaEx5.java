package JavaForAll.ex5;

public class AlphaEx5<T> {

    public T value;

    public AlphaEx5(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println("<AlphaEx5 " + value + " >");
    }
}
