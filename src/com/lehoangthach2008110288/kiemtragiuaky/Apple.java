package com.lehoangthach2008110288.kiemtragiuaky;

import java.util.Scanner;

public class Apple {
    int id;
	float KL;
	String color;
	
	public Apple() {
		
	}
	
	public Apple(int ma, float Khoiluong, String mau) {
		id = ma;
		KL = Khoiluong;
		color = mau;
	}
	
	public void inThongTin() {
		System.out.println("Táo màu : "+ color );
        System.out.println("ID : "+ id);
        System.out.println("Khối lượng : "+ KL);
	}
}
