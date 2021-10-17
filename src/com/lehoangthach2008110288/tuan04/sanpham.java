package com.lehoangthach2008110288.tuan04;

public class sanpham {
    String tenSP;
    double gia;
    int nhap;
    Scanner n = new Scanner(System.in);

    SanPham(String t, double g){
        tenSP = t;
        gia = g;
    }
    void inThongTin(){
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Giá: " +gia);
        
    }
    
}
