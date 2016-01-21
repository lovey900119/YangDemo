package com.strategy.context;

import com.strategy.biz.CommodityBiz;
import com.strategy.biz.impl.BookDiscountBizImpl;
import com.strategy.biz.impl.CommodityOrdinaryBizImpl;
import com.strategy.biz.impl.FoodRebateBizImpl;
import com.strategy.entity.Commodity;

public class Composition {

    public static CommodityBiz selling(Commodity commodity) {
        if (commodity.getType().getId() == 1) {
            return new BookDiscountBizImpl();
        } else if (commodity.getType().getId() == 2) {
            return new FoodRebateBizImpl();
        } else {
            return new CommodityOrdinaryBizImpl();
        }
    }

}
