package com.state.main;

import com.state.context.Context;
import com.state.discount.impl.DiscountImpl;
import com.state.discount.impl.OrdinaryImpl;
import com.state.discount.impl.RebateImpl;

public class DiscountTest {

	public static void main(String[] args) {
		// ��Ʒ�۸�
		double price = 100;

		Context con = new Context();
		DiscountImpl discountImpl = new DiscountImpl();//�ۿ�
		OrdinaryImpl ordinaryImpl = new OrdinaryImpl();//����
		RebateImpl rebateImpl = new RebateImpl();	//����

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
