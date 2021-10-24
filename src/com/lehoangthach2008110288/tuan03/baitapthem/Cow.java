package com.lehoangthach2008110288.tuan03.baitapthem;

public class Cow {
    String ten;
    String mauSac;
    double canNang;
  
    Cow(){

    }
    Cow(String name, String color, double weight){
       ten = name;
       mauSac = color;
        canNang = weight;
    }
    void inThongTin(){
        System.out.println("Tên con bò : " + ten);
        System.out.println("Màu sắc : " + mauSac);
        System.out.println("Cân nặng : " + canNang);
    }
}
