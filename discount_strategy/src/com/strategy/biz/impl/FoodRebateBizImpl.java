package com.strategy.biz.impl;

import com.strategy.biz.CommodityBiz;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;
import com.strategy.entity.CommodityTypeDiscount;

public class FoodRebateBizImpl implements CommodityBiz {

    @Override
    public void Selling(Commodity commodity) {
        CommodityTypeDiscount com = new CommodityTypeDiscount();
        com = CommodityTypeDiscount.getCommodityTypeDiscount(commodity
            .getType().getId());

        if (200 <= commodity.getPrice()) {
            System.out.println(commodity.getType().getName()
                + "满"
                + com.getCommodityPrice()
                + CommodityTypeDiscount.getdiscountTypeMap(com.getDiscountType())
                + com.getDiscount() + ", 总价："
                + (commodity.getPrice() - com.getDiscount()));
        } else {
            System.out.println(CommodityType.getName(commodity.getType().getId())
                + ",总价：" + commodity.getPrice());
        }
    }
}
