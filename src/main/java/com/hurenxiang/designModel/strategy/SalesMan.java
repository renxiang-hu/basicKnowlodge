package com.hurenxiang.designModel.strategy;

import com.hurenxiang.designModel.strategy.service.Strategy;

public class SalesMan {

    private Strategy strategy;

    public SalesMan(Strategy strategy){
        this.strategy = strategy;
    }

    public void salesManShow(){
        strategy.show();
    }
}
