package com.startegy.main;

import com.startegy.dao.CommodityDao;
import com.startegy.logicprocessing.SimpleFactoryControl;
import com.strategy.entity.Commodity;

public class Shopping {

	public static void main(String[] args) {

		Commodity commodity = new Commodity();
		commodity.setPrice(250); // 价格
		commodity.setType(1);// 类型 1，图书类 2，水果类，3电器类，4 日化类
		CommodityDao commdit = SimpleFactoryControl.Selling(commodity);
		commdit.Selling(commodity);
	}
}
