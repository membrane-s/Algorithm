package com.compare;

/**
 * 该算法为基于比较的排序算法
 * 插入排序时间复杂度为n2
 * @auther c
 */
public class InsertionSort {
    public static void main(String[] args){
        int[] arr = new int[]{2,4,3,8,7,1,5,6};
        insertionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionsort(int[] arr){
        /**
         * 插入排序的算法思想就是将数组从最开始，逐个进行排序，就像是来一张牌，你就给他排好序一样。
         * 这种写法中其中for循环的判断条件&&上了一个表达式，这种写法相当于在大括号内写if。
         */
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[i] ; j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
            }
        }
    }
}
