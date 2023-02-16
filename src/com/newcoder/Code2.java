package com.newcoder;

import java.util.Scanner;

public class Code2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String c = sc.nextLine();
        int result = 0;
        for(int i = 0;i<str.length();i++){
            if(String.valueOf(str.charAt(i)).equals(c.toUpperCase()) || String.valueOf(str.charAt(i)).equals(c.toLowerCase())){
                result++;
            }
        }
        System.out.println(result);
    }
}
