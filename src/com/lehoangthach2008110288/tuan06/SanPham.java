package com.lehoangthach2008110288.tuan06;

public class SanPham {
    double donGia;
    double giamGia;
    String thue;
    int sl;
    static Scanner nhap = new Scanner(System.in);
  
    SanPham(){
        
    }
 
    void inThongtin(){
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Giảm giá: "+giamGia);
        System.out.println("Thuế: "+thue);

    }

    void nhapThongTin(){
        System.out.println("-Thông tin sản phẩm:");
        System.out.print("Tên sản phẩm: ");
        tenSP = nhap.nextLine();
        System.out.print("Đơn giá: ");
        donGia = nhap.nextDouble();
        System.out.print("Giảm giá: ");
        giamGia = nhap.nextDouble();
        System.out.print("Thuế: ");
        nhap.nextLine();
        thue = nhap.nextLine();
        
    }
    
}
