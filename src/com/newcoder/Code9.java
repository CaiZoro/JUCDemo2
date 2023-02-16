package com.newcoder;

import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("#");
        if (strs.length==1){
            str.replaceAll("/","");
            System.out.println(str);
        }else {
            StringBuffer sb = new StringBuffer();
            StringBuffer result = new StringBuffer();
            int temp  = 0;
            for (int i=0;i<strs[1].length()-1;i++){
                String s1 = String.valueOf(strs[1].charAt(i));
                String s2 = String.valueOf(strs[1].charAt(i+1));
                if (!s1.equals(s2) && temp == 0){
                    sb.append(String.valueOf(strs[1].charAt(i))+(i+1));
                    temp = i;
                }else {
                    if (!s1.equals(s2)){
                        sb.append(String.valueOf(strs[1].charAt(i))+(i-temp));
                        temp = i;
                    }
                }
            }
            sb.append(String.valueOf(strs[1].charAt(temp+1))+(strs[1].length()-(temp+1)));
            for (int i=0;i<sb.length()-1;i+=2){
                String s = reverNum2Str(Integer.valueOf(sb.charAt(i)),Integer.valueOf(sb.charAt(i+1)));
                result.append(s);
            }
            System.out.println(strs[0]+result);
        }

    }

    /**
     * 根据次数返回字符串
     * @return
     */
    public static String reverNum2Str(int num,int n){
        int y = n%3;
        String s = "";
        if (num == 1){
            y = n%2;
            if (y == 1){
                s = ",";
            }
            if (y == 0){
                s = ".";
            }
        }else if(num == 0){
            s = " ";
        }else if (num == 7 || num == 9){
            y = n%4;
            if (y == 1 && num == 7){
                s = "p";
            }
            if (y == 2 && num == 7){
                s = "q";
            }
            if (y == 3 && num == 7){
                s = "r";
            }
            if (y == 0 && num == 7){
                s = "s";
            }
            if (y == 1 && num == 7){
                s = "p";
            }
            if (y == 2 && num == 7){
                s = "q";
            }
            if (y == 3 && num == 7){
                s = "r";
            }
            if (y == 0 && num == 7){
                s = "s";
            }
        } else{
            if (y == 1 && num == 2){
                s = "a";
            }
            if (y == 2 && num == 2){
                s = "b";
            }
            if (y == 0 && num == 2){
                s = "c";
            }
            if (y == 1 && num == 3){
                s = "d";
            }
            if (y == 2 && num == 3){
                s = "e";
            }
            if (y == 0 && num == 3){
                s = "f";
            }
            if (y == 1 && num == 4){
                s = "g";
            }
            if (y == 2 && num == 4){
                s = "h";
            }
            if (y == 0 && num == 4){
                s = "i";
            }
            if (y == 1 && num == 5){
                s = "m";
            }
            if (y == 2 && num == 5){
                s = "o";
            }
            if (y == 0 && num == 5){
                s = "n";
            }
            if (y == 1 && num == 6){
                s = "a";
            }
            if (y == 2 && num == 6){
                s = "b";
            }
            if (y == 0 && num == 6){
                s = "c";
            }
            if (y == 1 && num == 8){
                s = "t";
            }
            if (y == 2 && num == 8){
                s = "v";
            }
            if (y == 0 && num == 8){
                s = "u";
            }
        }
        return s;
    }
}
