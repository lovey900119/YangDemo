package com.strategy.entity;

import java.util.Map;
import java.util.TreeMap;

//类型折扣
public class CommodityTypeDiscount {

    private int typeId; // 产品类型id
    private int discountType; // 折扣类型 1.减免 2.打折
    private double commodityPrice; // 符合折扣的金额
    private double discount; // 折扣力度

    private static Map<Object, CommodityTypeDiscount> staticMap = null;

    private static Map<Object, String> discountTypeMap = null;

    public CommodityTypeDiscount() {
    }

    public CommodityTypeDiscount(int typeId, int discountType,
            double commodityPrice, double discount) {

        this.typeId = typeId;
        this.discountType = discountType;
        this.commodityPrice = commodityPrice;
        this.discount = discount;

    }

    // byCommodityTypeDiscount
    public static CommodityTypeDiscount getCommodityTypeDiscount(int id) {
        if (staticMap == null)
            init();
        return (CommodityTypeDiscount) (staticMap.get(id) == null ? "err"
            : staticMap.get(id));
    }

    // byDiscountType
    public static String getdiscountTypeMap(int id) {
        if (discountTypeMap == null)
            discountTypeinit();
        return (String) (discountTypeMap.get(id) == null ? "err"
            : discountTypeMap.get(id));
    }
    //数据模拟
    public static void init() {

        staticMap = new TreeMap<Object, CommodityTypeDiscount>();
        staticMap.put(1, new CommodityTypeDiscount(1, 2, 300, 0.9));
        staticMap.put(2, new CommodityTypeDiscount(2, 1, 200, 100));

    }
    //数据模拟
    public static void discountTypeinit() {

        discountTypeMap = new TreeMap<Object, String>();
        discountTypeMap.put(1, "减免");
        discountTypeMap.put(2, "打折");

    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getDiscountType() {
        return discountType;
    }

    public void setDiscountType(int discountType) {
        this.discountType = discountType;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

}
