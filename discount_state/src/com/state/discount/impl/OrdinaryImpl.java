package com.state.discount.impl;

import com.state.discount.Discount;

public class OrdinaryImpl implements Discount {

	@Override
	public void discount(double price) {
		System.out.println("Âú200¼õ100£¬×Ü¼Û:"+(price-100));
	}

}
