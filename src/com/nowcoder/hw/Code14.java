package com.nowcoder.hw;

import java.util.Scanner;

/**
 * //一个数对2取余为1时，其二进制表达式最后一位为1，迭代右移一位来依次判断该数二进制表达式中每一位是否为1，直至数值为0则表明所有位已经判断完毕
 * import java.util.Scanner;
 *
 */
public class Code14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int result=0;
            while(a>0){
               if(1==a%2) result++;
                a=a>>>1;
             }
            System.out.println(result);
    }
}
