package com.hurenxiang.designModel.Duty.dutyDemo;

public class SecondPassHandler extends AbstractHandler {

    private int play() {
        return 90;
    }

    @Override
    public int handler() {
        System.out.println("第二关SecondPassHandler");
        int score = play();
        if (score >= 90) {
            if (this.next != null) {
                return this.next.handler();
            }
        }
        return score;
    }
}
