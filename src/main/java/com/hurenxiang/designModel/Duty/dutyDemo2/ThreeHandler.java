package com.hurenxiang.designModel.Duty.dutyDemo2;

public class ThreeHandler extends Handler{

    @Override
    public int handlerVal(int count) {
        if (count < 15 && count > 10){
            System.out.println("完成了第三个任务");
        } else {
            System.out.println(".......");
        }
        return count;
    }
}
