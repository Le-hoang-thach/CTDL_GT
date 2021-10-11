package com.lehoangthach2008110288.tuan01;

import java.util.Scanner;

public class lad1 {
    static Scanner bienNhap = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Họ và tên: ");
        String name =  bienNhap.nextLine();
        System.out.print("Điểm Tb: ");
        double diemTb = bienNhap.nextDouble();
        System.out.println("Họ va tên: " + name + "\n" + "Điểm TB: " + diemTb);
    }
}
