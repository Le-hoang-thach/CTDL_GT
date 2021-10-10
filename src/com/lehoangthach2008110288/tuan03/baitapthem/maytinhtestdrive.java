package com.lehoangthach2008110288.tuan03.baitapthem;

public class maytinhtestdrive {
    public static void main(String[] args) {
        Maytinh maytinh;
        maytinh = new Maytinh();
        
        maytinh.nhasanxuat = "Microsorft";
        maytinh.namsanxuat = "2020";
        maytinh.hedieuhanh = "Window 10";
        maytinh.ram = "32GB";
        maytinh.cpu = "Intel core i9 9800HQ";
        maytinh.gia = 50000000;
        maytinh.nambaohanh = "1 năm";

        maytinh.inThongTin();

        maytinh = new Maytinh("IBM", "1969", "window 11", "2 năm");
        System.out.println("\nNhà xản xuất: " + maytinh.nhasanxuat +" \nNăm sản xuất: "+maytinh.namsanxuat+" \nHệ Điều Hành: " +maytinh.hedieuhanh+"\nNăm bảo hành: "+maytinh.nambaohanh);

    }
}
