package com.newcoder;

import java.util.*;

/**
 * 逢4跳过
 */
public class Code7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int ans = N, temp = 0, k = 0, j = 1;
        while (N > 0) {
            if (N % 10 > 4) {
                temp += (N % 10 - 1) * k + j;
            } else {
                temp += (N % 10) * k;
            }
            k = k * 9 + j;
            j *= 10;
            N /= 10;
        }
        System.out.println(ans - temp);
    }

    /**
     * 输入整数和S,输入和为整数S的整数个数N
     * 存在解，求解，不存在，返回-1
     */
    public static void dcsz() {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int N = in.nextInt();
        // sum(x x+1 x+2 ... x+n-1) = sum
        //525 = 6 * x + 6 * (6 - 1) / 2
        // n*x + n*(n-1)/2 = sum
        // x= [sum - n*(n-1)/2 ]/n
        //减去尾差
        int sum = S - N * (N - 1) / 2;
        //此时sum如果不是X*N的和就输出-1
        if (sum != 0 && (sum & 1) != 0) {
            System.out.println(-1);
            return;
        }
        //数列的第一位数
        int begin = sum / N;
        for (int i = 0; i < N; i++) {
            System.out.print(begin + i);
            System.out.print(" ");
        }
    }

    /**
     * 输入描述:
     *   输入一个一维整型数组，数组大小取值范围 0<N<1000，数组中每个元素取值范围 0<E<1000
     *   输出描述:
     *   输出众数组成的新数组的中位数
     */
    public static void searchZsAndMid() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] split = str.split(" ");
        HashMap<Integer, Integer> map = new HashMap<>(16);
        for (String num : split) {
            map.put(Integer.parseInt(num), map.getOrDefault(Integer.parseInt(num), 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                for (int i = 0; i < entry.getValue(); i++) {
                    ans.add(entry.getKey());
                }
            }
        }
        ans.sort(Integer::compareTo);
        int len = ans.size();
        if ((len & 1) != 0) {
            System.out.println(ans.get(len / 2));
            return;
        }
        System.out.println((ans.get(len / 2) + ans.get(len / 2 - 1)) / 2);
    }

    /**
     * 给你两个字符串 t 和 p ，要求从 t 中找到一个和 p 相同的连续子串，并输出该字串第一个字符的下标。
     *   输入描述:
     *   输入文件包括两行，分别表示字符串 t 和 p ，保证 t 的长度不小于 p ，且 t 的长度不超过1000000，p 的长度不超过10000。
     *   输出描述:
     *   如果能从 t 中找到一个和 p 相等的连续子串，则输出该子串第一个字符在t中的下标（下标从左到右依次为1,2,3,…）；
     *   如果不能则输出”No”；如果含有多个这样的子串，则输出第一个字符下标最小的。
     *   示例1
     *   输入
     *   AVERDXIVYERDIAN
     *   RDXI
     *   输出
     *   4
     */
    public static void searchStr() {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        String p = in.nextLine();
        //方法1
        int idx = t.indexOf(p);
        if (idx == -1) {
            System.out.println("No");
        } else {
            System.out.println(idx + 1);
        }
        //方法2
        /*char[] chars = t.toCharArray();
        int i = 0, n = chars.length - 1;
        while (i <= n) {
            if (chars[i] == p.charAt(0)) {
                //找到第一个字符
                int temp = i + 1;
                StringBuilder sb = new StringBuilder();
                for (int i1 = 0; i1 < p.length(); i1++) {
                    sb.append(chars[i++]);
                }
                if (sb.toString().equals(p)) {
                    System.out.println(temp);
                    return;
                }
            }
            ++i;
        }
        System.out.println("No");*/
    }

}
