package com.hurenxiang.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
       test();
    }

    public static void test(){
        List<String> list = new ArrayList<>();
        list.add("aa111");
        list.add("bb222");
        list.add("cc333");
        list.add("dd444");

        List<String> collect = list.stream().map((e) -> {
            e = e.substring(2);
            return e;
        }).collect(Collectors.toList());

        System.out.println(collect);
    }
}
