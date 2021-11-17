package com.wl.ioTest;

import java.io.File;

/**
 * @program: java-io
 * @description: File类的构造方法
 * @author: wanglin
 * @create: 2021-11-15 18:56
 **/
public class FileConstructor {
    public static void main(String[] args) {
        // 文件路径名
        String pathname = PathConstant.AAA_TXT_PATH;
        File  file1 = new File(pathname);
        System.out.println(file1);
        // 通过父路径和子路径字符串
        String parent = PathConstant.ABSOLUTE_PATH+"aaa";
        String child1 = PathConstant.ABSOLUTE_PATH+"bbb.txt";
        File file2 = new File(parent,child1);
        System.out.println(file2);
        // 通过父级File对象和子路径字符串
        File parentDir = new File(PathConstant.ABSOLUTE_PATH+"aaa");
        String child2 = PathConstant.ABSOLUTE_PATH+"bbb.txt";
        File file3 = new File(parentDir, child2);
        System.out.println(file3);
    }
}
