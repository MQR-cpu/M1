package com.imooc.miaoshaproject.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class iterator {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> tem = iterator.next();
            System.out.println(tem.getKey()+"-------"+tem.getValue());
        }
        LinkedHashMap<Integer, String> a = new LinkedHashMap<>();

    }
}
