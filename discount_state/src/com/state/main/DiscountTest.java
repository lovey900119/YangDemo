package com.state.main;

import com.state.context.Context;
import com.state.discount.impl.DiscountImpl;
import com.state.discount.impl.OrdinaryImpl;
import com.state.discount.impl.RebateImpl;

public class DiscountTest {

	public static void main(String[] args) {
		// 商品价格
		double price = 100;

		Context con = new Context();
		DiscountImpl discountImpl = new DiscountImpl();//折扣
		OrdinaryImpl ordinaryImpl = new OrdinaryImpl();//满减
		RebateImpl rebateImpl = new RebateImpl();	//正常

		if (300 <= price) {
			con.setDiscount(discountImpl);
			con.discount(300);
		} else if (200 <= price) {
			con.setDiscount(ordinaryImpl);
			con.discount(200);
		} else {
			con.setDiscount(rebateImpl);
			con.discount(price);
		}
	}
}
