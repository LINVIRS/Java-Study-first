package com.wl.ioTest;

import com.sun.jdi.ThreadReference;

import java.io.File;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: java-io
 * @description: 目录遍历搜索图片
 * @author: wanglin
 * @create: 2021-11-16 14:11
 **/
public class ListImgFile {
    private static List<File> fileList = new ArrayList<>();
    private static long size;
    private static final double UNIT = 1024.0;

    public static void main(String[] args) {
        // 创建File对象
        File dir = new File(PathConstant.ABSOLUTE_PATH_IOTEST+"img");
        // 调用遍历目录的方法，得到返回集合
        fileList = listFolder(dir);
        // 遍历集合
        fileList.forEach(System.out::println);
        // 总数
        System.out.println("一共有:" + fileList.size() + "张图片");
        // 大小(计算转换为KB、MB、GB等)
        System.out.println("总大小:" + fileSize(size));
    }

    private static List<File> listFolder(File dir) {
        // 使用文件过滤器过滤图片文件
        File[] files = dir.listFiles(file -> {
            // 是目录就放行
            if (file.isDirectory()) {
                return true;
            }
            // 是图片类型文件也放行
            return isImage(file);
        });

        // 遍历files数组
        for (File file : Objects.requireNonNull(files)) {
            // 如果file是文件
            if (file.isFile()) {
                // 将当前file的长度累加到size
                size += file.length();
                // 将当前文件加入集合
                fileList.add(file);
            } else {
                // 如果file是目录，递归遍历
                listFolder(file);
            }
        }
        return fileList;
    }

    /**
     * 判断file是否为图片类型文件
     *
     * @param file 文件对象
     * @return 判断结果
     */
    private static boolean isImage(File file) {
        String fileName = file.getName().toLowerCase();
        return fileName.endsWith("jpg") || fileName.endsWith("jpeg")
                || fileName.endsWith("png") || fileName.endsWith("gif")
                || fileName.endsWith("bmp") || fileName.endsWith("webp");
    }

    /**
     * 根据字节数换算文件大小
     *
     * @param length 字节数
     * @return String
     */
    private static String fileSize(long length) {
        DecimalFormat df = new DecimalFormat("#.00");
        double res = length / UNIT;
        if (res < 1) {
            return length + "字节";
        } else if (res < UNIT) {
            return df.format(res) + "K";
        } else if (res < UNIT * UNIT) {
            return df.format(res / UNIT) + "M";
        } else {
            return df.format(res / UNIT / UNIT) + "G";
        }
    }
}
