package JavaForAll.ex9;

public class SecondEx9 <T extends AlphaEx9>{

    public T obj;

    public SecondEx9(T t) {
        this.obj = t;
    }

    public void display(){
        obj.show();
    }
}
