package com.strategy.logicprocessing;

import com.strategy.dao.CommodityDao;
import com.strategy.dao.impl.BOOKDiscountDaoImpl;
import com.strategy.dao.impl.CommodityOrdinaryDaoImpl;
import com.strategy.dao.impl.FoodRebateDaoImpl;
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
