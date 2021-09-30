package tuan03;

import java.util.Scanner;

public class lad1 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        int n;
        System.out.print("Nhập một số để kiểm tra nguyên tố: ");
        n = bienNhap.nextInt();
        int count = 0;
        if(n <2){
            System.out.print(n + " không phải số nguyên tố");
        }else
            {
                for(int i =2 ;i < n ;i++){
                    if(n % i == 0){
                        count ++;
                    }
                }
                    if(count == 0){
                        System.out.print(n + " là số nguyên tố");
                        }else {
                            System.out.print(n + " không phải số nguyên tố");
            }
            }
    }
}
