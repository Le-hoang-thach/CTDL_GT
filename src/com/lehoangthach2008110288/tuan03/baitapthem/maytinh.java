package com.lehoangthach2008110288.tuan03.baitapthem;

public class maytinh {
    String nhasanxuat;
    int namsanxuat;
    String hedieuhanh;
    int ram;
    String CPU;
    double gia;
    int nambaohanh;
    maytinh(){

    }
    maytinh(String ns,int n,String hdh,int R, String cpu,double g,int nbh){
        nhasanxuat = ns;
        namsanxuat = n;
        hedieuhanh = hdh;
        ram = R;

        CPU= cpu;
        gia= g;
        nambaohanh = nbh;
    }
    void inThongTin(){
        System.out.println("Nhà sản xuất : " + nhasanxuat);
        System.out.println("Năm sản xuất : " + namsanxuat);
        System.out.println("Hệ điều hành : " + hedieuhanh);
        System.out.println("Ram : " + ram +" GB");
        System.out.println("CPU : " + CPU);
        System.out.println("Giá : " + gia);
        System.out.println("Năm bảo hành : " + nambaohanh);
    }
}
