package com.state.discount.impl;

import com.state.discount.Discount;

public class DiscountImpl implements Discount {

    @Override
    public void discount(double price) {
        if (300 <= price) {
            System.out.println("Purchase 300 discount 6£¬total price£º" + price
                    * 0.6);
        }
    }

}
