package com.company.sadovnikov;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GenericTest {


    @SafeVarargs
    public static  <T> T getRandomItem1(T...items){
        return items[ThreadLocalRandom.current().nextInt(items.length)];
    }

    public static <T> T getRandomItem2(List<T> items){
        T result = items.get(ThreadLocalRandom.current().nextInt(items.size()));
        return result; 
    }

    public static <T extends Person & Payable> String getRandomPersonName(List<T> items){
        Person result = //можно написать Т result
                        items.get(ThreadLocalRandom.current().nextInt(items.size()));
        return result.getName() + "  " +  result.getMonthPayment();

    }

}
