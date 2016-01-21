package com.strategy.main;

import com.strategy.biz.CommodityBiz;
import com.strategy.context.Composition;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;

public class Shopping {

    public static void main(String[] args) {

        double Price = 200;
        int type = 1; // 1, "图书类";2, "食品类";3, "生活类";4, "蔬菜类"

        Commodity commodity = new Commodity();
        commodity.setPrice(Price);
        commodity.setType(new CommodityType(type, CommodityType.getName(type)));
        CommodityBiz commdit = Composition.selling(commodity);
        commdit.Selling(commodity);

    }

}
