package com.nowcoder.hw;

import java.util.Locale;
import java.util.Scanner;

/**
 * 计算第二行
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String ch = sc.nextLine();
            int count  = 0;
            for (int i=0;i<str.length();i++)
            {
                if (ch.toLowerCase().equals(String.valueOf(str.charAt(i))) || ch.toUpperCase().equals(String.valueOf(str.charAt(i)))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
