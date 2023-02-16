package com.nowcoder.hw;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是 0 。
 */
public class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        int len = str.length();
        Set<String> sets = new LinkedHashSet<>();
        for (int i = len-1;i>=0;i--){
            if (!sets.contains(String.valueOf(str.charAt(i)))){
                sets.add(String.valueOf(str.charAt(i)));
            }
        }
        for (String s:sets){
            sb.append(s);
        }
        System.out.println(sb);
    }
}
