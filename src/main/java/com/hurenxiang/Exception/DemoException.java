package com.hurenxiang.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoException {
    public static void main(String[] args){
        //Exception : 编译时异常，进行编译(写代码)，java程序出现的问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = sdf.parse("1992-1-22");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(parse);
    }
}
