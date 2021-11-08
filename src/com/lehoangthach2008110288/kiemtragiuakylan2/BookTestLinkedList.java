package com.lehoangthach2008110288.kiemtragiuakylan2;

import java.util.Scanner;

public class BookTestLinkedList {
    public static int key;
    public static Scanner bienNhap = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("nhập thông tin mồi cuốn sách: ");
		System.out.print("Hãy nhập ID sách: ");
		int id = bienNhap.nextInt();
		
		System.out.print("Hãy nhập đơn giá sách: ");
		float KL = bienNhap.nextFloat();
		
		
		
		Book book = new Book(2, 2, "2");
		Book head = book;
		
		Book book1 = new Book(3, 3, "3");
		book.next = book1;
		
		Book book2 = new Book(1, 1, "1");
		book1.next = book2;
		
		Book book3 = new Book(4, 4, "4");
		apple2.next = book3;
		
		
        while (true){
        	System.out.println();
    		System.out.println("------------MENU---------");
            System.out.println("1)  Thêm sách vào đầu danh sách		");
            System.out.println("2)  Thêm sách vào cuối danh sách		");
            System.out.println("3)  Tìm táo theo Id			");
            System.out.println("4)  In danh sách quyển sách    		");
            System.out.println("6)  Xóa sách cuối danh sách   		");
            System.out.println("7)  Xóa sách đầu danh sách   		");
            System.out.println("10)  Thoát            			");
            System.out.println("-------------------------");
            System.out.print("Chọn chức năng: ");
            key = bienNhap.nextInt();
        	
        	switch(key){
        	case 1:	head = ThemSachVaoDau(head); break;
        	case 2:	ThemSachVaoCuoi(head); break;
        	case 3: 
        		Book testBook = TimSachTheoID(head);
        		if (testSach == null)
        			System.out.println("Không tìm thấy sách");
        		else
        			testApple.inThongTin();
        		break;
        	
        	default: break;
        	}
        }
	}
	
	public static Book ThemSachVaoDau(Book book) {
		
		System.out.print("Hãy nhập ID sách: ");
		int id = bienNhap.nextInt();
		
		System.out.print("Hãy nhập đơn giá táo: ");
		float KL = bienNhap.nextFloat();
		
		
		Book newBook = new Book(id, dongia, soluong);
		newBook.next = book;
		
		return newBook;
	}
	
	
}
