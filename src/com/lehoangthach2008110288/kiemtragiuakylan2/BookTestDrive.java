package com.lehoangthach2008110288.kiemtragiuakylan2;

import java.util.Scanner;

public class BookTestDrive {
    public static int chon;
    public static BookShop listBook = new BookShop();
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
            chon = bienNhap.nextInt();
        	
        	switch(chon){
        	case 1:	themsach();break;
        	case 2: timsachtheomau();break;
        	case 3: indanhsachsach();break;
        	default: System.out.println("Vui lòng chọn lại"); break;
        	}
        }while(chon != 3);
	}
	
	public static void themsach() {
		listBook.nhapBook();
	}
	
	public static void timsachtheomau() {
		System.out.println("Nhập màu táo muốn tìm: ");
		bienNhap.nextLine();
		String color = bienNhap.nextLine();
		System.out.println("Các trái táo :");
		listBook.timsachtheomau(color);
	}
	
	public static void indanhsachsach() {
		listBook.inListBook();
	}
	
}
