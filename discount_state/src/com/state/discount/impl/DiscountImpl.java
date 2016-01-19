package com.state.discount.impl;

import com.state.discount.Discount;

public class DiscountImpl implements Discount {

	@Override
	public void discount(double price) {
		System.out.println("Âú300´ò6ÕÛ,×Ü¼Û£º" + price * 0.6);
	}

}
