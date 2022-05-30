package com.company.sadovnikov;

import java.math.BigDecimal;

public class Employe extends Person implements Payable{

    public Employe(String name) {
        super(name);
    }

    @Override
    public BigDecimal getMonthPayment() {
        return BigDecimal.valueOf(5000);
    }
}
