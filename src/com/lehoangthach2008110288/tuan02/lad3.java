package com.lehoangthach2008110288.tuan02;

import java.util.Scanner;

public class lad3 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        double soDien ,tien;
        System.out.print("Nhập vào số điện : ");
        soDien = bienNhap.nextDouble();
        if(soDien < 50){
            tien = soDien*1000;
            System.out.print("Số tiền cần trả : " + tien);
        }else {
            tien =  50*1000 + (soDien - 50)*1200;
            System.out.print("Số tiền cần trả : " + tien);
        }
    }
}
