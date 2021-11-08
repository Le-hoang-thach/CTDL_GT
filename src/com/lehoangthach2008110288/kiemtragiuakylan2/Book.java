package com.lehoangthach2008110288.kiemtragiuakylan2;

import java.util.Scanner;

public class Book {
    int id;
    Float dongia;
    int soluong;

    public Book() {
		
	}

    public Book(int _id, Float _dongia, int _soluong) {
		id = _id;
		dongia = _dongia;
		soluong = _soluong;
	}

    public void inThongTin() {
        System.out.println("ID : " + id);
        System.out.println("Đơn giá : " + dongia);
        System.out.println("Số lượng : " + soluong);
    }
}
