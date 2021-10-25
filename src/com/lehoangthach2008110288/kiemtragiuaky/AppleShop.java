package com.lehoangthach2008110288.kiemtragiuaky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleShop {

	public List<Apple> appleShop;

	public AppleShop() {
		appleShop = new ArrayList<Apple>();
	}

	public void nhapApple() {
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập khối lượng táo: ");
		float KL = input.nextFloat();

		System.out.print("Nhập màu táo: ");
		input.nextLine();
		String color = input.nextLine();

		appleShop.add(new Apple(appleShop.size(), KL, color));

		System.out.println();
	}

	public void inListApple() {
		for (Apple apple : appleShop) {
			apple.inThongTin();
		}
	}

	public void timAppletheomau(String color) {

		int count = 0;

		for (Apple apple : appleShop) {
			if (apple.color.equalsIgnoreCase(color)) {
				count++;
				apple.inThongTin();
			}
		}
		if (count == 0) {
			System.out.println("Không có táo nào màu " + color);
		}
	}
}
