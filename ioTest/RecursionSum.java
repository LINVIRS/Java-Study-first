package com.wl.ioTest;

/**
 * @program: java-io
 * @description: 递归求和
 * @author: wanglin
 * @create: 2021-11-16 13:40
 **/
public class RecursionSum {
    public static void main(String[] args) {
        // 计算1～num的和，使用递归完成
        int num = 5;
        // 调用求和方法
        int sum = getSum(num);
        // 输出结果
        System.out.println(sum);
    }

    /**
     * 递归算法实现
     *
     * @param num: 入参
     * @return int
     */
    private static int getSum(int num) {
        // num为1时，方法返回1，相当于是方法的出口，num总有是1的情况
        if (num == 1) {
            return 1;
        }
        // num不为1时，方法返回 num + (num-1)的累和，递归调用getSum方法
        return num + getSum(num - 1);
    }
}
