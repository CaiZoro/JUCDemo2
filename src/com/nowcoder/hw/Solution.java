package com.nowcoder.hw;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        String result = sortSentence(str);
        System.out.println(result);
    }

    public static String sortSentence(String s) {
        String[] strs = s.split(" ");
        int[] nums = new int[strs.length];
        for(int i = 0;i<strs.length;i++){
            nums[i] = Integer.valueOf(strs[i].substring(strs[i].length()-1));
        }
        Arrays.sort(nums);
        StringBuffer sb = new StringBuffer();

        for (int j = 0;j<nums.length;j++){
            for(int i = 0;i<strs.length;i++){
                if (strs[i].indexOf(String.valueOf(nums[j])) != -1){
                    sb.append(strs[i].substring(0,strs[i].length()-1)+" ");
                }
            }
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}
