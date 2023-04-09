package com.hurenxiang.Lambda;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(2);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < list.size() ; i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        Collections.sort(list,(a,b)->{
            int cn1 = map.get(a);
            int cn2 = map.get(b);
            return cn1 != cn2 ? cn1 - cn2 : a - b;
        });
        list.stream().forEach(System.out::println);
    }
}
