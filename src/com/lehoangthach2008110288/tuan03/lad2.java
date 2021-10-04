package com.lehoangthach2008110288.tuan03;

import java.util.Scanner;

public class lad2 {
    public static void main(String[] args) {
       Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhập vào số cần xem bảng cửu chương : ");
        int x = bienNhap.nextInt() ;
          
        for  (int i = 2 ; i <= 10 ; i ++){
            System.out.printf("%d x %d = %d",x,i,x*i);
            System.out.println();
        }
    }
}
