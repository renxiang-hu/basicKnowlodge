package com.hurenxiang.designModel.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        //获得代理对象
        //1.创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //2.使用factory对象的方法获得代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        //3.调用方法
        proxyObject.sell();
    }
}
