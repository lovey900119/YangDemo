package com.state.discount.impl;

import com.state.discount.Discount;

public class OrdinaryImpl implements Discount {

	@Override
	public void discount(double price) {
		System.out.println("��200��100���ܼ�:"+(price-100));
	}

}
