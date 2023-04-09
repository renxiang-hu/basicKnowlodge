package com.hurenxiang.basicKnowlodge;

public class continueTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 5) {
                continue;
            }
            System.out.println("输出结果：" + numbers[i]);
        }
    }
}
