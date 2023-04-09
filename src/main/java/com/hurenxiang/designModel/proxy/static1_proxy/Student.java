package com.hurenxiang.designModel.proxy.static1_proxy;

public class Student implements Person {

    @Override
    public void wakeup() {
        System.out.println("学生们起床啦~~~");
    }

    @Override
    public void sleep() {
        System.out.println("学生们睡觉啦~~~");
    }
}
