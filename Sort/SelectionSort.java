package com.compare;

/**
 * 该算法为基于比较的排序算法
 * 选择排序时间复杂度为n2
 * @auther c
 */
public class SelectionSort {
    /**
     * 选择排序的思想是，给定n个数字，在范围内找出最小值的位置
     * 用第L项交换x，然后将下限L增加1，并重复步骤直到L = N -2
     */
    public static void main(String[] args){
        int[] arr = new int[]{2,3,5,1,6,4};
        selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
    public static void selectionsort(int[] arr){
        /**
         * 选择排序之所以叫做选择排序，就是因为其过程为每次内循环找出最小元素放在前面。
         * 与冒泡排序大同小异
         */
        int L = 0;
        while(L < arr.length - 1){
            int min = L;
            for (int i = L + 1; i < arr.length ; i++) {
                if(arr[min] > arr[i])
                    min = i;
            }
            int temp = arr[min];
            arr[min] = arr[L];
            arr[L++] = temp;
        }
    }
}
