package com.lehoangthach2008110288.tuan03;

import java.util.Scanner;

public class lad3 {
    public static void main(String[] args) {
        int n;
        
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Nhập phần tử trong mảng: ");
        n = bienNhap.nextInt();
        int []a = new int[n];
        for(int i = 0 ;i<n ;i++){
            System.out.println("Nhập phần tử thứ " + i + " : ");
            a[i] = bienNhap.nextInt();
        }
        int min = a[0];
        for(int i = 0 ;i<n;i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        int sum =0;
        int count = 0;
        System.out.println("Số nhỏ nhất trong mảng là : " + min);
        for(int i =0;i<n;i++){
            if(a[i] % 3 == 0){
                sum = sum + a[i];
                count ++;
            }
        }
        double ketqua = sum/count;
        System.out.println("Kết quả là: " + ketqua);

    }
}
