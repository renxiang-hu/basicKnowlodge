package com.hurenxiang.designModel.Duty.dutyDemo2;

public class OneHandler extends Handler{

    @Override
    public int handlerVal(int count) {
        if (count < 3){
            System.out.println("完成了第一个任务");
        } else {
            if (next != null){
                next.handlerVal(count);
            }
        }
        return count;
    }
}
