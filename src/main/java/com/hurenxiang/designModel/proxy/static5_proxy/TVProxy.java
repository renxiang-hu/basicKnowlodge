package com.hurenxiang.designModel.proxy.static5_proxy;

import java.util.Objects;

public class TVProxy implements TVCompany{

    private TVCompany tvCompany;

    public TVProxy(){}

    @Override
    public TV productTV(){
        System.out.println("TV proxy get order......");
        System.out.println("TV proxy start product......");
        if (Objects.isNull(tvCompany)){
            System.out.println("machine proxy find factory......");
            tvCompany = new TVFactory();
        }
        return tvCompany.productTV();
    }
}
