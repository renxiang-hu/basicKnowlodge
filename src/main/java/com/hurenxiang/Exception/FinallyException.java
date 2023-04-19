package com.hurenxiang.Exception;

import java.io.IOException;

public class FinallyException {
    public static void main(String[] args) {
        try {
            readFile("d://a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("后续代码");
        }
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀不对");
        }
    }
}
