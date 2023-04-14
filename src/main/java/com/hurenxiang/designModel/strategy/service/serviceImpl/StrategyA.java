package com.hurenxiang.designModel.strategy.service.serviceImpl;

import com.hurenxiang.designModel.strategy.service.Strategy;

public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("A促销 买一送一");
    }
}
