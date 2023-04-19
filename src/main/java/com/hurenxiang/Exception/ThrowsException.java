package com.hurenxiang.Exception;

import java.io.FileNotFoundException;

public class ThrowsException {
    public static void main(String[] args) throws FileNotFoundException {
        read("a.tx");
    }

    public static void read(String path) throws FileNotFoundException {
        if (!"a.txt".equals(path)){
            throw new FileNotFoundException("文件不存在");
        }
    }
}
