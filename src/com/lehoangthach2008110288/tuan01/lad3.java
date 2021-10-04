package com.lehoangthach2008110288.tuan01;

import java.util.Scanner;

public class lad3 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        int canh,thetich;
        System.out.println("nhập cạnh của khối lập phương: ");
        canh = bienNhap.nextInt();
        thetich = canh*canh*canh;
        System.out.print("Thể tích: " + thetich);
    }
    }
}
