package com.lehoangthach2008110288.tuan03;

import java.util.Scanner;

public class lad4 { 
    public static void main(String[] args) {
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
        double []b = new double[n];
        for(int i=0 ;i<n;i++){
            System.out.println("Nhập điểm sinh viên thứ " + i + " : ");
            b[i] = input.nextDouble();
        }
        for(int i =0;i<n;i++){
            if(b[i] < 5){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : yếu");
            }else if(5 <= b[i] && b[i] < 6.5){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : trung bình");
            }else if(6.5 <= b[i] && b[i] < 7.5){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : khá");
            }else if(7.5 <= b[i] && b[i] < 9){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : giỏi");
            }else if(9 <= b[i] && b[i] <= 10){
                System.out.println("họ và tên : " + a[i] + "\n" +"điểm : " + b[i] + "\n" +"học lực : Xuất sắc");
            }
        }
    }
}
