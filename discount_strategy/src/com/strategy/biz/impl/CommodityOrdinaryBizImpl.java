package com.strategy.biz.impl;

import com.strategy.biz.CommodityBiz;
import com.strategy.entity.Commodity;

public class CommodityOrdinaryBizImpl implements CommodityBiz {

    @Override
    public void Selling(Commodity commodity) {
        System.out.println(commodity.getType().getName() + "正常价格,总价：;"
            + commodity.getPrice());
    }

}
