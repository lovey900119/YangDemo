package com.strategy.logicprocessing;

import com.strategy.dao.CommodityDao;
import com.strategy.dao.impl.BOOKDiscountDaoImpl;
import com.strategy.dao.impl.CommodityOrdinaryDaoImpl;
import com.strategy.dao.impl.FoodRebateDaoImpl;
import com.strategy.entity.Commodity;

public class SimpleFactoryControl {
    public static CommodityDao Selling(Commodity commodity) {
        if (commodity.getType() == 1) { // 图书类打九折
            return new BOOKDiscountDaoImpl();
        } else if (commodity.getType() == 2) {// 食品类满200减100
            return new FoodRebateDaoImpl();
        } else { // 其他正常
            return new CommodityOrdinaryDaoImpl();
        }
    }
}
