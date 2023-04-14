package com.hurenxiang.designModel.strategy;

import com.hurenxiang.designModel.strategy.service.serviceImpl.StrategyA;
import com.hurenxiang.designModel.strategy.service.serviceImpl.StrategyB;
import com.hurenxiang.designModel.strategy.service.serviceImpl.StrategyC;

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("======================");
        SalesMan salesMan1 = new SalesMan(new StrategyB());
        salesMan1.salesManShow();
        System.out.println("======================");
        SalesMan salesMan2 = new SalesMan(new StrategyC());
        salesMan2.salesManShow();
    }
}
