package com.lehoangthach2008110288.tuan03;

import java.util.Scanner;

public class lad3 {
    public static void main(String[] args) {
        int n,min;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử trong mảng: ");
        n = input.nextInt();
        int []a = new int[n];
        for(int i = 0 ;i<n ;i++){
            System.out.println("Nhập phần tử thứ " + i + " : ");
            a[i] = input.nextInt();
        }
        min = Math.min(min, a[i]);
        System.out.println("Số nhỏ nhất trong mảng là : " + min);

    }
}
