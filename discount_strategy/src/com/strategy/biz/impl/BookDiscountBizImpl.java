package com.strategy.biz.impl;

import com.strategy.biz.CommodityBiz;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityTypeDiscount;

//book Hit ten percent off, total price
public class BookDiscountBizImpl implements CommodityBiz {

    @Override
    public void Selling(Commodity commodity) {
        CommodityTypeDiscount com = new CommodityTypeDiscount();
        com = CommodityTypeDiscount.getCommodityTypeDiscount(commodity.getType().getId());
        
        if (com.getCommodityPrice() <= commodity.getPrice()) {
            System.out.println(commodity.getType().getName() + "满"
                + com.getCommodityPrice()
                + CommodityTypeDiscount.getdiscountTypeMap(com.getDiscountType())
                + com.getDiscount() * 10 + "折, 总价："
                + (commodity.getPrice() * com.getDiscount()));
        } else {
            System.out.println(commodity.getType().getName() + "总价："
                    + commodity.getPrice());
        }
    }

}
