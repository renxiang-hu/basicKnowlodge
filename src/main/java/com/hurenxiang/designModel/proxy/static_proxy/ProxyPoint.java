package com.hurenxiang.designModel.proxy.static_proxy;

/**
 * 代售点类
 */
public class ProxyPoint implements SellTickets{

    //声明火车站类对象
    private TrainStation trainStation;

    public ProxyPoint(TrainStation trainStation){
        this.trainStation = trainStation;
    }

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        trainStation.sell();
    }
}
