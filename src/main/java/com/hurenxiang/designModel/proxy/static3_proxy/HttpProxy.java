package com.hurenxiang.designModel.proxy.static3_proxy;

public class HttpProxy implements IHttp{

    private HttpUtil httpUtil;

    public HttpProxy(HttpUtil httpUtil){
        this.httpUtil = httpUtil;
    }

    @Override
    public void request(String sendData) {
        httpUtil.request(sendData);
    }

    @Override
    public void onSuccess(String reveivedData) {
        httpUtil.onSuccess(reveivedData);
    }
}
