package com.lehoangthach2008110288.kiemtragiuaky;

import java.util.Scanner;

public class AppleTestDrive {
    public static AppleShop listApple = new AppleShop();
	public static Scanner bienNhap = new Scanner(System.in);
	public static void main(String[] args) {
        do{
    		System.out.println("------------------MENU----------");
            System.out.println(".> 1)Thêm táo                   ");
            System.out.println(".> 2)Tìm táo theo màu         	");
            System.out.println(".> 3)In danh sách táo           ");
            System.out.println(".> 3)Thoát              	    ");
            System.out.println("--------------------------------");
            System.out.print("Mời bạn chọn số : ");
            int chon = bienNhap.nextInt();
        	
        	switch(chon){
        	case 1:	themtao();break;
        	case 2: timtaotheomau();break;
        	case 3: indanhsachtao();break;
        	default: break;
        	}
        }while(chon != 3);
	}
	
	public static void themtao() {
		listApple.nhapApple();
	}
	
	public static void timtaotheomau() {
		System.out.println("Nhập màu táo muốn tìm: ");
		bienNhap.nextLine();
		String color = bienNhap.nextLine();
		System.out.println("Các trái táo :");
		listApple.timAppletheomau(color);
	}
	
	public static void indanhsachtao() {
		listApple.inListApple();
	}
	
}
