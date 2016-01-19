package com.strategy.dao.impl;

import com.strategy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;

public class FoodRebateDaoImpl implements CommodityDao {

    @Override
    public void Selling(Commodity commodity) {
        if (200 <= commodity.getPrice()) {
            System.out.println(CommodityType.getName(commodity.getType())
                    + "Purchase 200 reduced by 100£¬ total price£º"
                    + (commodity.getPrice() - 100));
        } else {
            System.out.println(CommodityType.getName(commodity.getType())
                    + ",total price£º" + commodity.getPrice());
        }
    }

}
