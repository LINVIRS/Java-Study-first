package com.wl.ioTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java-io
 * @description: 字节输出流练习————写出字节数组
 * @author: wanglin
 * @create: 2021-11-16 15:01
 **/
public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream(PathConstant.ABSOLUTE_PATH_IOTEST+"fos.txt");
        // 字符串转换为字节数组
        byte[] b = "abcdef".getBytes();
        // 写出字节数组数据
        fos.write(b);
        // 关闭资源
        fos.close();
     }
}
