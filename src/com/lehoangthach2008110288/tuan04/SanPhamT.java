package com.lehoangthach2008110288.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SanPham {
    static Scanner nhap = new Scanner(System.in);
    static ArrayList<SanPhamT> DSSP = new ArrayList<>();
    static double gia;

    public static void main(String[] args) {
        int luaChon;
        do {
            System.out.println("==========MENU==========");
            System.out.println(">>1. Nhập danh sách sản phẩm.");
            System.out.println(">>2. Sắp xếp tăng dần theo giá và xuất ra màn hình.");
            System.out.println(">>3. Tìm và xóa sản phẩm.");
            System.out.println(">>4. Xuất giá trung bình của các sản phẩm.");
            System.out.println(">>5.Thoát                         .");
            System.out.print("- Nhập vào sự lựa chọn(1->4): ");
            luaChon = nhap.nextInt();
            switch (luaChon) {
            case 1:
                nhap();
                break;
            case 2:
                sapXepVaXuat();
                break;
            case 3:
                timVaXoa();
                break;
            case 4:
                xuatGiaTriTB();
                break;
            case 5: 
                System.out.println("Cám ơn bạn đã sửa dụng ");
            default:
                System.out.println("Lựa chọn không hợp lệ!");
            }
           
            luaChon = nhap.nextInt();
        } while (luaChon != 5);

    }

    static void nhap() {
        int n;
        String tenSP;
        do {
            nhap.nextLine();
            System.out.print("Nhập tên sản phẩm: ");
            tenSP = nhap.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            gia = nhap.nextDouble();

            SanPhamT sp = new SanPhamT(tenSP, gia);
            DSSP.add(sp);
            System.out.print("nhập thêm:(1:yes/0:no): ");
            n = nhap.nextInt();
        } while (n == 1);

    }

    static void sapXepVaXuat() {
        Comparator<SanPhamT> comparator = new Comparator<SanPhamT>() {

            @Override
            public int compare(sanphamk o1, sanphamk o2) {

                return Double.compare(o1.gia, o2.gia);
            }

        };
        Collections.sort(DSSP, comparator);
        System.out.println("======Danh sách sản phâm sau khi sắp xếp======");
        for (sanphamk x : DSSP) {
            x.inThongTin();
        }

    }

    static void timVaXoa() {
        System.out.print("Nhập tên sản phẩm muốn xóa: ");
        nhap.nextLine();
        String ten = nhap.nextLine();
        for (sanphamk x : DSSP) {
            if ((x.tenSP).equals(ten)) {
                DSSP.remove(x);
                System.out.println("Xóa thành công!");
                break;
            }
        }
        System.out.println("======Danh sách sản phâm sau khi xóa======");
        for (sanphamk x : DSSP) {
            x.inThongTin();
        }
    }

    static void xuatGiaTriTB() {
        double tong = 0;
        for (sanphamk x : DSSP) {
            tong += x.gia;
        }
        System.out.println("Giá trị trung bình của các sản phẩm là: " + tong / DSSP.size());

    }

}
