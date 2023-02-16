package com.nowcoder.hw;

import java.util.Scanner;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class Code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        StringBuffer sb = new StringBuffer();
        if (str.length==1){
            System.out.println(sb.append(str[0]));
        }else{
            for (int i = str.length-1;i>=0;i--){
                sb.append(str[i]+" ");
            }
        }
        System.out.println(sb);
    }
}
