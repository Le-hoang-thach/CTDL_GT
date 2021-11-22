package com.lehoangthach2008110288.thicuoiky;

import java.util.Scanner;

public class Warehouse {
    Electric headElectric;
	Crockery headCrockery;
	Food headFood;
	
	Warehouse(){
		
	}
	
	Warehouse(Electric _headElectric, Crockery _headCrockery, Food _headFood){
		headElectric = _headElectric;
		headCrockery = _headCrockery;
		headFood = _headFood;
	}
	public void ThemHang(Scanner scanner) {
		System.out.println("Bạn muốn thêm loại hàng nào?");
		System.out.println("1) Điện máy	");
		System.out.println("2) Sành Sứ  "); 
		System.out.println("3) Thực Phẩm");	  
		System.out.println("Mời bạn lựa chọn: ");  
		
		int loaiHang = scanner.nextInt();
		
		if (loaiHang == 1) {
			Electric cur = headElectric;
			while (cur != null) {
				if (cur.next == null) {
					Electric itemMoi = new Electric();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}
		
		if (loaiHang == 2) {
			Crockery cur = headCrockery;
			while (cur != null) {
				if (cur.next == null) {
					Crockery itemMoi = new Crockery();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
			}
			cur = cur.next;
		}

		if (loaiHang == 3) {
			Food cur = headFood;
			while (cur != null) {
				if (cur.next == null) {
					Food itemMoi = new Food();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
			}
			cur = cur.next;
		}
	}
	
	
	
	int NhapId(Scanner scanner, int loaihang) {
		
		System.out.print("Hãy nhập ID hàng: ");
		int id = scanner.nextInt();
		
		if (loaihang == 1) {
			Electric cur = headElectric;
			while (cur != null) {
				if (cur.id == id) {
					System.out.println("Id này đã tồn tại");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 2) {
			Crockery cur = headCrockery;
			while (cur != null) {
				if (cur.id == id) {
					System.out.print("Id này đã tồn tại");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 3) {
			Food cur = headFood;
			while (cur != null) {
				if (cur.id == id) {
					System.out.print("Id này đã tồn tại");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		return id;
	}
	
	public void InTT(){
		Electric curDM = headElectric;
		Crockery curSS = headCrockery;
		Food curTP = headFood;
		
		while (curDM != null) {
			curDM.inTT();
			curDM = curDM.next;
		}
		
		System.out.println();
		
		while (curSS != null) {
			curSS.inTT();
			curSS = curSS.next;
		}
		
		System.out.println();
		
		while (curTP != null) {
			curTP.inTT();
			curTP = curTP.next;
		}
		
	}
	
	public void XoaHang(Scanner scanner) {
		System.out.println("Muốn xóa theo cách nào");
		System.out.println(" 1) Theo Id ");
		System.out.println(" 2) Theo tên");		
		System.out.println(" 3) Theo giá");  
		System.out.println("Mời bạn lựa chọn : "); 
		
		int cachxoa = scanner.nextInt();
		
		if (cachxoa == 1) {
			System.out.print("Hãy nhập Id hàng cần xóa: ");
			int idCanXoa = scanner.nextInt();
			
			Electric curDM = headElectric;
			Crockery curSS = headCrockery;
			Food curTP = headFood;
			
			while (curDM.next != null) {
				if (curDM.next.id == idCanXoa) {
					System.out.println("đã tìm thấy");
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			System.out.println("Qua SS");
			
			while (curSS.next != null) {
				if (curSS.next.id == idCanXoa) {
					System.out.println("đã tìm thấy");
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			System.out.println("Qua TP");
			
			while (curTP != null) {
				if (curTP.next.id == idCanXoa) {
					System.out.println("đã tìm thấy");
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Đã xóa");
		}
		
		if (cachxoa == 2) {
			
		}

		if (cachxoa == 3) {
			
		}
		
		
		
		
		
	}
	
	
	
	
}
