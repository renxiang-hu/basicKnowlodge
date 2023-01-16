package com.hurenxiang.designModel.proxy.static6_proxy;

public class TVFactory implements TVCompany{
    @Override
    public TV productTV() {
        System.out.println("工厂正在生产商品");
        return new TV("华为手机","上海市");
    }
}
