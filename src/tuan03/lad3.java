package tuan03;

import java.util.Scanner;

public class lad3 {
    public static void main(String[] args) {
        int size;   
        Scanner bienNhap = new Scanner(System.in);
         
        System.out.println("Nhập vào độ dài của mảng: ");
        size = bienNhap.nextInt();
         
        // khai báo và cấp phát bộ nhớ cho mảng
        // mảng này có tên là array và kích thước = size
        int[] array = new int[size];
         
        // array.length: trả về kích thước của mảng
        // vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            array[i] = bienNhap.nextInt();   // nhập giá trị cho phần tử
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