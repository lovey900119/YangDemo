package com.startegy.main;

import com.startegy.dao.CommodityDao;
import com.startegy.logicprocessing.SimpleFactoryControl;
import com.strategy.entity.Commodity;

public class Shopping {

	public static void main(String[] args) {

		Commodity commodity = new Commodity();
		commodity.setPrice(250); // �۸�
		commodity.setType(1);// ���� 1��ͼ���� 2��ˮ���࣬3�����࣬4 �ջ���
		CommodityDao commdit = SimpleFactoryControl.Selling(commodity);
		commdit.Selling(commodity);
	}
}
