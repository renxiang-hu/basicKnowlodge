package com.hurenxiang.designModel.proxy.static6_proxy;

public class TVConsumer {
    public static void main(String[] args) {
        TVProxy tvProxy = new TVProxy();
        TV tv = tvProxy.productTV();
        System.out.println(tv);
    }
}
