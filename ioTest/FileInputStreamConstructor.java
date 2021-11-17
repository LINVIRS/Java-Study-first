package com.wl.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: java-io
 * @description: FileInputStream类构造方法
 * @author: wanglin
 * @create: 2021-11-16 15:21
 **/
public class FileInputStreamConstructor {
    public static void main(String[] args) throws IOException {
        // 使用File对象创建流对象，文件file会报异常
        File file = new File(PathConstant.ABSOLUTE_PATH_IOTEST+"read.txt");
        FileInputStream fos = new FileInputStream(file);

        // 使用文件名称创建流对象
        FileInputStream fos1 = new FileInputStream(PathConstant.ABSOLUTE_PATH_IOTEST+"read.txt");
    }
}
