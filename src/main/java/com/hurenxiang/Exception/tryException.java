package com.hurenxiang.Exception;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

public class tryException {
    public static void main(String[] args) {
        try {
            readFile("d://a.tx");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀不对");
        }
    }
}
