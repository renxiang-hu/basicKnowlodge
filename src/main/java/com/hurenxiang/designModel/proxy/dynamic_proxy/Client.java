package com.hurenxiang.designModel.proxy.dynamic_proxy;

public class Client {
    public static void main(String[] args) {
        //1.创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory(new TrainStation());
        //2.使用factory对象的方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        //3.调用买票的方法
        proxyObject.sell();
    }
}
