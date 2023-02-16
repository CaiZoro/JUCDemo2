package com.nowcoder.hw;

import java.util.Arrays;

public class SortedCode {
    public static void main(String[] args) {
        int[] nums = {0,5,5,6,2,4,2,7};
        //insertSort(nums);
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 插入排序
     * @param data
     */
    public static void insertSort(int[] data){
        int temp;
        for(int i=1;i<data.length;i++){//取第i个数,插入前边的有序的序列
            temp = data[i];
            int j;
            for(j =i-1;j>=0;j--){//从第i-1的位置上开始比较
                if(data[j]>temp){//若前面的数大，则往后挪一位
                    data[j+1] = data[j];
                }else {
                    break;//否则，说明要插入的数比较大
                }
            }
            data[j+1] = temp;//找到这个位置，插入数据
        }
    }

    /**
     * 希尔排序
     * @param array
     */
    public static void shellSort(int[] array){
        int length = array.length;
        for (int i = length/2; i >0 ; i /= 2) {//序列的间隔，一直到间隔为一，这时候就只有一个子序列
            for (int j=i;j<length;j++){//从i之后每个数字都要进行插入排序，就是插入的序列是各自不同的序列
                int temp = array[j];//里面就是直接插入算法
                int k;
                for(k = j-i; k>=0;k -= i){//实现各个数字插入排序到不同的序列中，直到间隔为1的时候，只有一个序列，就是完全的一个直接插入排序
                    if(temp< array[k]){
                        array[k+i] = array[k];
                    }else{
                        break;
                    }

                }
                array[k+i] = temp;//把数字插入到位置上
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
