package com.wl.ioTest;

import java.io.File;
import java.io.IOException;

/**
 * @program: java-io
 * @description: File的创建和删除方法
 * @author: wanglin
 * @create: 2021-11-15 20:34
 **/
public class FileCreateDelete {
    public static void main(String[] args) throws IOException {
        // 文件的创建
        File f = new File(PathConstant.AAA_TXT_PATH);
        System.out.println("是否存在:" + f.exists());
        System.out.println("是否创建:" + f.createNewFile());
        System.out.println("是否存在:" + f.exists());

        // 目录的创建
        File f2 = new File(PathConstant.ABSOLUTE_PATH+"newDir");
        System.out.println("是否存在:" + f2.exists());
        System.out.println("是否创建:" + f2.mkdirs());
        System.out.println("是否存在:" + f2.exists());

        // 文件的删除
        System.out.println(f.delete());

        // 目录的删除
        System.out.println(f2.delete());
    }
}
