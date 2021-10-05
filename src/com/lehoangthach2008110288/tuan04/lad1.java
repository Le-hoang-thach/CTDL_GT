package com.lehoangthach2008110288.tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class lad1 {
    public static void main(String[] args) {
        int n ;
        double number , sum = 0;
        ArrayList<Double> arrListDouble = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử : ");
        n = input.nextInt();
        for(int i =0 ;i<n;i++){
            System.out.println("Nhập phần tử thứ " + i + " : ");
            number = input.nextDouble();
            arrListDouble.add(number);
        }
        for(double element : arrListDouble){
            sum += element;
        }
        System.out.println("Tổng các phần tử trong Arrylist = " + sum);

    }
}
