package com.state.main;

import com.state.context.Context;
import com.state.discount.Discount;
import com.state.discount.impl.RebateImpl;

public class DiscountTest {

    public static void main(String[] args) {
        double price = 100;
        Context con = new Context();
        con.discount(price);
        
        Discount d = new RebateImpl();
        d.discount(400);
    }
}
