package com.startegy.logicprocessing;

import com.startegy.dao.CommodityDao;
import com.startegy.dao.impl.BOOKDiscountDaoImpl;
import com.startegy.dao.impl.CommodityOrdinaryDaoImpl;
import com.startegy.dao.impl.FoodRebateDaoImpl;
import com.strategy.entity.Commodity;

public class SimpleFactoryControl {
	public static CommodityDao Selling(Commodity commodity) {
		if (commodity.getType() == 1) { // ͼ��������
			return new BOOKDiscountDaoImpl();
		} else if (commodity.getType() == 2) {// ʳƷ����200��100
			return new FoodRebateDaoImpl();
		} else { // ��������
			return new CommodityOrdinaryDaoImpl();
		}
	}
}
