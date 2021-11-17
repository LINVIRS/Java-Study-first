package com.wl.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/**
 * @program: java-io
 * @description: 读取字节数据
 * @author: wanglin
 * @create: 2021-11-16 15:38
 **/
public class ReadByte {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream(PathConstant.ABSOLUTE_PATH_IOTEST+"read.txt");
        // 读取数据，返回一个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        // 读取到末尾，返回-1
        read = fis.read();
        System.out.println(read);
        // 关闭资源
        fis.close();
    }
}
