package com.nowcoder.hw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 分解质因子
 */
public class Code6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        long n;
        StringBuilder sb;

        while ((s = br.readLine()) != null) {
            n = Long.parseLong(s);
            sb = new StringBuilder();

            // find from beginning
            // prime must <= Math.sqrt(n)
            for (int i = 2; i * i <= n; i++) {
                if (0 == n % i) {
                    sb.append(i).append(' ');
                    n /= i--;
                }
            }
            // don't forget n
            sb.append(n).append(' ');
            System.out.println(sb.toString());
        }
    }
}
