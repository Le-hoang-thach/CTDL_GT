package com.lehoangthach2008110288.tuan05;

public class sinhvien {
    public static final String remove = null;
    String hoVaTen;
    Double diemTB;
    Scanner n = new Scanner(System.in);
    
    sinhvien(){

    }
    void inThongTin(){
        System.out.println("Họ và tên: " +hoVaTen);
        System.out.println("Điểm trung bình: " +diemTB);
        
    }
    void nhapThongTin(){
            System.out.print("Nhập họ và tên: ");
            hoVaTen = n.nextLine();
            System.out.print("Nhập điểm trung bình: ");
            diemTB = n.nextDouble();
            
    }
    
}
