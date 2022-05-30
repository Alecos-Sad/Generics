package com.company.sadovnikov;

import java.math.BigDecimal;

public class Person implements Payable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getMonthPayment() {
        return BigDecimal.valueOf(9898);
    }
}
