package com.lehoangthach2008110288.kiemtragiuakylan2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShop {
    public List<Book> bookShop;

	public BookShop() {
		bookShop = new ArrayList<Book>();
	}

	public void nhapBook() {
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập đơn giá sách: ");
		float KL = input.nextFloat();

		

		bookShop.add(new Book(bookShop.id, dongia, soluong));

		System.out.println();
	}


	public void inListBook() {
		for (Book book : bookShop) {
			book.inThongTin();
		}
	}

	public void timsachtheomau(String color) {

		int count = 0;

		for (Book book : bookShop) {
			if (book.dongia.equalsIgnoreCase(dongia)) {
				count++;
				book.inThongTin();
			}
		}
		if (count == 0) {
			System.out.println("Không có sách nào màu " + color);
		}
	}
}
