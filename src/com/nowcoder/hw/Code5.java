package com.nowcoder.hw;

import java.util.Scanner;

/**
 * 16进制转化为10进制
 */
public class Code5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(Integer.parseInt(sc.next().replaceAll("x",""),16));
        }
    }
}
