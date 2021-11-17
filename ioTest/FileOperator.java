package com.wl.ioTest;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: java-io
 * @description: 文件操作练习
 * @author: wanglin
 * @create: 2021-11-15 20:42
 **/
public class FileOperator {
    /**
     * 判断文件是否存在
     *
     * @param pathname 文件路径
     * @return 判断结果
     */
    public static boolean isExist(String pathname) {
        File file = new File(pathname);
        return file.exists();
    }

    /**
     * 创建目录
     *
     * @param pathname 目录路径
     * @return 创建结果
     */
    public static boolean createDir(String pathname) {
        File file = new File(pathname);
        if (!file.exists()) {
            return file.mkdirs();
        }
        return false;
    }

    /**
     * 创建文件
     *
     * @param pathname 文件路径
     * @return 创建结果
     */
    public static boolean createFile(String pathname) throws IOException {
        File file = new File(pathname);
        if (!file.exists()) {
            return file.createNewFile();
        }
        return false;
    }

    public static Properties getFileInfo(File file) {
        String fileName = file.getName();
        String filepath = file.getPath();
        String parentDir = file.getParent();
        long fileLength = file.length();
        Properties properties = new Properties();
        properties.setProperty("fileName", fileName);
        properties.setProperty("filePath" ,filepath);
        properties.setProperty("parentDir", parentDir);
        properties.setProperty("fileLength", String.valueOf(fileLength));
        return properties;
    }

    /**
     * 删除文件
     *
     * @param pathname 文件路径
     * @return 删除结果
     */
    public static boolean deleteFile(String pathname) {
        File file = new File(pathname);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }
}
