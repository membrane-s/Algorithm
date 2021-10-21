package com.compare;

/**
 * 该算法为基于比较的排序算法
 * 快速排序和归并排序都是利用了递归，分而治之的思想，分解小问题解决，汇总出答案。
 * @auther c
 */
public class QuickSort {
    public static void main(String[] args){
        int[] arr = new int[]{2,3,5,1,6,4};
        quicksort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void quicksort(int[] arr,int l,int r){
        //快排的思想与归并排序不同，是使用两个指针，先排序，再递归。
        if(l >= r)  return;
        //以x划分区间
        int x = arr[(l + r) / 2],i = l - 1,j = r + 1;
        while(i < j){
            do i++;while(arr[i] < x);
            do j--;while(arr[j] > x);
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        quicksort(arr,l,j);
        quicksort(arr,j + 1,r);
    }
}
