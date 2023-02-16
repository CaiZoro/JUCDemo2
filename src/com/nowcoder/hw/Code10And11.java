package com.nowcoder.hw;

import java.util.Scanner;

/**
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 */
public class Code10And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String str = sc.nextLine();
        for (int i = str.length()-1;i>=0;i--){
            sb.append(String.valueOf(str.charAt(i)));
        }
        System.out.println(sb);
    }
}
