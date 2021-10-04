package com.lehoangthach2008110288.tuan03;

import java.util.Scanner;

public class lad1 {
    public static void main(String[] args) {
        boolean ok = true ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Nhập 1 số nguyên bất kì từ bàn phím : ");
        int n = input.nextInt();
        for(int i=2 ; i < n-1 ; i++){
            if( n%i == 0){
                ok = false ;
                break;
               }
            i++ ;
            
        }

        System.out.println(ok);
    }
}
