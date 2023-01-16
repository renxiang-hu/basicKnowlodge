package com.hurenxiang.designModel.proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory(new TrainStation());
        //获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用sell方法
        proxyObject.sell();
    }
}
