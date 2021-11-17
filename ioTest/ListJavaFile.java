package com.wl.ioTest;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TransferQueue;

/**
 * @program: java-io
 * @description: 目录遍历搜索java文件
 * @author: wanglin
 * @create: 2021-11-16 14:02
 **/
public class ListJavaFile {
    public static void main(String[] args) {
        // 创建File对象
        File dir = new File(PathConstant.ABSOLUTE_PATH);
        // 调用打印目录方法
        printDir(dir);
    }

    private static void printDir(File dir) {
        // 获取子文件和目录
        File[] files = dir.listFiles(pathname -> {
            if (pathname.isDirectory()) {
                return true;
            }
            return pathname.getName().toLowerCase().endsWith("java");
        });
        System.out.println(Arrays.toString(files));
        for (File file : Objects.requireNonNull(files)) {
            if (file.isFile()) {
                System.out.println(file);

            } else {
                // 是ml，继续遍历，形成递归
                printDir(file);
            }
        }
    }
}
