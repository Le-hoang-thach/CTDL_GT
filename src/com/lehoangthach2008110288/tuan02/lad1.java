package com.lehoangthach2008110288.tuan02;

import java.util.Scanner;

public class lad1 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        double a,b;
        System.out.print("Nhập a: ");
        a = bienNhap.nextDouble();
        System.out.print("Nhập b: ");
        b = bienNhap.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else 
            System.out.println("Phương trình vô nghiệm");
        }else 
        System.out.println("Phương trình có nghiệm : " + (-b/a));
    }
}
