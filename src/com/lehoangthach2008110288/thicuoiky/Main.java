package com.lehoangthach2008110288.thicuoiky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	static Scanner bienNhap = new Scanner(System.in);
	public static Warehouse kho = new Warehouse();
	static int key;
	
	public static void main(String[] args) {

		
		Date a = new Date();
		
		Electric headDM = new Electric(1, "1", 1, a);
		Crockery headSS = new Crockery(2, "2", 2, a);
		Food headTP = new Food(3, "3", 3, a);
		
		Electric DM1 = new Electric(4, "4", 4, a);
		headDM.next = DM1;
		Crockery SS1 = new Crockery(5, "5", 5, a);
		headSS.next = SS1;
		Food TP1 = new Food(6, "6", 6, a);
		headTP.next = TP1;
		
		Electric DM2 = new Electric(7, "7", 7, a);
		DM1.next = DM2;
		Crockery SS2 = new Crockery(8, "8", 9, a);
		SS1.next = SS2;
		Food TP2 = new Food(9, "9", 9, a);
		TP1.next = TP2;
		
		kho.headElectric = headDM;
		kho.headCrockery = headSS;
		kho.headFood = headTP;
		
		//DienMay headDienMay = new DienMay(1, "May xay sinh to", 0, 0, ngaynhapkho);
		System.out.println("Chào mừng bạn đến với chương trình của chúng tôi ");
		System.out.println("Người thực hiện : Lê Hoàng Thạch ");
		System.out.println("MSSV : 2008110288");
		System.out.println("Người hướng dẫn : Lê Huỳnh Phước");
		do{
        	System.out.println();
    		System.out.println("+--------------MENU-------------+");
            System.out.println("+1)  Thêm hàng                  +");
            System.out.println("+2)  Xóa hàng                   +");
            System.out.println("+3)  Sửa hàng                   +");
           
            System.out.println("+5)  Thoát                      +");
            System.out.println("+-------------------------------+");
            System.out.print("Mời bạn chọn chức năng: ");
            key = bienNhap.nextInt();
            
            switch(key){
        	case 1:	ThemHang(kho);break;
        	case 2:	InTT(kho);break;
        	case 3:	XoaHang(kho);break;
        	default: break;
        	}
		}while(key != 5);
	}
	
	public static void ThemHang(Warehouse kho) {
		kho.ThemHang(bienNhap);
	}
	
	public static void InTT(Warehouse kho){
		kho.InTT();
	}
	
	public static void XoaHang(Warehouse kho) {
		kho.XoaHang(bienNhap);
	}
/*	
	public void TimHangTheoID(int id) {
		
	}
	
	public void TimHangTheoID(String name) {
		
	}

	public void TimHangTheoID(float gia) {
	
	}*/
}