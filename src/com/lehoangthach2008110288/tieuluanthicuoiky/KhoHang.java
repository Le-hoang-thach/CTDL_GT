package com.lehoangthach2008110288.tieuluanthicuoiky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhoHang {
    DienMay headDienMay;
	SanhSu headSanhSu;
	ThucPham headThucPham;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	KhoHang(){
		
	}
	
	KhoHang (DienMay _headDienMay, SanhSu _headSanhSu, ThucPham _headThucPham){
		headDienMay = _headDienMay;
		headSanhSu = _headSanhSu;
		headThucPham = _headThucPham;
	}
	
	public void ThemHang(Scanner scanner) {
		System.out.println("Ban muon them loai hang nao?");
		System.out.println("1) Dien may"+"\n"+	"2) Sanh Su"+"\n"+	"3) Thuc Pham ");
        System.out.println("Lua chon: ");
		
		int loaiHang = scanner.nextInt();
		
		if (loaiHang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.next == null) {
					DienMay itemMoi = new DienMay();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.next == null) {
					SanhSu itemMoi = new SanhSu();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.next == null) {
					ThucPham itemMoi = new ThucPham();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}
	}
	
	public void SuaHang(Scanner scanner) {
		System.out.println("Ban muon sua hang theo Id hay loai hang?");
        System.out.println(" 1) loai hang"+"\n"+"2) ID hang");
        System.out.println("Lua chon: ");
        int cachsua = scanner.nextInt();
		
		if (cachsua == 1) {
			System.out.println("Hay nhap thong tin hang ban muon sua");
            System.out.println("Loai hang:"+"\n"+"1) Dien may"+"\n"+	"2) Sanh Su"+"\n"+	"3) Thuc Pham ");
        	System.out.println("Lua chon: "); 
            int loaiHang = scanner.nextInt();
			if (loaiHang == 1) {
				DienMay cur = headDienMay;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
				System.out.print("Chon hang ma ban muon sua theo thu tu tren xuong: "); 
                int hangthu = scanner.nextInt();
				cur = headDienMay;
				for (int i = 0; i < hangthu; i++) {
					cur = cur.next;
					cur.inTT();
					System.out.println("Hay sua lai thong tin");
					
					System.out.print("Ten hang:"); scanner.nextLine(); cur.name = scanner.nextLine();
					System.out.print("ID hang:");	cur.id = scanner.nextInt();
					System.out.print("Gia hang:"); cur.gia = scanner.nextFloat();
					System.out.print("Ngay nhap hang theo mau dd-MM-yyyy:");
					
					Date b = null;
					scanner.nextLine();
					String date = scanner.nextLine();
					try {
						//Parsing the String
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					cur.ngayNhapKho = b;
				}
			}
			
			if (loaiHang == 2) {
				SanhSu cur = headSanhSu;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
				System.out.print("Chon hang ma ban muon sua theo thu tu tren xuong 1 2 3: "); 
                int hangthu = scanner.nextInt();
				cur = headSanhSu;
				for (int i = 0; i < hangthu; i++) {
					cur = cur.next;
					cur.inTT();
					System.out.println("Hay sua lai thong tin");
					
					System.out.print("Ten hang:"); scanner.nextLine(); cur.name = scanner.nextLine();
					System.out.print("ID hang:");	cur.id = scanner.nextInt();
					System.out.print("Gia hang:"); cur.gia = scanner.nextFloat();
					System.out.print("Ngay nhap hang theo mau (dd-MM-yyyy):");
					
					Date b = null;
					String date = scanner.nextLine();
					try {
						//Parsing the String
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					cur.ngayNhapKho = b;
				}
			}
			
			if (loaiHang == 3) {
				ThucPham cur = headThucPham;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
				System.out.print("Chon hang ma ban muon sua theo thu tu tren xuong 1 2 3: "); 
                int hangthu = scanner.nextInt();
				cur = headThucPham;
				for (int i = 0; i < hangthu; i++) {
					cur = cur.next;
					cur.inTT();
					System.out.println("Hay sua lai thong tin");
					
					System.out.print("Ten hang:"); scanner.nextLine(); cur.name = scanner.nextLine();
					System.out.print("ID hang:");	cur.id = scanner.nextInt();
					System.out.print("Gia hang:"); cur.gia = scanner.nextFloat();
					System.out.print("Ngay nhap hang theo mau (dd-MM-yyyy):");
					
					Date b = null;
					scanner.nextLine();
					String date = scanner.nextLine();
					try {
						//Parsing the String
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					cur.ngayNhapKho = b;
				}
			}
		}else if (cachsua == 2) {
			System.out.print("Hay nhap id hang ban can sua: "); 
            int id = scanner.nextInt();
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM != null) {
				if (curDM.id == id) {
					curDM.inTT();
					System.out.println("Hay sua lai thong tin");
					System.out.print("Ten hang:"); 
					scanner.nextLine(); 
					curDM.name = scanner.nextLine();
					System.out.print("ID hang:");	
					curDM.id = scanner.nextInt();
					System.out.print("Gia hang:"); 
					curDM.gia = scanner.nextFloat();
					System.out.print("Ngay nhap hang theo mau (dd-MM-yyyy):");
					
					Date b = null;
					scanner.nextLine();
					String date = scanner.nextLine();
					try {
						//Parsing the String
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					curDM.ngayNhapKho = b;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS != null) {
				if (curSS.id == id) {
					curSS.inTT();
					System.out.println("Hay sua lai thong tin");
					System.out.print("Ten hang:"); 
					scanner.nextLine(); 
					curSS.name = scanner.nextLine();
					System.out.print("ID hang:");	
					curSS.id = scanner.nextInt();
					System.out.print("Gia hang:"); 
					curSS.gia = scanner.nextFloat();
					System.out.print("Ngay nhap hang theo mau (dd-MM-yyyy):");
					
					Date b = null;
					scanner.nextLine();
					String date = scanner.nextLine();
					try {
						//Parsing the String
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					curSS.ngayNhapKho = b;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.id == id) {
					curTP.inTT();
					System.out.println("Hay sua lai thong tin");
					System.out.print("Ten hang:"); scanner.nextLine(); curTP.name = scanner.nextLine();
					System.out.print("ID hang:");	curTP.id = scanner.nextInt();
					System.out.print("Gia hang:"); curTP.gia = scanner.nextFloat();
					System.out.print("Ngay nhap hang theo mau:");
					
					Date b = null;
					scanner.nextLine();
					String date = scanner.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					curTP.ngayNhapKho = b;
					return;
				}
				curTP = curTP.next;
			}
		}
	}
	
	int NhapId(Scanner scanner, int loaihang) {
		
		System.out.print("Hay nhap ID hang: ");
		int id = scanner.nextInt();
		
		if (loaihang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.id == id) {
					System.out.println("Id nay đa ton tai");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.id == id) {
					System.out.print("Id nay đa ton tai");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.id == id) {
					System.out.print("Id nay đa ton tai");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		return id;
	}
	
	public void InTT(){
		DienMay curDM = headDienMay;
		SanhSu curSS = headSanhSu;
		ThucPham curTP = headThucPham;
		
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
		System.out.println("Muon xoa theo cach nao");
		System.out.println("1) Theo Id"+"\n"+	"2) Theo ten"+"\n"+"3) Theo gia ");
        System.out.println("Lua chon: ");
		
		int cachxoa = scanner.nextInt();
		
		if (cachxoa == 1) {
			System.out.print("Hay nhap Id hang can xoa: ");
			int idCanXoa = scanner.nextInt();
			
			if (headDienMay.id == idCanXoa) {
				headDienMay = headDienMay.next;
				return;
			}
			
			if (headSanhSu.id == idCanXoa) {
				headSanhSu = headSanhSu.next;
				return;
			}
			
			if (headThucPham.id == idCanXoa) {
				headThucPham = headThucPham.next;
				return;
			}
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM.next != null) {
				if (curDM.next.id == idCanXoa) {
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS.next != null) {
				if (curSS.next.id == idCanXoa) {
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.next.id == idCanXoa) {
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Đa xoa");
		}
		
		if (cachxoa == 2) {
			System.out.print("Hay nhap ten hang can xoa: ");
			scanner.nextLine();
			String idCanXoa = scanner.nextLine();
			
			if (headDienMay.name.equalsIgnoreCase(idCanXoa)) {
				headDienMay = headDienMay.next;
				return;
			}
			
			
			
			if (headSanhSu.name.equalsIgnoreCase(idCanXoa)) {
				headSanhSu = headSanhSu.next;
				return;
			}
			
			if (headThucPham.name.equalsIgnoreCase(idCanXoa)) {
				headThucPham = headThucPham.next;
				return;
			}
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM.next != null) {
				if (curDM.next.name.equalsIgnoreCase(idCanXoa)) {
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS.next != null) {
				if (curSS.next.name.equalsIgnoreCase(idCanXoa)) {
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.next.name.equalsIgnoreCase(idCanXoa)) {
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Đã xóa");
		}

		if (cachxoa == 3) {
			System.out.println("Hay nhap gia hang can xoa"); 
			float giacanxoa = scanner.nextFloat();
			
			if (headDienMay.gia == giacanxoa) {
				headDienMay = headDienMay.next;
				return;
			}
			
			if (headSanhSu.gia == giacanxoa) {
				headSanhSu = headSanhSu.next;
				return;
			}
			
			if (headThucPham.gia == giacanxoa) {
				headThucPham = headThucPham.next;
				return;
			}
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM.next != null) {
				if (curDM.next.gia == giacanxoa) {
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS.next != null) {
				if (curSS.next.gia == giacanxoa) {
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.next.gia == giacanxoa) {
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Đa xoa");
		}
		
	}
	
	public void TimHang(Scanner scanner) {
		System.out.println("Muon tim hang theo cach nao");
		System.out.print("1) Theo loai"+"\n"+"2) Theo gia"+"\n"+"3) Theo ngay nhap");
        System.out.println("Lua chon: ");
		
		int cachtim = scanner.nextInt();
		
		
		if (cachtim == 1) {
			System.out.println("\nHay nhap Loai hang ban muon tim");
			System.out.print("1) Dien may"+"\n"+"2) Sanh su"	+"\n"+"3) Thuc pham");
            System.out.println("Lua chon: ");
			int loai = scanner.nextInt();
			
			if (loai == 1) {
				DienMay cur = headDienMay;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 2) {
				SanhSu cur = headSanhSu;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 3) {
				ThucPham cur = headThucPham;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}
			
			
		}else if (cachtim == 2) {
			System.out.print("Hay nhap khoang gia cua hang ban muon tim\n Khoang : ");
			float start = scanner.nextFloat();
			System.out.print("\n"+"Đen: ");
			float end = scanner.nextFloat();
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM != null) {
				if (curDM.gia >= start && curDM.gia <= end)
					curDM.inTT();
				curDM = curDM.next;
			}
			System.out.println();
			
			while (curSS != null) {
				if (curSS.gia >= start && curSS.gia <= end)
					curSS.inTT();
				curSS = curSS.next;
			}
			System.out.println();
			
			while (curTP != null) {
				if (curTP.gia >= start && curTP.gia <= end)
					curTP.inTT();
				curTP = curTP.next;
			}
			
		}else if (cachtim == 3) {
			System.out.println("Hay nhap khoang ngay nhap kho san pham ban muon tim (dd-MM-yyyy)\nTu ngay: ");
			scanner.nextLine();
			String date = scanner.nextLine();
			
			int count = 0;
			
			Date startDate;
			try {
				startDate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.err.println("Ban đa nhap sai mau ngay hay chon (Tim hang o Menu va thao tac lai)");
				return;
			}
			
			System.out.println("Đen ngay: ");
			Date endDate;
			try {
				endDate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.err.println("Ban đa nhap sai mau ngay hay chon (Tim hang o Menu va thao tac lai)");
				return;
			}
			
			DienMay curDM = headDienMay;
			while (curDM != null) {
				if (curDM.ngayNhapKho.compareTo(startDate) >= 0 && curDM.ngayNhapKho.compareTo(startDate) <= 0) {
					count++;
					curDM.inTT();
				}
				
				
				curDM = curDM.next;
			}
			
			if (count != 0) {
				count = 0;
				System.out.println();
			}
			
			SanhSu curSS = headSanhSu;
			while (curSS != null) {
				if (curSS.ngayNhapKho.compareTo(startDate) >= 0 && curSS.ngayNhapKho.compareTo(startDate) <= 0) {
					count++;
					curSS.inTT();
				}
				
				curSS = curSS.next;
			}
			
			if (count != 0) {
				count = 0;
				System.out.println();
			}
			
			ThucPham curTP = headThucPham;
			while (curTP != null) {
				if (curTP.ngayNhapKho.compareTo(startDate) >= 0 && curTP.ngayNhapKho.compareTo(startDate) <= 0) {
					count++;
					curTP.inTT();
				}
				
				curTP = curTP.next;
			}
		}
	}
	
	public void ThongKe(Scanner scanner) {
		int tongSLHang;
		int tongSLDienMay = 0;
		int tongSLSanhSu = 0;
		int tongSLThucPham = 0;
		
		float tongGiaTri = 0;
		float tongGiaTriDienMay = 0;
		float tongGiaTriSanhSu = 0;
		float tongGiaTriThucPham = 0;
		
		DienMay curDM = headDienMay;
		SanhSu curSS = headSanhSu;
		ThucPham curTP = headThucPham;
		
		while (curDM != null) {
			tongSLDienMay++;
			tongGiaTriDienMay += curDM.gia;
			curDM = curDM.next;
		}
		
		while (curSS != null) {
			tongSLSanhSu++;
			tongGiaTriSanhSu += curSS.gia;
			curSS = curSS.next;
		}
		
		while (curTP != null) {
			tongSLThucPham++;
			tongGiaTriThucPham += curTP.gia;
			curTP = curTP.next;
		}
		
		tongSLHang = tongSLDienMay + tongSLSanhSu + tongSLThucPham;
		tongGiaTri = tongGiaTriDienMay + tongGiaTriSanhSu + tongGiaTriThucPham;
		
		System.out.println("Tong so luong hang hoa trong kho: " + tongSLHang + " san pham");
		System.out.println("Tong gia tri nhap kho: " + tongGiaTri + "VND\n");
		
		System.out.println("Dien may co: " + tongSLDienMay + " san pham");
		System.out.println("Sanh su co: " + tongSLSanhSu + " san pham");
		System.out.println("Thuc pham co: " + tongSLThucPham + " san pham");
		
	}
	
	public void SapXep(Scanner scanner) {
		System.out.println("Ban muon sap xep theo?");
        System.out.println(" 1) Gia nhap"+"\n"+	"2) Ngay nhap ");
        System.out.println("Lua chon: "); 
        int luachon = scanner.nextInt();
		
		if (luachon == 1) {
			
		}else if (luachon == 2) {
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM != null) {
				
			}
			
		}else {
			System.out.println("Ban đa nhap sai\n");
			return;
		}
		
	}
}
