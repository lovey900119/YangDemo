package com.strategy.dao.impl;

import com.strategy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;

public class FoodRebateDaoImpl implements CommodityDao {

    @Override
    public void Selling(Commodity commodity) {
        if (200 <= commodity.getPrice()) {
            System.out.println(CommodityType.getName(commodity.getType())
                + "食品类满200减100，总价" + (commodity.getPrice() - 100));
        } else {
            System.out.println(CommodityType.getName(commodity.getType())
                + ",总价：" + commodity.getPrice());
        }
    }

}
