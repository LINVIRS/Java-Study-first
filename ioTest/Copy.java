package com.wl.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java-io
 * @description: 文件复制、
 * @author: wanglin
 * @create: 2021-11-16 15:59
 **/
public class Copy {
    public static void main(String[] args) throws IOException {
        // 1.创建流对象
        // 1.1 指定数据源
        FileInputStream fis = new FileInputStream(PathConstant.COPY_IMAGES_PATH);

        // 1.2 指定目的地
        FileOutputStream fos = new FileOutputStream(PathConstant.COPY_IMAGES_DES_PATH);

        // 2. 读写数据
        // 2.1 定义数组
        byte[] b = new byte[1024];
        // 2.2 定义长度
        int len;
        // 2.3 循环读取
        while ((len = fis.read(b))!= -1) {
             // 2.4 写出数据
            fos.write(b, 0, len);
        }

        // 3. 关闭资源
        fos.close();;
        fis.close();
    }
}
