package com.hurenxiang.designModel.Duty.dutyDemo2;

public class Client {
    public static void main(String[] args) {
       OneHandler oneHandler = new OneHandler();
       TwoHandler twoHandler = new TwoHandler();
       ThreeHandler threeHandler = new ThreeHandler();

       oneHandler.setNext(twoHandler);
       twoHandler.setNext(threeHandler);

       oneHandler.handlerVal(13);
    }
}
