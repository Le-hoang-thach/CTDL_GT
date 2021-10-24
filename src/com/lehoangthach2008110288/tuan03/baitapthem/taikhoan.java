package com.lehoangthach2008110288.tuan03.baitapthem;

public class taikhoan {
    String tentaikhoan;
    long sotaikhoan;
    int sodutaikhoan;
    taikhoan(){

    }
    taikhoan(String name,long stk,int sdtk){
        tentaikhoan = name;
        sotaikhoan = stk;
        sodutaikhoan = sdtk;
    }
    void inThongTin(){
        System.out.println("Tên tài khoản  : " + tentaikhoan);
        System.out.println("Số tài khoản : " + sotaikhoan);
        System.out.println("Số dư tài khoản : " + sodutaikhoan);
    }
}
