package com.strategy.entity;

import java.util.Map;
import java.util.TreeMap;

//商品类型
public class CommodityType {

    private static Map<Object, String> staticMap = null;

    // 获取名称
    public static String getName(int id) {
        if (staticMap == null)
            init();
        return staticMap.get(id) == null ? "未知" : staticMap.get(id);
    }

    public static void init() {
        staticMap = new TreeMap<Object, String>();
        staticMap.put(1, "图书类");
        staticMap.put(2, "食品类");
        staticMap.put(3, "电器类");
        staticMap.put(4, "日化类");
    }
}
