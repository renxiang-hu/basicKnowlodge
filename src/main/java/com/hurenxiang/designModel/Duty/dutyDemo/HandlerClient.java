package com.hurenxiang.designModel.Duty.dutyDemo;

public class HandlerClient {
    public static void main(String[] args) {
        FirstPassHandler firstPassHandler = new FirstPassHandler();
        SecondPassHandler secondPassHandler = new SecondPassHandler();
        ThirdPassHandler thirdPassHandler = new ThirdPassHandler();

        firstPassHandler.setNext(secondPassHandler);
        secondPassHandler.setNext(thirdPassHandler);

        firstPassHandler.handler();
    }
}
