package com.strategy.entity;

import java.util.Map;
import java.util.TreeMap;

//��Ʒ����
public class CommodityType {

    private static Map<Object, String> staticMap = null;

    // ��ȡ����
    public static String getName(int id) {
        if (staticMap == null)
            init();
        return staticMap.get(id) == null ? "δ֪" : staticMap.get(id);
    }

    public static void init() {
        staticMap = new TreeMap<Object, String>();
        staticMap.put(1, "ͼ����");
        staticMap.put(2, "ʳƷ��");
        staticMap.put(3, "������");
        staticMap.put(4, "�ջ���");
    }
}
