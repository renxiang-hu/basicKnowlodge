package com.hurenxiang.designModel.Duty.dutyDemo2;

public class TwoHandler extends Handler{

    @Override
    public int handlerVal(int count) {
        if (count >= 3 && count <= 10){
            System.out.println("完成了第二个任务");
        } else {
            if (next != null){
                next.handlerVal(count);
            }
        }
        return count;
    }
}
