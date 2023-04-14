package com.hurenxiang.designModel.strategy.service.serviceImpl;

import com.hurenxiang.designModel.strategy.service.Strategy;

public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("C促销 满500元可兑换小礼品");
    }
}
