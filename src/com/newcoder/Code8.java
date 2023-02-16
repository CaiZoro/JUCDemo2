package com.newcoder;

import java.util.*;

public class Code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0;i< strs.length;i++){
            nums[i] = Integer.valueOf(strs[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i< nums.length;i++){
            for (int j = i + 1;j<nums.length;j++){
                int n = nums[i]+nums[j];
                list.add(Math.abs(n));
            }
        }
        Collections.sort(list);
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                int n = nums[i] + nums[j];
                if (Math.abs(n) == list.get(0)){
                    System.out.println(nums[i]+" "+nums[j]+ " "+list.get(0));
                }
            }
        }
    }
}
