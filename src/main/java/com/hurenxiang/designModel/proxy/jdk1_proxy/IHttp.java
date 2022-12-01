package com.hurenxiang.designModel.proxy.jdk1_proxy;

public interface IHttp {
    void request(String sendData);
    void onSuccess(String reveivedData);
}
