package com.startegy.dao.impl;

import com.startegy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;

public class CommodityOrdinaryDaoImpl implements CommodityDao {

	@Override
	public void Selling(Commodity commodity) {

		System.out.println(CommodityType.getName(commodity.getType())
				+ "正常价格,总价;" + commodity.getPrice());

	}

}
