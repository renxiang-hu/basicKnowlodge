package com.hurenxiang.designModel.module;

public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("什么都不加");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
