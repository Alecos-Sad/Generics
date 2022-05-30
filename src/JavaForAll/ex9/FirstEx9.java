package JavaForAll.ex9;

public class FirstEx9 <T extends U, U>{

    public T code;
    public U value;

    public void set(T t, U u){
        code = t;
        value = u;
    }

    U get(boolean t){
        return t ? code : value;
    }



}
