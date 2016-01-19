package com.strategy.main;

import com.strategy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.logicprocessing.SimpleFactoryControl;

public class Shopping {

    public static void main(String[] args) {

        Commodity commodity = new Commodity();
        commodity.setPrice(250); // 价格
        commodity.setType(1);// 类型 1，图书类 2，水果类，3电器类，4 日化类
        CommodityDao commdit = SimpleFactoryControl.Selling(commodity);
        commdit.Selling(commodity);
    }
}
