package com.lehoangthach2008110288.tuan03.baitapthem;

public class Cow {
    Sring ten;
    String mauSac;
    double canNang;
    String gioiTinh;
    Cow(){}
    Cow(double CN, String mau, String gt){
        canNang = CN;
        mauSac = mau;
        gioiTinh = gt;
    }
    void inThongTin(){
        System.out.println("Tên con bò : " + ten);
        System.out.println("Màu sắc : " + mauSac);
        System.out.println("Cân nặng : " + canNang);
    }
}
