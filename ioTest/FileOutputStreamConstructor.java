package com.wl.ioTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java-io
 * @description:
 * @author: wanglin
 * @create: 2021-11-16 14:49
 **/
public class FileOutputStreamConstructor {
    public static void main(String[] args) throws IOException {
        // 使用File对象创建流对象
        File file = new File(PathConstant.ABSOLUTE_PATH_IOTEST+"a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        // 使用文件名称创建流对象
        //FileOutputStream fos = new FileOutputStream("b.txt");
    }
}

