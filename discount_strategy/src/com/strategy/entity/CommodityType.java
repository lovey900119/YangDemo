package com.strategy.entity;

import java.util.Map;
import java.util.TreeMap;

//type
public class CommodityType {

    private static Map<Object, String> staticMap = null;

    // byName
    public static String getName(int id) {
        if (staticMap == null)
            init();
        return staticMap.get(id) == null ? "err" : staticMap.get(id);
    }

    public static void init() {
        staticMap = new TreeMap<Object, String>();
        staticMap.put(1, "图书类");
        staticMap.put(2, "食品类");
        staticMap.put(3, "生活类");
        staticMap.put(4, "蔬菜类");
    }
}
