package com.compare;

/**
 * 该算法为基于比较的排序算法
 * （被称为基于比较的算法，是因为他们比较数组的元素并决定时候交换他们。
 * 冒泡排序，选择排序，插入排序三种算法最容易实现，但并不是最有效的。
 * 因为他们的时间复杂度为O(N2)
 * 冒泡排序
 * @auther c
 */
public class BubbleSort {
    /**
     * 标准的冒泡排序有两层循环，外城循环需要迭代n次，而内层循环越来越短
     * 冒泡排序其实很低效，因为其说白了就是个暴力方法
     * 时间复杂度为n2
     */
    public static void main(String[] args){
        //初始化一个数组
        int[] arr = new int[]{3,4,6,5,2,1};
        Bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Bubblesort(int[] arr){
        //比较元素大小，关系不对则交换数字，重复此过程直到数组末尾，数字最大放在最后，
        // 将N减一，不断重复到N=1
        int N = arr.length,i=0;
        //for (int i = 0; N > 1 ; N--) {
        while(N > 1){
            for (int j = i + 1; j < N ; i++,j++) {
                if( arr[i] > arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            i = 0;
            N--;
        }
    }
}
