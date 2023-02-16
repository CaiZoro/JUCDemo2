package com.newcoder;

import java.util.Scanner;
public class Code4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            if(str.length() <= 8){
                int n = 8-str.length();
                for(int i=0;i<n;i++){
                    str = str + "0";
                }
                System.out.println(str);
            }else{
                int a = str.length()%8;
                int b = str.length()/8;
                if(a == 0){
                    for(int i = 0;i<b;i++){
                        System.out.println(str.substring(8*i,8*(i+1)));
                    }
                }else{
                    for(int i=0;i<b;i++){
                        System.out.println(str.substring(8*i,8*(i+1)));
                    }
                    String subStr = str.substring(8*b);
                    int n = 8-subStr.length();
                    for(int i = 0;i<n;i++){
                        subStr = subStr+"0";
                    }
                    System.out.println(subStr);
                }
            }
        }
    }
}
