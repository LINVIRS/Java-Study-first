package com.wl.ioTest;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java-io
 * @description: IO流异常处理
 * @author: wanglin
 * @create: 2021-11-16 15:55
 **/
public class Exception {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos.write(100);
        } catch (IOException |NullPointerException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (fos!=null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
