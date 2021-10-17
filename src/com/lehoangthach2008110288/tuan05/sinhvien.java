package com.lehoangthach2008110288.tuan05;

import java.util.Scanner;

public class sinhvien {
    public static final 
    String remove = null;
    String hoVaTen;
    String lop;
    Double diemTB;
    Scanner n = new Scanner(System.in);
    
    sinhvien(){

    }
    void inThongTin(){
        System.out.println("Họ và tên: " +hoVaTen);
        System.out.println("Điểm trung bình: " +diemTB);
        System.out.println("Lớp : " + lop);
        
        
    }
    void nhapThongTin(){
            System.out.print("Nhập họ và tên: ");
            hoVaTen = n.nextLine();
            System.out.print("Nhập điểm trung bình: ");
            diemTB = n.nextDouble();
            System.out.print("Nhập lớp : ");
            lop = n.next();
            
    }
    
}
