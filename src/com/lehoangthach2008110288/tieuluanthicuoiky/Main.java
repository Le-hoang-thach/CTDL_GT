package com.lehoangthach2008110288.tieuluanthicuoiky;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static int key;
	static Scanner bienNhap = new Scanner(System.in);
	public static KhoHang kho = new KhoHang();
	
	public static void main(String[] args) {
		
		Date a = new Date();
		
		DienMay headDM = new DienMay(1, "may lanh", 120000000, a);
		SanhSu headSS = new SanhSu(2, "binh gom", 200000, a);
		ThucPham headTP = new ThucPham(3, "rau muong", 5000, a);
		
		DienMay DM1 = new DienMay(4, "may quat", 150000, a);
		headDM.next = DM1;
		SanhSu SS1 = new SanhSu(5, "chen gom", 20000, a);
		headSS.next = SS1;
		ThucPham TP1 = new ThucPham(6, "ca rot", 15000, a);
		headTP.next = TP1;
		
		DienMay DM2 = new DienMay(7, "tu lanh", 1000000, a);
		DM1.next = DM2;
		SanhSu SS2 = new SanhSu(8, "bat gom", 30000, a);
		SS1.next = SS2;
		ThucPham TP2 = new ThucPham(9, "rau lan", 12000, a);
		TP1.next = TP2;

		DienMay DM3 = new DienMay(10, "tivi", 11000000, a);
		DM2.next = DM3;
		SanhSu SS3 = new SanhSu(11, "dia su", 50000, a);
		SS2.next = SS3;
		ThucPham TP3 = new ThucPham(12, "dua hau", 50000, a);
		TP2.next = TP3;

		DienMay DM4 = new DienMay(13, "may tinh vivo book", 20000000, a);
		DM3.next = DM4;
		SanhSu SS4 = new SanhSu(14, "dia su", 50000, a);
		SS3.next = SS4;
		ThucPham TP4 = new ThucPham(15, "thit heo 1kg", 100000, a);
		TP3.next = TP4;

		DienMay DM5 = new DienMay(16, "am sieu toc", 300000, a);
		DM4.next = DM5;
		SanhSu SS5 = new SanhSu(17, "ly su", 100000, a);
		SS4.next = SS5;
		ThucPham TP5 = new ThucPham(18, "thit bo 1kg", 250000, a);
		TP4.next = TP5;

		DienMay DM6 = new DienMay(19, "iphone 13 pro max 512GB", 49000000, a);
		DM5.next = DM6;
		SanhSu SS6 = new SanhSu(20, "khay ta su", 30000, a);
		SS5.next = SS6;
		ThucPham TP6 = new ThucPham(21, "mam nem", 25000, a);
		TP5.next = TP6;
		
		kho.headDienMay = headDM;
		kho.headSanhSu = headSS;
		kho.headThucPham = headTP;
		
		//DienMay headDienMay = new DienMay(1, "May xay sinh to", 0, 0, ngaynhapkho);
		
//		Date b = null;
//		System.out.println("aaaaa");
//		String date = bienNhap.nextLine();
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//		try {
//		    //Parsing the String
//			b = dateFormat.parse(date);
//		} catch (ParseException e) {
//		    // TODO Auto-generated catch block
//		    e.printStackTrace();
//		}
//		System.out.println(b);
		
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
            System.out.print("Choon chuc nang: ");
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
	
	public static void ThemHang(KhoHang kho) {
		kho.ThemHang(bienNhap);
	}
	
	public static void InTT(KhoHang kho){
		kho.InTT();
	}
	
	public static void XoaHang(KhoHang kho) {
		kho.XoaHang(bienNhap);
	}
	
	public static void TimHang(KhoHang kho) {
		kho.TimHang(bienNhap);
	}
	
	public static void ThongKeKho(KhoHang kho) {
		kho.ThongKe(bienNhap);
	}
	
	public static void SuaHang(KhoHang kho) {
		kho.SuaHang(bienNhap);
	}
	
	public static void SapXepKhoHang(KhoHang kho) {
		kho.SapXep(bienNhap);
	}
}
