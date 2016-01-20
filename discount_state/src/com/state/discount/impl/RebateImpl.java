package com.state.discount.impl;

import com.state.discount.Discount;

public class RebateImpl implements Discount {

    @Override
    public void discount(double price) {
        if (200 > price && price > 0) {
            System.out.println("普通价格：" + price);
        } else if (200 <= price && price > 0) {
            new OrdinaryImpl().discount(price);
        } else {
            System.out.println("价格错误");
        }
    }

}
