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
        staticMap.put(1, "book");
        staticMap.put(2, "food");
        staticMap.put(3, "appliance");
        staticMap.put(4, "Vegetables");
    }
}
