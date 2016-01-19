package com.strategy.dao.impl;

import com.strategy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;

public class CommodityOrdinaryDaoImpl implements CommodityDao {

    @Override
    public void Selling(Commodity commodity) {
        System.out.println(CommodityType.getName(commodity.getType())
                + "Normal price, lump sum;" + commodity.getPrice());

    }

}
