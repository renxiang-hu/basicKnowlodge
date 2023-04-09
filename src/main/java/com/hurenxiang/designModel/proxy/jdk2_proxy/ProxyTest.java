package com.hurenxiang.designModel.proxy.jdk2_proxy;

public class ProxyTest {
    public static void main(String[] args) {
        proxyHandler proxyHandler = new proxyHandler(new BuyHouseImpl());
        BuyHouse buyHouse = (BuyHouse) proxyHandler.getProxy();
        buyHouse.buyHouse();
    }
}
