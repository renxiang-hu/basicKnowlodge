package com.hurenxiang.designModel.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        //创建代售点类对象
        ProxyPoint proxyPoint = new ProxyPoint(new TrainStation());
        //调用方法进行买票
        proxyPoint.sell();
    }
}
