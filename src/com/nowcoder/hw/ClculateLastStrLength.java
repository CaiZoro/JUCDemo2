package com.nowcoder.hw;

import java.util.Scanner;
/**
 * 计算以空格为分隔符的最后字符串长度
 */
public class ClculateLastStrLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        if(str.length()<=5000){
            System.out.println(strs[strs.length-1].length());
        }
    }
}
