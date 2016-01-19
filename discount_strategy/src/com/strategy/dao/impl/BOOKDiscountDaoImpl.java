package com.strategy.dao.impl;

import com.strategy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.entity.CommodityType;

//ͼ������
public class BOOKDiscountDaoImpl implements CommodityDao {

    @Override
    public void Selling(Commodity commodity) {
        System.out.println(CommodityType.getName(commodity.getType())
                + "����ۣ��ܼۣ�" + (commodity.getPrice() * 0.9));
    }

}
