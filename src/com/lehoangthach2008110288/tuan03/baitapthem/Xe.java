package com.lehoangthach2008110288.tuan03.baitapthem;

public class Xe {
    String tenchuxe;
    String hangxe;
    String dong;
    String giayphep;
    double dungtichxang;
    Xe(){

    }
    Xe(String ten, String hx,String d, String gp,double dt){
       tenchuxe = ten;
       hangxe = hx;
       dong = d;
       giayphep = gp;
       dungtichxang = dt; 
    }
    void inThongTin(){
        System.out.println("Tên chủ xe : " + tenchuxe);
        System.out.println("Hãng xe : " + hangxe);
        System.out.println("Dòng : " + dong);
        System.out.println("Giấy phép : " + giayphep);
        System.out.println("Dung tích Xăng : " + dungtichxang);
        
    }
}
