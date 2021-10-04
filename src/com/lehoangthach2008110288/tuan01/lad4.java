package com.lehoangthach2008110288.tuan01;

public class lad4 {
    public static void main(String[] args) {
        double a,b,c ;
        double delta;
        Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = bienNhap.nextDouble();
        System.out.print("Nhập b: ");
        b = bienNhap.nextDouble();
        System.out.print("nhập c: ");
        c = bienNhap.nextDouble();
        delta = b*b - 4*a*c;
        double candelta = Math.sqrt(delta);
        System.out.println("Delta : " + delta );
        System.out.println("Căn delta: " + candelta);
    }
}
