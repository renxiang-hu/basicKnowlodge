package com.hurenxiang.designModel.proxy.static5_proxy;

public class TVFactory implements TVCompany{
    @Override
    public TV productTV(){
        System.out.println("TV factory product TV......");
        return new TV("小米电视机","合肥");
    }
}
