package com.wl.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program: java-io
 * @description: 使用循环改进字节读取
 * @author: wanglin
 * @create: 2021-11-16 15:46
 **/
public class ReadByLoop {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream(PathConstant.ABSOLUTE_PATH_IOTEST+"read.txt");
        // 定义变量，保存数据
        int b = 0;
        // 循环读取
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        // 关闭资源
        fis.close();
    }
}
