package com.lehoangthach2008110288.thicuoiky;

import java.util.Date;
import java.util.Scanner;

public class Food{
	int id;
	String name;
	float gia;
	Date ngayNhapKho;
	
	Food next;
	
	Food (){
		
	}
	
	Food(int _id, String _name, float _gia, Date _ngayNhapKho){
		id = _id;
		name = _name;
		gia = _gia;
		ngayNhapKho = _ngayNhapKho;
	}
	
	public void NhapTT(Scanner scanner) {
		
		scanner.nextLine();
		System.out.print("Nhập tên sản phẩm: ");
		name = scanner.nextLine();
		
		System.out.print("Hãy nhập giá sản phẩm: ");
		gia = scanner.nextFloat();
		
		ngayNhapKho = new Date();
	}
	
	public void inTT() {
		System.out.println("Tên hàng: " + name);
		System.out.println("Loại hàng: thực phẩm ");  
		System.out.println("Id: " + id);
		System.out.println("Giá : " + gia);
		System.out.println("Ngày nhập kho : " + ngayNhapKho);
		 
		
	}
}