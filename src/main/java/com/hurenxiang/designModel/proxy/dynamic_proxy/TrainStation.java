package com.hurenxiang.designModel.proxy.dynamic_proxy;

/**
 * 火车站类
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票~~~");
    }
}
