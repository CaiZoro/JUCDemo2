package com.nowcoder.hw;

/**
 * 输入第一行为整数N，表示后面有N个数字
 *
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] intArr = new int[n];
            for (int i = 0; i < n; i++) {
                intArr[i] = scanner.nextInt();
            }
            Arrays.sort(intArr);
            for (int i = 0; i < intArr.length; i++) {
                // 第一个数字或者不等于前一个数字都可以输出
                if (i == 0 || intArr[i] != intArr[i - 1]) {
                    System.out.println(intArr[i]);
                }
            }
        }
    }
}