package com.lehoangthach2008110288.tuan03.baitapthem;

public class sinhvien {
    String ten;
    int tuoi;
    String lop;
    sinhvien(){

    }
    sinhvien(String name, int age, String l){
        ten = name;
        tuoi = age;
        lop = l;
        
    }
    void  inThongTin(){
        System.out.println("Họ và tên : " + ten);
        System.out.println("Tuổi : " + tuoi );
        System.out.println("Lớp : " + lop);
            


    
    }
}
