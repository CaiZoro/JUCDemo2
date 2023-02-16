package com.nowcoder.hw;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整。
 *
 * 数据范围：保证输入的数字在 32 位浮点数范围内
 */
public class Code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f= sc.nextFloat();
        String str = String.valueOf(f);
        String[] strs = str.split("\\.");
        int n;
        if (Float.valueOf("0."+strs[1]) >= 0.5){
            n = Integer.valueOf(strs[0])+1;
        }else {
            n = Integer.valueOf(strs[0]);
        }
        System.out.println(n);
    }
}
