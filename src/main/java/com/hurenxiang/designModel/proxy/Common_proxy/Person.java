package com.hurenxiang.designModel.proxy.Common_proxy;

public class Person implements IPerson {

    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉觉");
    }
}
