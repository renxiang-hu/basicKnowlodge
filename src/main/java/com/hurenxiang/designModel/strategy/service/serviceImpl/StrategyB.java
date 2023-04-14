package com.hurenxiang.designModel.strategy.service.serviceImpl;

import com.hurenxiang.designModel.strategy.service.Strategy;

public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("B促销 满100减20");
    }
}
