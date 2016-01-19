package com.state.discount.impl;

import com.state.discount.Discount;

public class OrdinaryImpl implements Discount {

    @Override
    public void discount(double price) {
        if (200 <= price && price < 300) {
            System.out.println("Purchase 200 reduced by 100£¬ total price:"
                    + (price - 100));
        } else {
            new DiscountImpl().discount(price);
        }

    }

}
