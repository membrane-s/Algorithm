package com.compare;

/**
 * 该算法为基于比较的排序算法
 * 归并排序的算法思想是分而治之。将每对单个元素归并为2个元素的有序数组，然后将2个并为4个，重复。。。。
 * 分而治之算法：1.划分步骤，将原始大问题划分为小问题并递归解决小问题
 *            2.解决步骤，结合小问题的结果合成较大原始问题的结果。
 * 归并排序的时间复杂度为nlogn
 */
public class MergeSort {
    public static void main(String[] args){
        int[] arr = new int[]{2,4,3,8,7,1,5,6};
        mergesort(arr,0, arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static void mergesort(int[] arr,int l,int r) {
        //归并排序先利用递归将长度为n的数组递归分解为单位长度为1的单个元素。
        //然后将2个元素有序排列重复此过程
        if(l >= r) return;
        int mid = (l + r) / 2;
        //分解为长度为1的单个元素
        mergesort(arr,l,mid);
        mergesort(arr,mid + 1,r);
        //合并
        int[] b = new int[r -l + 1];
        int binx = 0;
        int i = l,j = mid + 1;
        while(i <= mid && j <= r){
            b[binx++] = (arr[i] <= arr[j])?arr[i++]:arr[j++];
        }
        while(i <= mid) b[binx++] = arr[i++];
        while(j <= r) b[binx++] = arr[j++];
        for (int k = 0; k < r - l + 1; k++) {
            arr[l + k] = b[k];
        }
    }

}
