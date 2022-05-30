package JavaForAll.ex1;

import java.util.Date;

public class DemoEx1 {

    public static void main(String[] args) {

        //Arrays
        Integer[] numbers = {1, 3, 5, 7, 9, 11, 13};
        Character[] symbols = {'A', 'B', 'C', 'D'};
        String[] text = {"Alpha", "Bravo", "Charlie"};

        show(numbers);
        System.out.println();
        show(symbols);
        System.out.println();
        show(text);
        System.out.println();

        System.out.println(getText('A', 1));
        System.out.println(getText("Alpha", 2));
        System.out.println(getText(100, 3));
        System.out.println();

        MyClassEx1 myClassEx1 = new MyClassEx1(200);
        System.out.println(getText(myClassEx1,4));
        System.out.println();

        String A = getArg("Alpha", "Bravo", myClassEx1);
        MyClassEx1 B = getArg(new MyClassEx1(300), new MyClassEx1(400), 1234);
        Integer C = getArg(123,321,"Hello");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println();

       MyClassEx1.show(123);
       MyClassEx1.<Integer>show(123);
       MyClassEx1.show(321.0);
       MyClassEx1.<Double>show(321.0);
       MyClassEx1.show('A');
       MyClassEx1.<Character>show('A');


    }

    static <T> void show(T[] a) {
        for (T t : a) {
            System.out.print("|" + t);
        }
        System.out.print("|");
    }

    static <T> String getText(T a, int n) {
        String res = n + ": ";
        res += a;
        return res;
    }

    static <T, U> T getArg(T x, T y, U z) {
        int val = z.toString().length();
        return val % 2 == 0 ? x : y;
    }

}
