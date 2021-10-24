package com.lehoangthach2008110288.tuan04;

import com.lehoangthach2008110288.tuan06.SanPham;

public class sanpham {
    String tenSP;
    double gia;
    
    
    sanpham(){

    }

    sanpham(String t, double g){
        tenSP = t;
        gia = g;
    }
    void inThongTin(){
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Giá: " +gia);
        
    }
    
}
