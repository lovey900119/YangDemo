package com.strategy.entity;

import java.util.Map;
import java.util.TreeMap;

//type
public class CommodityType {

    private int id;
    private String name;

    private static Map<Object, String> staticMap = null;

    public CommodityType() {}
    
    public CommodityType(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
