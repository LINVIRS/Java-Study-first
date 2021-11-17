package com.wl.ioTest;

import java.io.File;

/**
 * @program: java-io
 * @description: 绝对路径和相对路径
 * @author: wanglin
 * @create: 2021-11-15 20:12
 **/
public class FilePath {
    public static void main(String[] args) {
        // 桌面的hello.txt文件
        File f = new File(PathConstant.ABSOLUTE_PATH_IOTEST+"hello.txt");
        System.out.println(f.getAbsolutePath());

        // 项目下的bbb.java文件
        File f2 = new File(PathConstant.ABSOLUTE_PATH_IOTEST+"bbb.java");
        System.out.println(f2.getAbsolutePath());

    }

}
