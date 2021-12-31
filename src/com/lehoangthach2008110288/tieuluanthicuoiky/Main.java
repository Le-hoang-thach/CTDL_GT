package com.lehoangthach2008110288.tieuluanthicuoiky;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static int key;
	static Scanner bienNhap = new Scanner(System.in);
	public static Wasehouse kho = new Wasehouse();
	
	public static void main(String[] args) {
		
		Date a = new Date();
		
		Electric headDM = new Electric(1, "may lanh", 120000000, a);
		Crockery headSS = new Crockery(2, "binh gom", 200000, a);
		Food headTP = new Food(3, "rau muong", 5000, a);
		
		Electric DM1 = new Electric(4, "may quat", 150000, a);
		headDM.next = DM1;
		Crockery SS1 = new Crockery(5, "chen gom", 20000, a);
		headSS.next = SS1;
		Food TP1 = new Food(6, "ca rot", 15000, a);
		headTP.next = TP1;
		
		Electric DM2 = new Electric(7, "tu lanh", 1000000, a);
		DM1.next = DM2;
		Crockery SS2 = new Crockery(8, "bat gom", 30000, a);
		SS1.next = SS2;
		Food TP2 = new Food(9, "rau lan", 12000, a);
		TP1.next = TP2;

		Electric DM3 = new Electric(10, "tivi", 11000000, a);
		DM2.next = DM3;
		Crockery SS3 = new Crockery(11, "dia su", 50000, a);
		SS2.next = SS3;
		Food TP3 = new Food(12, "dua hau", 50000, a);
		TP2.next = TP3;

		Electric DM4 = new Electric(13, "may tinh vivo book", 20000000, a);
		DM3.next = DM4;
		Crockery SS4 = new Crockery(14, "dia su", 50000, a);
		SS3.next = SS4;
		Food TP4 = new Food(15, "thit heo 1kg", 100000, a);
		TP3.next = TP4;

		Electric DM5 = new Electric(16, "am sieu toc", 300000, a);
		DM4.next = DM5;
		Crockery SS5 = new Crockery(17, "ly su", 100000, a);
		SS4.next = SS5;
		Food TP5 = new Food(18, "thit bo 1kg", 250000, a);
		TP4.next = TP5;

		Electric DM6 = new Electric(19, "iphone 13 pro max 512GB", 49000000, a);
		DM5.next = DM6;
		Crockery SS6 = new Crockery(20, "khay ta su", 30000, a);
		SS5.next = SS6;
		Food TP6 = new Food(21, "mam nem", 25000, a);
		TP5.next = TP6;
		
		kho.headDienMay = headDM;
		kho.headSanhSu = headSS;
		kho.headThucPham = headTP;
		
		
		
		

		do{
        	System.out.println();
    		System.out.println("                 MENU           ");
            System.out.println("1)  Them hang			    ");
            System.out.println("2)  In danh sach hang hoa   ");
            System.out.println("3)  Xoa hang    		    ");
            System.out.println("4)  Sua thong tin hang hoa  ");
            System.out.println("5)  Tim hang    		    ");
            System.out.println("6)  Thong ke kho hang    	");
            System.out.println("7)  Sap xep kho hang    	");
            System.out.println("8)  Exit            		");
            System.out.println("-----------------------------------------");
            System.out.print("Chon chuc nang: ");
            key = bienNhap.nextInt();
            
            switch(key){
        	case 1:	ThemHang(kho);break;
        	case 2:	InTT(kho);break;
        	case 3:	XoaHang(kho);break;
        	case 4: SuaHang(kho); break;
        	case 5:	TimHang(kho);break;
        	case 6:	ThongKeKho(kho);break;
        	case 7:	SapXepKhoHang(kho);break;
			case 8: System.out.println("Thank You, See you again");break;
        	default: System.out.println("Ban da nhap sai"); break;
        	}
		}while(key !=8) ;
	}
	
	public static void ThemHang(Wasehouse kho) {
		kho.ThemHang(bienNhap);
	}
	
	public static void InTT(Wasehouse kho){
		kho.InTT();
	}
	
	public static void XoaHang(Wasehouse kho) {
		kho.XoaHang(bienNhap);
	}
	
	public static void TimHang(Wasehouse kho) {
		kho.TimHang(bienNhap);
	}
	
	public static void ThongKeKho(Wasehouse kho) {
		kho.ThongKe(bienNhap);
	}
	
	public static void SuaHang(Wasehouse kho) {
		kho.SuaHang(bienNhap);
	}
	
	public static void SapXepKhoHang(Wasehouse kho) {
		kho.SapXep(bienNhap);
	}
}
