package com.state.context;

import com.state.discount.Discount;

public class Context implements Discount {

	private Discount discount;

	@Override
	public void discount(double price) {
		this.discount.discount(price);

	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

}
