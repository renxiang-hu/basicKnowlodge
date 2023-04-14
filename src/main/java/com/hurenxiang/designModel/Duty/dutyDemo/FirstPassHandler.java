package com.hurenxiang.designModel.Duty.dutyDemo;

public class FirstPassHandler extends AbstractHandler {

    private int play() {
        return 80;
    }

    @Override
    public int handler() {
        System.out.println("第一关FirstPassHandler");
        int score = play();
        if (score >= 80) {
            if (next != null) {
                return this.next.handler();
            }
        }
        return score;
    }
}
