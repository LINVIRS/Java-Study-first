package com.wl.ioTest;

import com.sun.tools.javac.Main;

import java.io.File;
import java.util.Locale;
import java.util.Objects;

/**
 * @program: java-io
 * @description: 遍历目录，获取所有的java文件
 * @author: wanglin
 * @create: 2021-11-15 22:22
 **/
public class JavaFileFilter {
    public static void main(String[] args) {
        File dir = new File(PathConstant.ABSOLUTE_PATH);
        File[] files = dir.listFiles(file -> {
            //判断如果获取到的是目录，直接放行
            if (file.isDirectory()) {
                return true;
            }
            // 获取路径中的文件名，判断是否java收尾，是就返回true
            return file.getName().toLowerCase().endsWith("java");
        });
        // 遍历files数组
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}
