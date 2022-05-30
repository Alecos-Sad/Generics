package com.company.sadovnikov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----getRandomItem1-----");
        String s = GenericTest.getRandomItem1("A", "B", "C", "D", "E");
        System.out.println(s);
        Number i = GenericTest.getRandomItem1(1.2, 1f, 3, 4, 5L, 0);
        System.out.println(i);


        System.out.println("-----getRandomItem2-----");
        List<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
        str.add("E");
        String strArray = GenericTest.getRandomItem2(str);
        System.out.println(strArray);

        List<Number> num = new ArrayList<>();
        num.add(1.2);
        num.add(2);
        num.add(4.5f);
        num.add(5L);
        num.add(0);
        Number numArray = GenericTest.getRandomItem2(num);
        System.out.println(numArray);

        System.out.println("------------------------");
        List<Person> jack = new ArrayList<>();
        jack.add(new Person("Alex"));
        jack.add(new Employe("Sad"));
        jack.add(new Visitor("ALtyy"));

        String gtr = GenericTest.getRandomPersonName(jack);
        System.out.println(gtr);
    }
}
