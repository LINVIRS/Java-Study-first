package com.wl.ioTest;

import com.sun.tools.javac.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java-io
 * @description: 基础流
 * @author: wanglin
 * @create: 2021-11-16 16:07
 **/
public class ElementaryStream {
    public static void main(String[] args) throws IOException {
        // 记录开始时间
        long start = System.currentTimeMillis();

        // 创建流对象
        FileInputStream fis = new FileInputStream(PathConstant.PATH_READ_JDK8_EXE);
        FileOutputStream fos = new FileOutputStream(PathConstant.COPY_PATH_EXE);

        //读写数据
        int b = 0;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:" + (end - start) + "毫秒");
    }
}
