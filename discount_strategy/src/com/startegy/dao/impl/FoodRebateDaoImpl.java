package com.startegy.dao.impl;

import com.startegy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;

public class FoodRebateDaoImpl implements CommodityDao {

	@Override
	public void Selling(Commodity commodity) {
		if (200 <= commodity.getPrice()) {
			System.out.println(CommodityType.getName(commodity.getType())
					+ "��200��100,�ܼۣ�" + (commodity.getPrice() - 100));
		} else {
			System.out.println(CommodityType.getName(commodity.getType())
					+ ",�ܼۣ�" + commodity.getPrice());
		}
	}

}
