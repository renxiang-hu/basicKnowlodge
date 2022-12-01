package com.hurenxiang.designModel.proxy.static1_proxy;

public class Client {
    public static void main(String[] args) {
        PersonProxy proxy = new PersonProxy();
        proxy.wakeup();
        proxy.sleep();
    }
}
