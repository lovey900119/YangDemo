package com.startegy.dao.impl;

import com.startegy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;

//图书打九折
public class BOOKDiscountDaoImpl implements CommodityDao {

	@Override
	public void Selling(Commodity commodity) {

		System.out.println(CommodityType.getName(commodity.getType())
				+ "打九折，总价：" + (commodity.getPrice() * 0.9));
	}

}
