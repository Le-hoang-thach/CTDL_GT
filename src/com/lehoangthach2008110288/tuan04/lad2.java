package com.lehoangthach2008110288.tuan04;

import java.util.Scanner;

public class lad2 {
    public static void main(String[] args) {
        int luachon;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("+==================MENU================+");
            System.out.println("+>1. Nhập danh sách họ và tên          +");
            System.out.println("+>2. Xuất danh sách vừa nhập           +");
            System.out.println("+>3. Xuất danh sách ngẫu nhiên         +");
            System.out.println("+>4. Sắp xếp giảm dần và xuất danh sách+");
            System.out.println("+>5. Tìm và xóa họ tên nhập từ bàn phím+");
            System.out.println("+>6. Kết thúc                          +");
            System.out.println(">>Mời bạn lựa chọn : ");
            luachon = input.nextInt();
            switch(luachon){
                case 1: hovaten();break;
                case 2: xuatten();break;
            }
        }while(luachon != 6);
    }
    static void hovaten(){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lương sinh viên cần thêm : ");
        n = input.nextInt();
        String []a = new String[n];
        for(int i=0 ;i<n;i++){
            System.out.println("Họ và tên học sinh thứ " + i + " : ");
            input.nextLine();
            a[i] = input.nextLine();
        }
    }
    
}
