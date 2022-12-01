package com.hurenxiang.designModel.proxy.jdk1_proxy;

public class HttpUtil implements IHttp {
    @Override
    public void request(String sendData) {
        System.out.println("网络请求中...");
    }

    @Override
    public void onSuccess(String reveivedData) {
        System.out.println("网络请求完成");
    }
}
