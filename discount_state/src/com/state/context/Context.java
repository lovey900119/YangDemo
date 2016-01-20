package com.state.context;

import com.state.discount.Discount;
import com.state.discount.impl.RebateImpl;

public class Context implements Discount {

    private Discount discount;

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
