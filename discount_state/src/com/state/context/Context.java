package com.state.context;

import com.state.discount.Discount;
import com.state.discount.impl.RebateImpl;

public class Context {

    private Discount discount = new RebateImpl();

    public void discount(double price) {
        this.discount.discount(price);
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

}
