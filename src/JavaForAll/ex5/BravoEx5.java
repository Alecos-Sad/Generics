package JavaForAll.ex5;

public class BravoEx5 <T, U>{

    public T first;
    public U second;

    public BravoEx5(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void show(){
        System.out.println("<Bravo " + first + " || " + second + " >");
    }
}
