package com.state.discount.impl;

import com.state.discount.Discount;

public class DiscountImpl implements Discount {

	@Override
	public void discount(double price) {
		System.out.println("��300��6��,�ܼۣ�" + price * 0.6);
	}

}
