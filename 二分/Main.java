package com.company;

import java.util.Scanner;

/**
 * 对于二分法确定数的范围，根本还是逐个确定最左和最右的数字。当跳出循环时，l和r相等，通过不停的while
 * 循环，从而判定最左侧最右侧的边界。
 */
public class Main {

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();//数组个数
	    int m = scanner.nextInt();//查询次数
        String f;
        char b;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        while(m-- != 0){
            int x = scanner.nextInt();
            int l = 0, r = n-1;
            while(l < r){
                int mid = l + r >> 1;
                if(a[mid] >= x) r = mid;
                else l = mid + 1;
            }
            if(a[l] != x) System.out.println("-1 -1");
            else{
                System.out.print(l+ " ");
                l = 0;
                r = n - 1;
                while(l < r){
                    int mid = l + r + 1>> 1;
                    if(a[mid] <= x) l = mid;
                    else r = mid - 1;
                }
            }
            System.out.println(l);
        }
    }
}
