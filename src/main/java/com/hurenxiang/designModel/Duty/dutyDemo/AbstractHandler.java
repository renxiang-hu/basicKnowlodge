package com.hurenxiang.designModel.Duty.dutyDemo;

public abstract class AbstractHandler {

    public AbstractHandler next;

    public void setNext(AbstractHandler next){
        this.next = next;
    }

    public abstract int handler();

}
