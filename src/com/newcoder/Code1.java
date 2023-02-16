package com.newcoder;

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = getLastWordLen(str);
        System.out.println(result);
    }

    public  static int getLastWordLen(String str)
    {
        int result = 0;
        String[] array = str.split(" ");
        if(str.equals("")){
            return 0;
        }
        if (array.length == 1){
            return str.length();
        }
        if(array.length>1){
            result = array[array.length-1].length();
        }
        return result;
    }
}

