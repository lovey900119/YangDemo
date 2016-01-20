package com.strategy.dao.impl;

import com.strategy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;

//book Hit ten percent off, total price
public class BookDiscountDaoImpl implements CommodityDao {

    @Override
    public void Selling(Commodity commodity) {
        System.out.println(CommodityType.getName(commodity.getType())
            + "打九折, 总价：" + (commodity.getPrice() * 0.9));
    }

}
