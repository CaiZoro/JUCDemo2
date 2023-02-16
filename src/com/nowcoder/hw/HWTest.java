package com.nowcoder.hw;

import java.util.*;

public class HWTest {
     public static void main(String[] args) {
         System.out.println("华为机考题top10");
         //dcsz();
        //searchZsAndMid();
         searchStr();
     }

    /**
     **1、求解连续数列**
     已知连续正整数数列{K}=K1,K2,K3...Ki的各个数相加之和为S，i=N (0<S<100000, 0<N<100000), 求此数列K。
     输入描述:
     输入包含两个参数，1）连续正整数数列和S，2）数列里数的个数N。
     输出描述:
     如果有解输出数列K，如果无解输出-1
     示例1
     输入 525 6
     输出 85 86 87 88 89 90
     示例2
     输入 3 5
     输出- 1
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
         **2、查找众数及中位数**
        众数是指一组数据中出现次数量多的那个数，众数可以是多个
        中位数是指把一组数据从小到大排列，最中间的那个数，如果这组数据的个数是奇数，那最中间那个就是中位数，如果这组数据的个数为偶数，那就把中间的两个数之和除以2，所得的结果就是中位数
        查找整型数组中元素的众数并组成一个新的数组，求新数组的中位数
        输入描述:
        输入一个一维整型数组，数组大小取值范围 0<N<1000，数组中每个元素取值范围 0<E<1000
        输出描述:
        输出众数组成的新数组的中位数
        示例1：
        输入
            10 11 21 19 21 17 21 16 21 18 15
        输出
            21
        示例2：
        输入
            2 1 5 4 3 3 9 2 7 4 6 2 15 4 2 4
        输出
            3
        示例3：
        输入
            5 1 5 3 5 2 5 5 7 6 7 3 7 11 7 55 7 9 98 9 17 9 15 9 9 1 39
        输出
            7
    */
     public static void searchZsAndMid() {
         Scanner in = new Scanner(System.in);
         String str = in.nextLine();
         String[] split = str.split(" ");
         HashMap<Integer, Integer> map = new HashMap<>(16);
         //数值作为key，出现次数作为value
         for (String num : split) {
             map.put(Integer.parseInt(num), map.getOrDefault(Integer.parseInt(num), 0) + 1);
         }
         List<Integer> ans = new ArrayList<>();
         //取出出现次数为1的数值
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             if (entry.getValue() > 1) {
                 for (int i = 0; i < entry.getValue(); i++) {
                     ans.add(entry.getKey());
                 }
             }
         }
         ans.sort(Integer::compareTo);
         int len = ans.size();
         List<Integer> numList = new ArrayList();
         if (ans.size() == 0){
             for (String i:split){
                 numList.add(Integer.parseInt(i));
             }
             Collections.sort(numList);
             len = numList.size();
         }
         if ((len & 1) != 0) {
             if (ans.size() == 0){
                 System.out.println(numList.get(len / 2));
             }else{
                 System.out.println(ans.get(len / 2));
             }
             return;
         }
         if (ans.size() == 0){
             System.out.println((numList.get(len / 2) + numList.get(len / 2 - 1)) / 2);
         }else {
             System.out.println((ans.get(len / 2) + ans.get(len / 2 - 1)) / 2);
         }
     }

    /**
         **3、寻找相同子串**
         给你两个字符串 t 和 p ，要求从 t 中找到一个和 p 相同的连续子串，并输出该字串第一个字符的下标。
         输入描述:
         输入文件包括两行，分别表示字符串 t 和 p ，保证 t 的长度不小于 p ，且 t 的长度不超过1000000，p 的长度不超过10000。
         输出描述:
         如果能从 t 中找到一个和 p 相等的连续子串，则输出该子串第一个字符在t中的下标（下标从左到右依次为1,2,3,…）；
         如果不能则输出”No”；如果含有多个这样的子串，则输出第一个字符下标最小的。
         示例1
         输入
         AVERDXIVYERDIAN
         RDXI
         输出
         4
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
