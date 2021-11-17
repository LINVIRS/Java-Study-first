package com.wl.ioTest;

import java.io.File;

/**
 * @program: java-io
 * @description: File类的获取方法
 * @author: wanglin
 * @create: 2021-11-15 19:42
 **/
public class FileGetMethods {
    public static void main(String[] args) {
        File f = new File(PathConstant.FILE_GET_METHOD);
        System.out.println("文件绝对路径:" + f.getAbsolutePath());
        System.out.println("文件构造路径:" + f.getPath());
        System.out.println("文件名称:" + f.getName());
        System.out.println("文件长度:" + f.length() + "字节");
        System.out.println("文件路径的父路径:" + f.getParentFile());

        File f2 = new File(PathConstant.ABSOLUTE_PATH);
        System.out.println("目录绝对路径:" + f2.getAbsolutePath());
        System.out.println("目录构造路径:" + f2.getPath());
        System.out.println("目录名称:" + f2.getName());
        System.out.println("目录长度:" + f2.length());
        System.out.println("目录父路径:" + f2.getParentFile());
    }
}
