package com.state.context;

import com.state.discount.Discount;
import com.state.discount.impl.RebateImpl;

public class Context implements Discount {

    public void discount(double price) {
        new RebateImpl().discount(price);
    }

}
