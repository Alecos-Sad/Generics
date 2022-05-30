package JavaForAll.ex2;

public class DemoEx2 {

    public static void main(String[] args) {
        // Создание объектов:
        Alpha A = new Alpha(100);
        MyClassEx2 obj = new MyClassEx2();
// Вызов обобщенного метода:
        obj.set(A);
        System.out.println(obj);
        obj.set(obj);
        System.out.println(obj);
        obj.set(200);
        System.out.println(obj);
        obj.set("объект");
        System.out.println(obj);
// Массивы:
        Integer[] nums = {1, 2, 3, 4, 5};
        Alpha[] objs = new Alpha[5];
        for (int k = 0; k < objs.length; k++) {
            objs[k] = new Alpha((k + 1) * 10);
        }
        String[] txt = {"один", "два", "три", "четыре", "пять"};
        Character[] symbs = {'A', 'B', 'C', 'D', 'E'};
// Вызов обобщенного метода:
        Integer n = obj.get(nums, 'б');
        Alpha a = obj.get(objs, 'б');
        String t = obj.get(txt, 'е');
        Character s = obj.get(symbs, 'б');
// Проверка результата:
        System.out.println("Integer: " + n);
        System.out.println("Alpha: " + a);
        System.out.println("String: " + t);
        System.out.println("Character: " + s);


    }
}
//page 390