package com.lehoangthach2008110288.tuan01.tuan02.tuan03;

public class lad3 {
    public static void main(String[] args) {
        int size;   
        Scanner bienNhap = new Scanner(System.in);
         
        System.out.println("Nhập vào độ dài của mảng: ");
        size = bienNhap.nextInt();
         
       
        int[] array = new int[size];
         
       
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            array[i] = bienNhap.nextInt();   
        }
         
        // hiển thị giá trị các phần tử trong mảng
            for (int i = 0; i < size; i++) {
            System.out.println("Phần tử thứ " + i + ": " + array[i]);
        }
        int min = array[0];
        for(int i =0 ; i< size;i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Số nhỏ nhất là: " + min);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if(array[i] % 3 == 0){
                sum = sum + array[i];
            }
        }
        System.out.println("Trung bình cộng các số chia hết cho 3: " + sum);
    }
}
