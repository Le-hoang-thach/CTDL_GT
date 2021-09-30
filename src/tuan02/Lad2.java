package tuan02;

import java.util.Scanner;

public class Lad2 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        double a,b,c,delta,x,x1,x2;
        System.out.print("Nhập a: ");
        a = bienNhap.nextDouble();
        System.out.print("Nhập b: ");
        b = bienNhap.nextDouble();
        System.out.print("Nhập c: ");
        c = bienNhap.nextDouble();
        delta = b*b - (4*a*c);
        if(delta < 0){
            System.out.print("Phương trình vô nghiệm");
        }else if(delta == 0){
            x = -b/(2*a);     
            System.out.print("Phương trình có nghiệm duy nhất: " + x);
        }else if(delta > 0){
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.print("Phương trình có hai nghiệm: " + "\n" + "x1 = " + x1  + "\n" + "x2 = " + x2);
        }
    }
}
