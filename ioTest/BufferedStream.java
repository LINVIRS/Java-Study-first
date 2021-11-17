package com.wl.ioTest;

import java.io.*;
import java.nio.BufferUnderflowException;

/**
 * @program: java-io
 * @description: 缓冲流
 * @author: wanglin
 * @create: 2021-11-16 16:14
 **/
public class BufferedStream {
    public static void main(String[] args) throws IOException {
        // 记录开始时间
        long start = System.currentTimeMillis();

        // 创建流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(PathConstant.PATH_READ_JDK8_EXE));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(PathConstant.COPY_PATH_EXE));
        // 读写数据
        int len = 0;
        byte[] bytes = new byte[8*1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间:" + (end - start) + "毫秒");
    }
}
