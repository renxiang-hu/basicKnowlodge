package com.hurenxiang.designModel.proxy.static3_proxy;

public interface IHttp {
    void request(String sendData);

    void onSuccess(String reveivedData);
}
