package com.strategy.main;

import com.strategy.context.SimpleFactoryControl;
import com.strategy.dao.CommodityDao;
import com.strategy.entity.Commodity;

public class Shopping {

    public static void main(String[] args) {

        Commodity commodity = new Commodity();
        commodity.setPrice(250); // 价格
        commodity.setType(1);// 类型
        CommodityDao commdit = SimpleFactoryControl.Selling(commodity);
        commdit.Selling(commodity);
    }
}
