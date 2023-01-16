package com.hurenxiang.designModel.proxy.staticProxyTest;

public class Client {
    public static void main(String[] args) {
        StaticProxyHandler staticProxyHandler = new StaticProxyHandler(new ToBeProxyedService1());
        staticProxyHandler.addUser("1111","张三");
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler();
        ToBeProxyInterface service = (ToBeProxyInterface)dynamicProxyHandler.newProxyInstance(new ToBeProxyedService1());
        service.delUser("111");
    }
}
