package JavaForAll.ex2;

public class MyClassEx2 {

    String name;

    public <T> void set(T obj){
        name = obj.toString();
    }

    public <T> T get(T[] objs, char symb){
        int index = name.indexOf(symb);
        if (index < 0){
            index = 0;
        }
        if (index >= objs.length){
            index = objs.length - 1;
        }
        return objs[index];
    }

    @Override
    public String toString() {
        return "MyClassEx2 " + name;
    }
}
