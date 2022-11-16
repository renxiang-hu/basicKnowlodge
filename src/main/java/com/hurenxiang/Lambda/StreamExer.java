package com.hurenxiang.Lambda;

import com.hurenxiang.Lambda.dao.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExer {

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        User user = new User(1, "胡仁祥", 30, "上海");
        User user1 = new User(2, "蔡瑶", 29, "无锡");
        User user2 = new User(3, "胡仁祥1", 31, "上海");
        User user3 = new User(4, "胡仁祥2", 32, "苏州");

        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);

        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(User::getId, User::getName));

//        String collect = list.stream().map(User::getName).collect(Collectors.joining(","));

//        List<User> collect = list.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());

//        List<User> collect = list.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
//        boolean b = list.stream().allMatch(user5 -> user5.getAge() >= 20);
//        boolean b = list.stream().anyMatch(user4 -> "胡仁祥".equals(user4.getName()));
//        User user4 = list.stream().findAny().orElse(null);
//        List<String> collect = list.stream().findFirst().orElse(null);

        System.out.println(collect);
    }
}
