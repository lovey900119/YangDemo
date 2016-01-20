package com.strategy.context;

import com.strategy.dao.CommodityDao;
import com.strategy.dao.impl.BookDiscountDaoImpl;
import com.strategy.dao.impl.CommodityOrdinaryDaoImpl;
import com.strategy.dao.impl.FoodRebateDaoImpl;
import com.strategy.entity.Commodity;

public class SimpleFactoryControl {
    public static CommodityDao Selling(Commodity commodity) {
        if (commodity.getType() == 1) {
            return new BookDiscountDaoImpl();
        } else if (commodity.getType() == 2) {
            return new FoodRebateDaoImpl();
        } else {
            return new CommodityOrdinaryDaoImpl();
        }
    }
}
