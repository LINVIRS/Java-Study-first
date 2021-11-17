package com.wl.ioTest;

import java.io.File;

/**
 * @program: java-io
 * @description: File类的判断方法
 * @author: wanglin
 * @create: 2021-11-15 20:19
 **/
public class FileJudgeMethods {
    public static void main(String[] args) {
        File f = new File(PathConstant.ABSOLUTE_PATH_IOTEST+"bbb.java");
        File f2 = new File(PathConstant.ABSOLUTE_PATH);
        // 判断是否存在
        System.out.println(PathConstant.ABSOLUTE_PATH_IOTEST+"bbb.java 是否存在" + f.exists());
        System.out.println(PathConstant.ABSOLUTE_PATH+" 是否存在" + f2.exists());
        // 判断是文件还是目录
        System.out.println(PathConstant.ABSOLUTE_PATH+"是文件?:" + f2.isFile());
        System.out.println(PathConstant.ABSOLUTE_PATH+" 是目录?:" + f2.isDirectory());


    }
}
