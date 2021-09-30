package tuan02;

import java.util.Scanner;

public class lad4 {
    public static void main(String[] args) {
        int luaChon;
        Scanner bienNhap = new Scanner(System.in);
        do{
            System.out.println("+=======MENU=======+");
            System.out.println("+>.1 Giải PT bậc 1 +");
            System.out.println("+>.2 Giải PT bậc 2 +");
            System.out.println("+>.3 Tính tiền điện+");
            System.out.println("+>.4 Thoát         +");
            System.out.println("+==================+");
            System.out.println("Mời bạn chọn số:");
            luaChon = bienNhap.nextInt();
            switch(luaChon){
                case 1 : ptBac1();break;
                case 2 : ptBac2();break;
                case 3 : tiendien();break;
                case 4 : System.out.println("Cám ơn đã sử dụng chương trình chúng tôi");break;
                default : System.out.println("Bạn chọn sai vui lòng chọn lại !!!");
            }
        }while( luaChon != 4);
    }
    static void ptBac1(){
        Scanner bienNhap = new Scanner(System.in);
        double a,b;
        System.out.print("Nhập a: ");
        a = bienNhap.nextDouble();
        System.out.print("Nhập b: ");
        b = bienNhap.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else 
            System.out.println("Phương trình vô nghiệm");
        }else 
        System.out.println("Phương trình có nghiệm : " + (-b/a));
    }
    static void ptBac2(){
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
    static void tiendien(){
        Scanner bienNhap = new Scanner(System.in);
        double soDien ,tien;
        System.out.print("Nhập vào số điện : ");
        soDien = bienNhap.nextDouble();
        if(soDien < 50){
            tien = soDien*1000;
            System.out.print("Số tiền cần trả : " + tien);
        }else {
            tien =  50*1000 + (soDien - 50)*1200;
            System.out.print("Số tiền cần trả : " + tien);
        }
    }
}
