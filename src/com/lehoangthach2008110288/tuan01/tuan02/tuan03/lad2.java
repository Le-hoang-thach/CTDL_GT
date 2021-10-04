package com.lehoangthach2008110288.tuan01.tuan02.tuan03;

public class lad2 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        int  n;
        System.out.print("Nhập bảng cửu chương bảng muốn coi: ");
        n =  bienNhap.nextInt();
        for(int i = 0 ; i < 11;i++ ){
            System.out.print(n + " x " + i +" = " + (n*i) + "\n");
        }
    }
}
