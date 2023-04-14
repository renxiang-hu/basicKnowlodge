package com.hurenxiang.designModel.Duty.dutyDemo2;

public abstract class Handler {

    public Handler next;

    public void setNext(Handler next){
        this.next = next;
    }

    public abstract int handlerVal(int count);
}
