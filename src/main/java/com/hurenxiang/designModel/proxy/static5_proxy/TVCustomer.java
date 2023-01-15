package com.hurenxiang.designModel.proxy.static5_proxy;

public class TVCustomer {
    public static void main(String[] args) {
        TVProxy tvProxy = new TVProxy();
        TV tv = tvProxy.productTV();
        System.out.println(tv);
    }
}
