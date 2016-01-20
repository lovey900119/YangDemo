package com.state.discount.impl;

import com.state.discount.Discount;

public class DiscountImpl implements Discount {

    @Override
    public void discount(double price) {
        if (300 <= price) {
            System.out.println("满 300 打 6折,总价:" + price * 0.6);
        }
    }

}
