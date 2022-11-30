package com.hurenxiang.basicKnowlodge;

import java.util.Arrays;
import java.util.HashMap;

public class arrayCopyTest {
    public static void main(String[] args) {
        int[] origin = {1,2,4};
        int[] t = new int[8];
        System.arraycopy(origin,0,t,4,2);
        System.out.println(Arrays.toString(t));
    }
}
