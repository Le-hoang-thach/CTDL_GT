package com.lehoangthach2008110288.tuan03.baitapthem;

import javax.tools.StandardJavaFileManager;

public class nhanvien {
    String ten;
    double luong;
    String diachi;
    String bophanlamviec;
    String ngaysinh;
    nhanvien(){

    }
    nhanvien(String t,double l,String dc,String bp, String ns){
        ten = t;
        luong = l;
        diachi = dc;
        bophanlamviec = bp;
        ngaysinh = ns;

    }
    void inThongTin(){
        System.out.println("Tên nhân viên : " + ten);
        System.out.println("Lương : " + luong);
        System.out.println("Địa chỉ : " + diachi);
        System.out.println("Bộ phận làm việc : " + bophanlamviec);
        System.out.println("Ngày sinh : " + ngaysinh);
    }
}
