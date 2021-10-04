package com.lehoangthach2008110288.tuan01;

import java.util.Scanner;

public class lad2 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        int chieudai, chieurong;
        System.out.println("Nhập chiều dài: ");
        chieudai = bienNhap.nextInt();
        System.out.println("Nhập chiều rộng: ");
        chieurong = bienNhap.nextInt();
        int chuvi = (chieudai + chieurong)*2;
        int dientich = chieudai*chieurong;
        int canhnhonhat = Math.min(chieudai, chieurong);
        System.out.println("Chu vi: " + chuvi +"\n"+"Diện tích: "+dientich+"\n"+"Cạnh nhỏ nhất: "+canhnhonhat);
    }
}
