package com.strategy.main;

import com.strategy.dao.CommodityDao;
import com.strategy.entity.Commodity;
import com.strategy.logicprocessing.SimpleFactoryControl;

public class Shopping {

    public static void main(String[] args) {

        Commodity commodity = new Commodity();
        commodity.setPrice(250); // �۸�
        commodity.setType(1);// ���� 1��ͼ���� 2��ˮ���࣬3�����࣬4 �ջ���
        CommodityDao commdit = SimpleFactoryControl.Selling(commodity);
        commdit.Selling(commodity);
    }
}
