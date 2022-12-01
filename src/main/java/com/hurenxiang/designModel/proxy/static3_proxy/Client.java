package com.hurenxiang.designModel.proxy.static3_proxy;

public class Client {
    public static void main(String[] args) {
        HttpUtil httpUtil = new HttpUtil();
        HttpProxy httpProxy = new HttpProxy(httpUtil);
        httpProxy.request("request data");
        httpProxy.onSuccess("received result");
    }
}
