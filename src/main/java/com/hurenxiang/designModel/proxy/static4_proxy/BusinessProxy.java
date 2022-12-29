package com.hurenxiang.designModel.proxy.static4_proxy;

public class BusinessProxy implements BuyHouse{

    private BusinessPerson businessPerson;

    public BusinessProxy(BusinessPerson businessPerson){
        this.businessPerson = businessPerson;
    }

    @Override
    public void buyHouse(){
        System.out.println("选房分析......");
        businessPerson.buyHouse();
        System.out.println("买房流程......");
    }
}
