package com.hurenxiang.designModel.Duty.dutyDemo;

public class ThirdPassHandler extends AbstractHandler {

    private int play() {
        return 95;
    }

    @Override
    public int handler() {
        System.out.println("第二关ThirdPassHandler");
        int score = play();
        if (score >= 95) {
            if (this.next != null) {
                return this.next.handler();
            }
        }
        return score;
    }
}
