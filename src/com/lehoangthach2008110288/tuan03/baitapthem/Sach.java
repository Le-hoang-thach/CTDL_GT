package com.lehoangthach2008110288.tuan03.baitapthem;

public class Sach {
    double gia;
    String nhaxuatban;
    int namxuatban;
    int soluong;
    String loai;
    Sach(){

    }
    Sach(double gi,String nh,int nam,int sl,String l){
        gia = gi;
        nhaxuatban = nh;
        namxuatban = nam;
        soluong = sl;
        loai = l;
    }
    void inThongTin(){
        System.out.println("giá tiền của cuốn sách là : " + gia);
        System.out.println("Nhà xuất bản : " + nhaxuatban);
        System.out.println("Năm xuất bản : " + namxuatban);
        System.out.println("Số lượng : " + soluong );
        System.out.println("Loại sách : " + loai);
    }
}
