package com.lehoangthach2008110288.tieuluanthicuoiky;

import java.util.Date;
import java.util.Scanner;

public class Crockery {
    int id;
	String name;
	float gia;
	Date ngayNhapKho;
	
	Crockery next;
	
	Crockery(){
		
	}
	
	Crockery(int _id, String _name, float _gia, Date _ngayNhapKho){
		id = _id;
		name = _name;
		gia = _gia;
		ngayNhapKho = _ngayNhapKho;
	}
	
	public void NhapTT(Scanner scanner) {
		
		scanner.nextLine();
		System.out.print("Nhap ten san pham: ");
		name = scanner.nextLine();
		
		System.out.print("Hay nhap gia san pham: ");
		gia = scanner.nextFloat();
		
		ngayNhapKho = new Date();
	}
	
	public void inTT() {
		System.out.println("Ten hang: " + name);
        System.out.println(" Loai hang: Sanh su");
        System.out.println(" Id: " + id);
        System.out.println(" Gia: " + gia);
        System.out.println(" Ngay nhap: "+ ngayNhapKho);
	}
	
	public String GetName() {
		System.out.println(name);
		return name;
	}
}

