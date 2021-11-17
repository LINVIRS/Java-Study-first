package com.wl.ioTest;

import java.io.File;
import java.io.FileFilter;
import java.util.Objects;

/**
 * @program: java-io
 * @description: 目录遍历
 * @author: wanglin
 * @create: 2021-11-16 13:54
 **/
public class PrintDir {
    public static void main(String[] args) {
        // 创建File对象
        File dir = new File(PathConstant.ABSOLUTE_PATH_IOTEST);
        // 调用打印目录方法
        printDir(dir);
    }

    public static void printDir(File dir) {
        System.out.println(dir);
        // 获取子文件和目录
        File[] files = dir.listFiles();
        // 循环打印
        for (File file : Objects.requireNonNull(files)) {
            // 判断是文件，直接输出
            if (file.isFile()) {
                System.out.println(file);
            } else {
                // 是目录，继续遍历，形成递归
                printDir(file);
            }
        }
    }
}
