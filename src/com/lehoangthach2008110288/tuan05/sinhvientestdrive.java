package com.lehoangthach2008110288.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class sinhvientestdrive {
        static Scanner nhap = new Scanner(System.in);
        static ArrayList<sinhvien> DSSV = new ArrayList<>();

        public static void main(String[] args) {
                int chon;
                do {
                        System.out.println("==========MENU==========");
                        System.out.println(">>1. Nhập thông tin sinh viên.");
                        System.out.println(">>2. Xuất danh sách đã nhập.");
                        System.out.println(">>3. Xuất danh sách theo khoảng điểm.");
                        System.out.println(">>4. Tìm sinh viên.");
                        System.out.println(">>5. Tìm và sửa thông tin.");
                        System.out.println(">>6. Tìm và xóa thông tin.");
                        System.out.println(">>7. Kết thúc.");
                        System.out.print("- Nhập vào sự lựa chọn: ");
                        chon = nhap.nextInt();
                        switch (chon) {
                        case 1:
                                nhap();
                                break;
                        case 2:
                                xuatDS();
                                break;
                        case 3:
                                xuatTheoDiem();
                                break;
                        case 4:
                                tim();
                                break;
                        case 5:
                                timVaSua();
                                break;
                        case 6:
                                timVaXoa();
                                break;
                        case 7:
                                System.out.println("KẾT THÚC!");
                                break;
                        default:
                                System.out.println(" Lựa chọn không hợp lệ!");

                        }
                        System.out.print(" Quay lại MENU" + "\n" + "(1:yes/0:no): ");
                        chon = nhap.nextInt();
                } while (chon == 1);

        }

        static void nhap() {
                int chon;
                do {
                        System.out.println("- Nhập thông tin của sinh viên: ");
                        sinhvien sv = new sinhvien();
                        sv.nhapThongTin();
                        DSSV.add(sv);
                        System.out.print("Nhập thêm " + "\n" + "(1:yes/0:no): ");
                        chon = nhap.nextInt();
                        nhap.nextLine();
                } while (chon == 1);
        }

        static void xuatDS() {
                for (sinhvien x : DSSV) {
                        x.inThongTin();
                }
        }

        static void xuatTheoDiem() {
                System.out.print("- Nhập điểm min: ");
                double min = nhap.nextDouble();
                System.out.print("- Nhập điểm max: ");
                double max = nhap.nextDouble();
                System.out.println("-Danh sách sinh viên trong khoảng " + min + "đến" + max + "là: ");
                for (sinhvien x : DSSV) {
                        if (x.diemTB >= min && x.diemTB <= max) {
                                x.inThongTin();
                        }
                }
        }

        static void tim() {
                System.out.print("- Nhập họ tên sinh viên cần tìm: ");
                nhap.nextLine();
                String hoTen = nhap.nextLine();
                for (sinhvien x : DSSV) {
                        if (x.hoVaTen.contains(hoTen)) {
                                System.out.println("-----Thông tin sinh viên cần tìm-----");
                                x.inThongTin();
                        }
                }
        }

        static void timVaSua() {
                System.out.print("- Nhập tên sinh viên cần sửa điểm: ");
                nhap.nextLine();
                String hvt = nhap.nextLine();
                for (sinhvien x : DSSV) {
                        if (x.hoVaTen.contains(hvt)) {
                                System.out.print("  + Nhập điểm mới: ");
                                x.diemTB = nhap.nextDouble();
                                System.out.println("-----Sau khi sửa-----");
                                x.inThongTin();
                        }
                }
        }

        static void timVaXoa() {
                System.out.print("- Nhập tên sinh viên cần xóa: ");
                nhap.nextLine();
                String ht = nhap.nextLine();
                for (sinhvien x : DSSV) {
                        if (x.hoVaTen.equals(ht)) {
                                DSSV.remove(x);
                                System.out.println("- Xóa thành công!");
                                break;
                        }
                }

        }
}
