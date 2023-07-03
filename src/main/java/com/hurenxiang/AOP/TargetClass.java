package com.hurenxiang.AOP;

import org.springframework.stereotype.Component;

@Component
public class TargetClass {

    public String executeMethod(String arg1,String arg2){
        System.out.println("TargetClass类的executeMethod方法执行了！"+"arg1="+arg1+"，arg2="+arg2);
        int i = 1/0;
        return "renxiang";
    }
}
