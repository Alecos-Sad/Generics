package com.company.sadovnikov;

import java.math.BigDecimal;

public class Retiree extends Person implements Payable{

    public Retiree(String name) {
        super(name);
    }

    @Override
    public BigDecimal getMonthPayment() {
        return BigDecimal.valueOf(10000);
    }
}
