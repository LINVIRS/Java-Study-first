package com.wl.ioTest;

import java.io.File;
import java.util.Objects;

/**
 * @program: java-io
 * @description: File类目录遍历方法
 * @author: wanglin
 * @create: 2021-11-15 21:50
 **/
public class ListFile {
    public static void main(String[] args) {
        File dir = new File(PathConstant.ABSOLUTE_PATH);
        // 获取当前目录下的文件以及文件夹对象，通过文件对象可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}
