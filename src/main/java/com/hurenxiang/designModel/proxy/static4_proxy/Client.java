package com.hurenxiang.designModel.proxy.static4_proxy;

public class Client {
    public static void main(String[] args) {
        BusinessProxy businessProxy = new BusinessProxy(new BusinessPerson());
        businessProxy.buyHouse();
    }
}
