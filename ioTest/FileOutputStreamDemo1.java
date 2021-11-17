package com.wl.ioTest;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java-io
 * @description: 字节输出流练习————写出字节数据
 * @author: wanglin
 * @create: 2021-11-16 14:54
 **/
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream(PathConstant.ABSOLUTE_PATH_IOTEST+"fos.txt");
        // 写出数据
        // 写出第一个字节
        fos.write(97);
        // 写出第二个字节
        fos.write(98);
        // 写出第三个字节
        fos.write(99);
        // 关闭资源
        fos.close();
    }
}
