package com.nowcoder.hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定 n 个字符串，请对 n 个字符串按照字典序排列。
 */
public class Code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String[] strs = new String[n];
            for (int i = 0;i<n;i++){
                strs[i] = sc.next();
            }
            Arrays.sort(strs);
            for (int i = 0;i<strs.length;i++){
                System.out.println(strs[i]);
            }

        }
    }
}
