package com.state.discount.impl;

import com.state.discount.Discount;

public class RebateImpl implements Discount {

	@Override
	public void discount(double price) {
		System.out.println("Ô­¼Û£º"+price);
		
	}

}
